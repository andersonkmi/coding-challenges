package org.sharpsw.codility;

import static org.hamcrest.CoreMatchers.is;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;

class HighestSiblingTest {
    private HighestSibling service;

    @BeforeEach
    void setup() {
        service = new HighestSibling();
    }

    @Test
    void testCase001() {
        assertThat(service.solution(123), is(321));
    }

    @Test
    void testCase002() {
        assertThat(service.solution(0), is(0));
    }

    @Test
    void testCase003() {
        assertThat(service.solution(2), is(2));
    }

    @Test
    void testCase004() {
        assertThat(service.solution(10), is(10));
    }

    @Test
    void testCase005() {
        assertThat(service.solution(355), is(553));
    }

    @Test
    void testCase006() {
        assertThat(service.solution(10000), is(10000));
    }
}
