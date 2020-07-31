/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.rbac.domain.tables;


import cn.vertxup.rbac.domain.Db;
import cn.vertxup.rbac.domain.Indexes;
import cn.vertxup.rbac.domain.Keys;
import cn.vertxup.rbac.domain.tables.records.SVisitantRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;


/**
 * This class is generated by jOOQ.
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.10.8"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class SVisitant extends TableImpl<SVisitantRecord> {

    /**
     * The reference instance of <code>DB_ETERNAL.S_VISITANT</code>
     */
    public static final SVisitant S_VISITANT = new SVisitant();
    private static final long serialVersionUID = 575263195;
    /**
     * The column <code>DB_ETERNAL.S_VISITANT.KEY</code>. 「key」- 限定记录ID
     */
    public final TableField<SVisitantRecord, String> KEY = createField("KEY", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 限定记录ID");
    /**
     * The column <code>DB_ETERNAL.S_VISITANT.VIEW_ID</code>. 「viewId」- 视图访问者的读ID
     */
    public final TableField<SVisitantRecord, String> VIEW_ID = createField("VIEW_ID", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「viewId」- 视图访问者的读ID");
    /**
     * The column <code>DB_ETERNAL.S_VISITANT.PHASE</code>. 「phase」- 作用周期
     */
    public final TableField<SVisitantRecord, String> PHASE = createField("PHASE", org.jooq.impl.SQLDataType.VARCHAR(64), this, "「phase」- 作用周期");
    /**
     * The column <code>DB_ETERNAL.S_VISITANT.TYPE</code>. 「type」- 访问者类型
     */
    public final TableField<SVisitantRecord, String> TYPE = createField("TYPE", org.jooq.impl.SQLDataType.VARCHAR(128), this, "「type」- 访问者类型");
    /**
     * The column <code>DB_ETERNAL.S_VISITANT.IDENTIFIER</code>. 「identifier」- 动态类型中的模型ID
     */
    public final TableField<SVisitantRecord, String> IDENTIFIER = createField("IDENTIFIER", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「identifier」- 动态类型中的模型ID");
    /**
     * The column <code>DB_ETERNAL.S_VISITANT.CONFIG_KEY</code>. 「configKey」- 模型下记录对应的ID，一般是配置的ID
     */
    public final TableField<SVisitantRecord, String> CONFIG_KEY = createField("CONFIG_KEY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「configKey」- 模型下记录对应的ID，一般是配置的ID");
    /**
     * The column <code>DB_ETERNAL.S_VISITANT.ACL_VISIBLE</code>. 「aclVisible」- 可见的属性集
     */
    public final TableField<SVisitantRecord, String> ACL_VISIBLE = createField("ACL_VISIBLE", org.jooq.impl.SQLDataType.CLOB, this, "「aclVisible」- 可见的属性集");
    /**
     * The column <code>DB_ETERNAL.S_VISITANT.ACL_VIEW</code>. 「aclView」- 只读的属性集
     */
    public final TableField<SVisitantRecord, String> ACL_VIEW = createField("ACL_VIEW", org.jooq.impl.SQLDataType.CLOB, this, "「aclView」- 只读的属性集");
    /**
     * The column <code>DB_ETERNAL.S_VISITANT.ACL_VARIETY</code>. 「aclVariety」- 多样性的属性集，用于控制集合类型的属性
     */
    public final TableField<SVisitantRecord, String> ACL_VARIETY = createField("ACL_VARIETY", org.jooq.impl.SQLDataType.CLOB, this, "「aclVariety」- 多样性的属性集，用于控制集合类型的属性");
    /**
     * The column <code>DB_ETERNAL.S_VISITANT.ACL_VOW</code>. 「aclVow」- 引用类属性集
     */
    public final TableField<SVisitantRecord, String> ACL_VOW = createField("ACL_VOW", org.jooq.impl.SQLDataType.CLOB, this, "「aclVow」- 引用类属性集");
    /**
     * The column <code>DB_ETERNAL.S_VISITANT.ACL_VERGE</code>. 「aclVerge」- 依赖属性集
     */
    public final TableField<SVisitantRecord, String> ACL_VERGE = createField("ACL_VERGE", org.jooq.impl.SQLDataType.CLOB, this, "「aclVerge」- 依赖属性集");
    /**
     * The column <code>DB_ETERNAL.S_VISITANT.SIGMA</code>. 「sigma」- 用户组绑定的统一标识
     */
    public final TableField<SVisitantRecord, String> SIGMA = createField("SIGMA", org.jooq.impl.SQLDataType.VARCHAR(128), this, "「sigma」- 用户组绑定的统一标识");
    /**
     * The column <code>DB_ETERNAL.S_VISITANT.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<SVisitantRecord, String> LANGUAGE = createField("LANGUAGE", org.jooq.impl.SQLDataType.VARCHAR(10), this, "「language」- 使用的语言");
    /**
     * The column <code>DB_ETERNAL.S_VISITANT.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<SVisitantRecord, Boolean> ACTIVE = createField("ACTIVE", org.jooq.impl.SQLDataType.BIT, this, "「active」- 是否启用");
    /**
     * The column <code>DB_ETERNAL.S_VISITANT.METADATA</code>. 「metadata」- 附加配置数据
     */
    public final TableField<SVisitantRecord, String> METADATA = createField("METADATA", org.jooq.impl.SQLDataType.CLOB, this, "「metadata」- 附加配置数据");
    /**
     * The column <code>DB_ETERNAL.S_VISITANT.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public final TableField<SVisitantRecord, LocalDateTime> CREATED_AT = createField("CREATED_AT", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "「createdAt」- 创建时间");
    /**
     * The column <code>DB_ETERNAL.S_VISITANT.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public final TableField<SVisitantRecord, String> CREATED_BY = createField("CREATED_BY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");
    /**
     * The column <code>DB_ETERNAL.S_VISITANT.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public final TableField<SVisitantRecord, LocalDateTime> UPDATED_AT = createField("UPDATED_AT", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "「updatedAt」- 更新时间");
    /**
     * The column <code>DB_ETERNAL.S_VISITANT.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public final TableField<SVisitantRecord, String> UPDATED_BY = createField("UPDATED_BY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    /**
     * Create a <code>DB_ETERNAL.S_VISITANT</code> table reference
     */
    public SVisitant() {
        this(DSL.name("S_VISITANT"), null);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.S_VISITANT</code> table reference
     */
    public SVisitant(String alias) {
        this(DSL.name(alias), S_VISITANT);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.S_VISITANT</code> table reference
     */
    public SVisitant(Name alias) {
        this(alias, S_VISITANT);
    }

    private SVisitant(Name alias, Table<SVisitantRecord> aliased) {
        this(alias, aliased, null);
    }

    private SVisitant(Name alias, Table<SVisitantRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SVisitantRecord> getRecordType() {
        return SVisitantRecord.class;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Db.DB_ETERNAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.S_VISITANT_IDXM_S_VISITANT_VIEW_ID_TYPE_CONFIG, Indexes.S_VISITANT_IDXM_S_VISITANT_VIEW_ID_TYPE_IDENTIFIER, Indexes.S_VISITANT_PRIMARY, Indexes.S_VISITANT_VIEW_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SVisitantRecord> getPrimaryKey() {
        return Keys.KEY_S_VISITANT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SVisitantRecord>> getKeys() {
        return Arrays.<UniqueKey<SVisitantRecord>>asList(Keys.KEY_S_VISITANT_PRIMARY, Keys.KEY_S_VISITANT_VIEW_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SVisitant as(String alias) {
        return new SVisitant(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SVisitant as(Name alias) {
        return new SVisitant(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SVisitant rename(String name) {
        return new SVisitant(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SVisitant rename(Name name) {
        return new SVisitant(name, null);
    }
}
