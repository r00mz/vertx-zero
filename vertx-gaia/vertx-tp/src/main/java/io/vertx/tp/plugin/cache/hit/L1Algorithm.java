package io.vertx.tp.plugin.cache.hit;

import io.vertx.core.json.JsonObject;

import java.util.TreeMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @author <a href="http://www.origin-x.cn">lang</a>
 * Split data for SINGLE/MULTI
 */
public interface L1Algorithm {
    String FIELD_DATA = "data";
    String FIELD_CONDITION = "condition";
    String FIELD_TYPE = "type";
    String FIELD_REFER = "refer";
    String FIELD_KEY = "key";

    String CACHE_DATA = "DATA";
    String CACHE_DATA_REF = "DATA_REF";
    String CACHE_DATA_TREE = "DATA_TREE";

    String CNODE_RECORD = "RECORD";
    String CNODE_LIST = "LIST";

    /*
     * Common usage to generate cache key
     * 1) treeMap is native method in lower
     * 2) condition is high level method for data unique
     * This api is called by `CMessage` object purely
     */
    String dataKey(String type, TreeMap<String, String> treeMap);

    String dataKey(String type, JsonObject condition);

    /*
     * Phase 2: Cache Data Generation
     */
    ConcurrentMap<String, Object> dataCache(JsonObject jsonBody);

    /*
     * Phase 3: Cache Data Tree Generation
     */
    ConcurrentMap<String, Object> dataKey(JsonObject jsonBody);
}