package org.sharpsw.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;

class SubDomainVisitCountTest {
    private SubDomainVisitCount service;

    @BeforeEach
    void setup() {
        service = new SubDomainVisitCount();
    }

    @Test
    void testCase001() {
        var items = new ArrayList<>();
        items.add("9001 discuss.leetcode.com");

        var result = service.subdomainVisits(items.toArray(String[]::new));
        assertThat(result.size(), is(3));
    }

    @Test
    void testCase002() {
        var items = new ArrayList<>();
        items.add("900 google.mail.com");
        items.add("50 yahoo.com");
        items.add("1 intel.mail.com");
        items.add("5 wiki.org");

        var result = service.subdomainVisits(items.toArray(String[]::new));
        assertThat(result.size(), is(3));
    }
}
