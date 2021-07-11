package org.codecraftlabs.medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class LRUCacheTest {
    private LRUCache lruCache;

    @BeforeEach
    public void setup() {
        this.lruCache = new LRUCache(2);
    }

    @Test
    public void nonExistingKeyCase() {
        assertThat(lruCache.get(1), is(-1));
    }

    @Test
    public void regularUse() {
        lruCache.put(3, 3);
        lruCache.put(2, 2);
        assertThat(lruCache.get(3), is(3));
        assertThat(lruCache.get(2), is(2));
    }

    @Test
    public void removeLeastRecentlyUsedIndex() {
        lruCache.put(3, 3);
        lruCache.put(2, 2);
        lruCache.put(1, 1);
        assertThat(lruCache.get(3), is(-1));
        assertThat(lruCache.get(2), is(2));
        assertThat(lruCache.get(1), is(1));
    }

    @Test
    public void removeLeastRecentlyUsedIndexMoreItems() {
        lruCache.put(3, 3);
        lruCache.put(2, 2);
        lruCache.put(1, 1);
        lruCache.put(0, 0);

        assertThat(lruCache.get(3), is(-1));
        assertThat(lruCache.get(2), is(-1));
        assertThat(lruCache.get(1), is(1));
        assertThat(lruCache.get(0), is(0));
    }

    @Test
    public void leetcodeSampleTest() {
        assertThat(lruCache.get(2), is(-1));
        lruCache.put(2, 6);
        assertThat(lruCache.get(1), is(-1));
        lruCache.put(1, 5);
        lruCache.put(1, 2);
        assertThat(lruCache.get(1), is(2));
        assertThat(lruCache.get(2), is(6));
    }
}
