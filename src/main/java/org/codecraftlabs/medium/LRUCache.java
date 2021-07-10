package org.codecraftlabs.medium;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LRUCache {
    private final int capacity;
    private final Map<Integer, Integer> cache;
    private final LinkedList<Integer> keyUses;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();
        this.keyUses = new LinkedList<>();
    }

    public int get(int key) {
        if (!cache.containsKey(key)) {
            return -1;
        }

        reshuffleKey(key);
        return cache.get(key);
    }

    public void put(int key, int value) {
        reshuffleKey(key);
        if (cache.size() >= capacity) {
            // Returns the last element from the list
            Integer lruKey = keyUses.getLast();
            cache.remove(lruKey);
            keyUses.remove(lruKey);
        }
        cache.put(key, value);
    }

    private void reshuffleKey(int key) {
        if (keyUses.contains(key)) {
            keyUses.remove((Integer) key);
        }
        keyUses.addFirst(key);
    }
}
