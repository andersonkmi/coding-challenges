package org.sharpsw.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

class RemoveNthFromListTest {
    private RemoveNthFromList service;

    private String printList(ListNode root) {
        if(root != null) {
            StringBuilder buffer = new StringBuilder();
            ListNode node = root;
            buffer.append(root.val);
            node = node.next;
            while(node != null) {
                buffer.append("-").append(node.val);
                node = node.next;
            }
            return buffer.toString();
        }
        return "";
    }

    @BeforeEach
    void setup() {
        service = new RemoveNthFromList();
    }

    @Test
    void shouldSupportEmptyList() {
        ListNode head = null;
        assertThat(service.removeNthFromEnd(head, 0), nullValue());
    }

    @Test
    void shouldSupportSingleItemList() {
        ListNode root = new ListNode(9);
        assertThat(service.removeNthFromEnd(root, 1), nullValue());
    }

    @Test
    void shouldSupportSingleItemListInvalidPosition() {
        ListNode root = new ListNode(9);
        ListNode result = service.removeNthFromEnd(root, 2);
        assertThat(result, notNullValue());
        assertThat(result.val, is(9));
        assertThat(result.next, nullValue());
    }

    @Test
    void removeMiddleElementOK() {
        ListNode root = new ListNode(9);
        ListNode second = new ListNode(10);
        ListNode third = new ListNode(11);
        root.next = second;
        second.next = third;

        ListNode result = service.removeNthFromEnd(root, 1);
        assertThat(result, notNullValue());
        assertThat(result.val, is(9));
        assertThat(result.next, notNullValue());
        assertThat(result.next.val, is(10));
    }

    @Test
    void removeElementOK() {
        ListNode item1 = new ListNode(9);
        ListNode item2 = new ListNode(10);
        ListNode item3 = new ListNode(11);
        ListNode item4 = new ListNode(12);
        ListNode item5 = new ListNode(13);
        ListNode item6 = new ListNode(14);
        ListNode item7 = new ListNode(15);
        item1.next = item2;
        item2.next = item3;
        item3.next = item4;
        item4.next = item5;
        item5.next = item6;
        item6.next = item7;

        ListNode result = service.removeNthFromEnd(item1, 1);
        assertThat(printList(result), is("9-10-11-12-13-14"));
    }
}
