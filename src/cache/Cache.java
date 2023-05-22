package cache;

import java.util.HashMap;
import java.util.Map;

public class Cache {
    
    private Map<String, Object> cache;

    public Cache() {
        cache = new HashMap<>();
    }

    
    public synchronized void addToCache(String key, Object value) {
        cache.put(key, value);
    }

    public synchronized Object getFromCache(String key) {
        return cache.get(key);
    }

    public synchronized boolean containsKey(String key) {
        return cache.containsKey(key);
    }

    public synchronized void removeFromCache(String key) {
        cache.remove(key);
    }
}
