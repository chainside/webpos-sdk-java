package org.webpossdk.api;

import com.sdkboilerplate.cache.CacheAdapter;
import com.sdkboilerplate.exceptions.ConfigurationException;
import com.sdkboilerplate.lib.ApiContext;
import org.webpossdk.lib.CacheAdapterFactory;

import java.util.HashMap;

public class ChainsideApiContext extends ApiContext {
    public ChainsideApiContext(HashMap<String, Object> config) throws ConfigurationException {
        super(Hostnames.get(config.get("mode").toString()), config, CacheAdapterFactory.make(config.get("cacheDriver").toString()));

    }
}
