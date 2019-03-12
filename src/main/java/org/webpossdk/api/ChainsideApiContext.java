package org.webpossdk.api;

import com.sdkboilerplate.exceptions.ConfigurationException;
import com.sdkboilerplate.lib.ApiContext;
import org.webpossdk.lib.CacheAdapterFactory;

import java.util.HashMap;

public class ChainsideApiContext extends ApiContext {
    public ChainsideApiContext(HashMap<String, Object> config) throws ConfigurationException {
        super(Hostnames.get(config.get("mode").toString()), ChainsideApiContext.fillConfig(config), CacheAdapterFactory.make(config.getOrDefault("cacheDriver", "2k").toString()));

    }

    private static HashMap<String, Object> fillConfig(HashMap<String, Object> config) {
        config.putIfAbsent("version", "v1");
        config.putIfAbsent("accessTokenKey", "___chainside.access.token___");
        config.putIfAbsent("timeout", 10);
        config.putIfAbsent("verifySSL", true);
        config.putIfAbsent("cacheDriver", "2k");
        return config;

    }
}
