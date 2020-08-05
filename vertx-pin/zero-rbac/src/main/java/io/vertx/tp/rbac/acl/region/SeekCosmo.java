package io.vertx.tp.rbac.acl.region;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.tp.rbac.cv.em.AclTime;
import io.vertx.up.commune.Envelop;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;

import java.util.Objects;

/**
 * @author <a href="http://www.origin-x.cn">lang</a>
 */
public class SeekCosmo implements Cosmo {
    @Override
    public Future<Envelop> before(final Envelop request, final JsonObject matrix) {
        final JsonObject seeker = matrix.getJsonObject("seeker");
        final String component = seeker.getString("component");
        if (Ut.notNil(component)) {
            final Cosmo external = Ut.singleton(component);
            return external.before(request, matrix);
        } else {
            if (Ut.isNil(seeker)) {
                /* Projection Modification */
                DataIn.visitProjection(request, matrix);
                /* Criteria Modification */
                DataIn.visitCriteria(request, matrix);
                return Ux.future(request);
            } else {
                /* Before calling and will capture `BEFORE` syntax */
                return DataAcl.visitAcl(request, matrix, AclTime.BEFORE).compose(acl -> {
                    request.acl(acl);
                    /* Projection Modification */
                    DataIn.visitProjection(request, matrix);
                    /* Criteria Modification */
                    DataIn.visitCriteria(request, matrix);
                    return Ux.future(request);
                });
            }
        }
    }

    @Override
    public Future<Envelop> after(final Envelop response, final JsonObject matrix) {
        final JsonObject seeker = matrix.getJsonObject("seeker");
        final String component = seeker.getString("component");
        if (Ut.notNil(component)) {
            final Cosmo external = Ut.singleton(component);
            return external.after(response, matrix);
        } else {
            /* After calling and will capture `AFTER` syntax */
            return DataAcl.visitAcl(response, matrix, AclTime.AFTER).compose(acl -> {
                response.acl(acl);
                /* Projection */
                DataOut.dwarfRecord(response, matrix);
                /* Rows */
                DataOut.dwarfRows(response, matrix);
                /* Projection For Array */
                DataOut.dwarfCollection(response, matrix);
                /*
                 * Append data of `acl` into description for future usage
                 * This feature is ok when AclPhase = DELAY because the EAGER
                 * will impact our current request response directly.
                 *
                 * But this node should returned all critical data
                 * 1) access, The fields that you could visit
                 * 2) edition, The fields that you could edit
                 * 3) record, The fields of all current record
                 */
                if (Objects.nonNull(acl)) {
                    final JsonObject aclData = acl.acl();
                    response.attach("acl", aclData);
                }
                return Ux.future(response);
            }).otherwise(Ux.otherwise());
        }
    }
}
