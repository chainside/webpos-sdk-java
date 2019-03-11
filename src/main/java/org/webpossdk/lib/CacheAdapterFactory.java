package org.webpossdk.lib;

import com.sdkboilerplate.cache.CacheAdapter;

public class CacheAdapterFactory {
    public static CacheAdapter make(String type) {
        return new TwoKCacheAdapter();
    }
}
