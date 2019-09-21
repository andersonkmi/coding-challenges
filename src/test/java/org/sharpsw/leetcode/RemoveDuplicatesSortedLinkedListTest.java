package org.sharpsw.leetcode;

import static org.hamcrest.CoreMatchers.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;


class RemoveDuplicatesSortedLinkedListTest {
    private RemoveDuplicatesSortedLinkedList cut;

    @BeforeEach
    void setup() {
        cut = new RemoveDuplicatesSortedLinkedList();
    }

    @Test
    void shouldSupportEmptyList() {
        assertThat(cut.deleteDuplicates(null), nullValue());
    }

    @Test
    void shouldSupportSingleItemList() {
        ListNode item = new ListNode(4);

        assertThat(ListNodeUtils.getLength(cut.deleteDuplicates(item)), is(1));
        assertThat(ListNodeUtils.mkString(cut.deleteDuplicates(item)), is("4"));
    }

    @Test
    void testCase001() {
        ListNode item = new ListNode(4);
        ListNode item2 = new ListNode(4);
        item.next = item2;

        assertThat(ListNodeUtils.getLength(cut.deleteDuplicates(item)), is(1));
        assertThat(ListNodeUtils.mkString(cut.deleteDuplicates(item)), is("4"));
    }

    @Test
    void testCase002() {
        ListNode item = new ListNode(4);
        ListNode item2 = new ListNode(4);
        item.next = item2;

        ListNode item3 = new ListNode(5);
        item2.next = item3;

        assertThat(ListNodeUtils.getLength(cut.deleteDuplicates(item)), is(2));
        assertThat(ListNodeUtils.mkString(cut.deleteDuplicates(item)), is("4 5"));
    }
}
