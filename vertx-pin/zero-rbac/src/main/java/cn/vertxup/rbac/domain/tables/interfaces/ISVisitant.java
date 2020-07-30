/*
 * This file is generated by jOOQ.
*/
package cn.vertxup.rbac.domain.tables.interfaces;


import java.io.Serializable;
import java.time.LocalDateTime;

import javax.annotation.Generated;


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
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface ISVisitant extends Serializable {

    /**
     * Setter for <code>DB_ETERNAL.S_VISITANT.KEY</code>. 「key」- 限定记录ID
     */
    public ISVisitant setKey(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_VISITANT.KEY</code>. 「key」- 限定记录ID
     */
    public String getKey();

    /**
     * Setter for <code>DB_ETERNAL.S_VISITANT.VIEW_ID</code>. 「viewId」- 视图访问者的读ID
     */
    public ISVisitant setViewId(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_VISITANT.VIEW_ID</code>. 「viewId」- 视图访问者的读ID
     */
    public String getViewId();

    /**
     * Setter for <code>DB_ETERNAL.S_VISITANT.TYPE</code>. 「type」- 访问者类型
     */
    public ISVisitant setType(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_VISITANT.TYPE</code>. 「type」- 访问者类型
     */
    public String getType();

    /**
     * Setter for <code>DB_ETERNAL.S_VISITANT.IDENTIFIER</code>. 「identifier」- 动态类型中的模型ID
     */
    public ISVisitant setIdentifier(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_VISITANT.IDENTIFIER</code>. 「identifier」- 动态类型中的模型ID
     */
    public String getIdentifier();

    /**
     * Setter for <code>DB_ETERNAL.S_VISITANT.CONFIG_KEY</code>. 「configKey」- 模型下记录对应的ID，一般是配置的ID
     */
    public ISVisitant setConfigKey(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_VISITANT.CONFIG_KEY</code>. 「configKey」- 模型下记录对应的ID，一般是配置的ID
     */
    public String getConfigKey();

    /**
     * Setter for <code>DB_ETERNAL.S_VISITANT.ACL_VISIBLE</code>. 「aclVisible」- 可见的属性集
     */
    public ISVisitant setAclVisible(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_VISITANT.ACL_VISIBLE</code>. 「aclVisible」- 可见的属性集
     */
    public String getAclVisible();

    /**
     * Setter for <code>DB_ETERNAL.S_VISITANT.ACL_VIEW</code>. 「aclView」- 只读的属性集
     */
    public ISVisitant setAclView(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_VISITANT.ACL_VIEW</code>. 「aclView」- 只读的属性集
     */
    public String getAclView();

    /**
     * Setter for <code>DB_ETERNAL.S_VISITANT.ACL_VARIETY</code>. 「aclVariety」- 多样性的属性集，用于控制集合类型的属性
     */
    public ISVisitant setAclVariety(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_VISITANT.ACL_VARIETY</code>. 「aclVariety」- 多样性的属性集，用于控制集合类型的属性
     */
    public String getAclVariety();

    /**
     * Setter for <code>DB_ETERNAL.S_VISITANT.ACL_VARIETY_CONFIG</code>. 「aclVarietyConfig」- 多样性的属性集相关配置
     */
    public ISVisitant setAclVarietyConfig(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_VISITANT.ACL_VARIETY_CONFIG</code>. 「aclVarietyConfig」- 多样性的属性集相关配置
     */
    public String getAclVarietyConfig();

    /**
     * Setter for <code>DB_ETERNAL.S_VISITANT.ACL_VOW</code>. 「aclVow」- 引用类属性集
     */
    public ISVisitant setAclVow(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_VISITANT.ACL_VOW</code>. 「aclVow」- 引用类属性集
     */
    public String getAclVow();

    /**
     * Setter for <code>DB_ETERNAL.S_VISITANT.ACL_VOW_CONFIG</code>. 「aclVowConfig」- 引用类属性集相关配置
     */
    public ISVisitant setAclVowConfig(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_VISITANT.ACL_VOW_CONFIG</code>. 「aclVowConfig」- 引用类属性集相关配置
     */
    public String getAclVowConfig();

    /**
     * Setter for <code>DB_ETERNAL.S_VISITANT.ACL_DEPEND</code>. 「aclDepend」- 依赖属性集
     */
    public ISVisitant setAclDepend(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_VISITANT.ACL_DEPEND</code>. 「aclDepend」- 依赖属性集
     */
    public String getAclDepend();

    /**
     * Setter for <code>DB_ETERNAL.S_VISITANT.ACL_DEPEND_CONFIG</code>. 「aclDependConfig」- 依赖属性集配置
     */
    public ISVisitant setAclDependConfig(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_VISITANT.ACL_DEPEND_CONFIG</code>. 「aclDependConfig」- 依赖属性集配置
     */
    public String getAclDependConfig();

    /**
     * Setter for <code>DB_ETERNAL.S_VISITANT.SIGMA</code>. 「sigma」- 用户组绑定的统一标识
     */
    public ISVisitant setSigma(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_VISITANT.SIGMA</code>. 「sigma」- 用户组绑定的统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>DB_ETERNAL.S_VISITANT.LANGUAGE</code>. 「language」- 使用的语言
     */
    public ISVisitant setLanguage(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_VISITANT.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>DB_ETERNAL.S_VISITANT.ACTIVE</code>. 「active」- 是否启用
     */
    public ISVisitant setActive(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.S_VISITANT.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>DB_ETERNAL.S_VISITANT.METADATA</code>. 「metadata」- 附加配置数据
     */
    public ISVisitant setMetadata(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_VISITANT.METADATA</code>. 「metadata」- 附加配置数据
     */
    public String getMetadata();

    /**
     * Setter for <code>DB_ETERNAL.S_VISITANT.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public ISVisitant setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.S_VISITANT.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>DB_ETERNAL.S_VISITANT.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public ISVisitant setCreatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_VISITANT.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>DB_ETERNAL.S_VISITANT.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public ISVisitant setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.S_VISITANT.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>DB_ETERNAL.S_VISITANT.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public ISVisitant setUpdatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_VISITANT.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public String getUpdatedBy();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface ISVisitant
     */
    public void from(cn.vertxup.rbac.domain.tables.interfaces.ISVisitant from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface ISVisitant
     */
    public <E extends cn.vertxup.rbac.domain.tables.interfaces.ISVisitant> E into(E into);

    default ISVisitant fromJson(io.vertx.core.json.JsonObject json) {
        setKey(json.getString("KEY"));
        setViewId(json.getString("VIEW_ID"));
        setType(json.getString("TYPE"));
        setIdentifier(json.getString("IDENTIFIER"));
        setConfigKey(json.getString("CONFIG_KEY"));
        setAclVisible(json.getString("ACL_VISIBLE"));
        setAclView(json.getString("ACL_VIEW"));
        setAclVariety(json.getString("ACL_VARIETY"));
        setAclVarietyConfig(json.getString("ACL_VARIETY_CONFIG"));
        setAclVow(json.getString("ACL_VOW"));
        setAclVowConfig(json.getString("ACL_VOW_CONFIG"));
        setAclDepend(json.getString("ACL_DEPEND"));
        setAclDependConfig(json.getString("ACL_DEPEND_CONFIG"));
        setSigma(json.getString("SIGMA"));
        setLanguage(json.getString("LANGUAGE"));
        setActive(json.getBoolean("ACTIVE"));
        setMetadata(json.getString("METADATA"));
        // Omitting unrecognized type java.time.LocalDateTime for column CREATED_AT!
        setCreatedBy(json.getString("CREATED_BY"));
        // Omitting unrecognized type java.time.LocalDateTime for column UPDATED_AT!
        setUpdatedBy(json.getString("UPDATED_BY"));
        return this;
    }


    default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("KEY",getKey());
        json.put("VIEW_ID",getViewId());
        json.put("TYPE",getType());
        json.put("IDENTIFIER",getIdentifier());
        json.put("CONFIG_KEY",getConfigKey());
        json.put("ACL_VISIBLE",getAclVisible());
        json.put("ACL_VIEW",getAclView());
        json.put("ACL_VARIETY",getAclVariety());
        json.put("ACL_VARIETY_CONFIG",getAclVarietyConfig());
        json.put("ACL_VOW",getAclVow());
        json.put("ACL_VOW_CONFIG",getAclVowConfig());
        json.put("ACL_DEPEND",getAclDepend());
        json.put("ACL_DEPEND_CONFIG",getAclDependConfig());
        json.put("SIGMA",getSigma());
        json.put("LANGUAGE",getLanguage());
        json.put("ACTIVE",getActive());
        json.put("METADATA",getMetadata());
        // Omitting unrecognized type java.time.LocalDateTime for column CREATED_AT!
        json.put("CREATED_BY",getCreatedBy());
        // Omitting unrecognized type java.time.LocalDateTime for column UPDATED_AT!
        json.put("UPDATED_BY",getUpdatedBy());
        return json;
    }

}
