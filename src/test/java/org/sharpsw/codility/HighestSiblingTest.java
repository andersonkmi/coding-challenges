package org.sharpsw.codility;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class HighestSiblingTest {
    private HighestSibling service;

    @Before
    public void setup() {
        service = new HighestSibling();
    }

    @Test
    public void testCase001() {
        assertThat(service.solution(123), is(321));
    }

    @Test
    public void testCase002() {
        assertThat(service.solution(0), is(0));
    }

    @Test
    public void testCase003() {
        assertThat(service.solution(2), is(2));
    }

    @Test
    public void testCase004() {
        assertThat(service.solution(10), is(10));
    }

    @Test
    public void testCase005() {
        assertThat(service.solution(355), is(553));
    }

    @Test
    public void testCase006() {
        assertThat(service.solution(10000), is(10000));
    }
}
