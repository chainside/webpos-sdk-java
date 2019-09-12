package net.webpossdk.lib;

import it.sdkboilerplate.cache.CacheAdapter;

import java.util.HashMap;


public class MemoryCacheAdapter extends CacheAdapter {
    private HashMap<String, String> cache;

    @Override
    public String get(String value) {
        return this.cache.get(value);
    }

    @Override
    public void set(String key, String value) {
        this.cache.put(key, value);
    }

    @Override
    public void delete(String key) {
        this.cache.remove(key);
    }

    public MemoryCacheAdapter() {
        this.cache = new HashMap();
    }
}
