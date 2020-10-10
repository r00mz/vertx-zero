package io.vertx.tp.plugin.cache.hit;

import io.vertx.core.Future;
import io.vertx.core.Vertx;
import io.vertx.core.eventbus.EventBus;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.tp.plugin.cache.l1.L1Cache;
import io.vertx.tp.plugin.cache.l1.L1Config;
import io.vertx.up.eon.em.ChangeFlag;
import io.vertx.up.log.Annal;
import io.vertx.up.util.Ut;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * @author <a href="http://www.origin-x.cn">lang</a>
 * Abstract class for uniform processing for L1 cache
 */
public abstract class AbstractL1 implements L1Cache {
    protected transient Vertx vertx;
    protected transient L1Config config;

    /*
     * vertxRef reference for
     */
    @Override
    public L1Cache bind(final L1Config config) {
        this.config = config;
        return this;
    }

    @Override
    public L1Cache bind(final Vertx vertx) {
        this.vertx = vertx;
        return this;
    }

    /*
     * Refresh will send data to event bus
     * Publish / Consume mode for cache data processing
     * Actual the cache will be deleted
     */
    @Override
    public <T> void write(final CMessage message, final ChangeFlag flag) {
        /*
         * Address processing
         */
        final String address = this.config.getAddress();
        if (Ut.notNil(address)) {
            final EventBus eventBus = this.vertx.eventBus();
            /*
             * Delivery Message extraction
             */
            eventBus.publish(address, message.dataDelivery(flag));
        }
    }

    @Override
    public <T> Future<T> readAsync(final CMessage message) {
        // Get key
        final String uk = message.dataUnique();
        return this.readCacheAsync(uk).compose(response ->
                /*
                 * Future<T> returned
                 */
                Future.succeededFuture(this.deserialize(response, message.dataType())));
    }

    @Override
    public <T> T read(final CMessage message) {
        // Get key
        final String uk = message.dataUnique();
        final Object response = this.readCache(uk);
        return this.deserialize(response, message.dataType());
    }

    @SuppressWarnings("all")
    private <T> T deserialize(final Object response, final Class<?> dataType) {
        if (Objects.isNull(response)) {
            return null;
        } else {
            final T ret;
            if (response instanceof JsonObject) {
                ret = (T) Ut.deserialize((JsonObject) response, dataType);
            } else if (response instanceof JsonArray) {
                /*
                 * Combine single and multi
                 */
                final List resultList = new ArrayList();
                Ut.itJArray((JsonArray) response).forEach(json -> {
                    resultList.add(Ut.deserialize(json, dataType));
                });
                ret = (T) resultList;
            } else {
                ret = null;
            }
            return ret;
        }
    }

    protected Annal logger() {
        return Annal.get(this.getClass());
    }

    public abstract <T> Future<T> readCacheAsync(String key);

    public abstract <T> T readCache(String key);
}
