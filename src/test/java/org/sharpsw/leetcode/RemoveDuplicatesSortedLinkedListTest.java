package org.sharpsw.leetcode;

import static org.hamcrest.CoreMatchers.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class RemoveDuplicatesSortedLinkedListTest {
    private RemoveDuplicatesSortedLinkedList cut;

    @Before
    public void setup() {
        cut = new RemoveDuplicatesSortedLinkedList();
    }

    @Test
    public void shouldSupportEmptyList() {
        assertThat(cut.deleteDuplicates(null), nullValue());
    }

    @Test
    public void shouldSupportSingleItemList() {
        ListNode item = new ListNode(4);

        assertThat(ListNodeUtils.getLength(cut.deleteDuplicates(item)), is(1));
        assertThat(ListNodeUtils.mkString(cut.deleteDuplicates(item)), is("4"));
    }

    @Test
    public void testCase001() {
        ListNode item = new ListNode(4);
        ListNode item2 = new ListNode(4);
        item.next = item2;

        assertThat(ListNodeUtils.getLength(cut.deleteDuplicates(item)), is(1));
        assertThat(ListNodeUtils.mkString(cut.deleteDuplicates(item)), is("4"));
    }

    @Test
    public void testCase002() {
        ListNode item = new ListNode(4);
        ListNode item2 = new ListNode(4);
        item.next = item2;

        ListNode item3 = new ListNode(5);
        item2.next = item3;

        assertThat(ListNodeUtils.getLength(cut.deleteDuplicates(item)), is(2));
        assertThat(ListNodeUtils.mkString(cut.deleteDuplicates(item)), is("4 5"));
    }
}
