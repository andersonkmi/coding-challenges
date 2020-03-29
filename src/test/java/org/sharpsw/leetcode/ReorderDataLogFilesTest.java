package org.sharpsw.leetcode;

import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.hasItems;

class ReorderDataLogFilesTest {
    private ReorderDataLogFiles service;

    @BeforeEach
    public void setup() {
        service = new ReorderDataLogFiles();
    }

    @Test
    public void testCase001() {
        String[] logs = {"dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3 art zero"};
        String[] result = service.reorderLogFiles(logs);
        List<String> converted = Arrays.asList(result);
        assertThat(converted, hasItems("let1 art can","let3 art zero","let2 own kit dig","dig1 8 1 5 1", "dig2 3 6"));
    }
}
