package org.codecraftlabs;

import static org.hamcrest.CoreMatchers.is;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.codecraftlabs.SinglyLinkedListUtil.count;
import static org.codecraftlabs.SinglyLinkedListUtil.prettyPrint;
import static org.hamcrest.CoreMatchers.nullValue;

class DeleteDuplicateValueNodesTest {
    private DeleteDuplicateValueNodes sut;

    @BeforeEach
    void setup() {
        sut = new DeleteDuplicateValueNodes();
    }

    @Test
    void testNullList() {
        assertThat(sut.removeDuplicates(null), is(nullValue()));
    }

    @Test
    void testSingleNodeList() {
        SinglyLinkedListNode node = new SinglyLinkedListNode(2);
        SinglyLinkedListNode root = sut.removeDuplicates(node);

        assertThat(root.data, is(2));
        assertThat(root.next, is(nullValue()));
    }

    @Test
    void testDoubleNodeListNoDuplicate() {
        SinglyLinkedListNode node1 = new SinglyLinkedListNode(2);
        SinglyLinkedListNode node2 = new SinglyLinkedListNode(3);
        node1.next = node2;

        SinglyLinkedListNode root = sut.removeDuplicates(node1);

        assertThat(count(root), is(2));
    }

    @Test
    void testDoubleNodeListWithDuplicate() {
        SinglyLinkedListNode node1 = new SinglyLinkedListNode(2);
        SinglyLinkedListNode node2 = new SinglyLinkedListNode(2);
        node1.next = node2;

        SinglyLinkedListNode root = sut.removeDuplicates(node1);

        assertThat(count(root), is(1));
        assertThat(root.data, is(2));
    }

    @Test
    void testDuplicateRemoval() {
        SinglyLinkedListNode node1 = new SinglyLinkedListNode(1);
        SinglyLinkedListNode node2 = new SinglyLinkedListNode(2);
        SinglyLinkedListNode node3 = new SinglyLinkedListNode(3);
        SinglyLinkedListNode node4 = new SinglyLinkedListNode(3);
        SinglyLinkedListNode node5 = new SinglyLinkedListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        SinglyLinkedListNode root = sut.removeDuplicates(node1);

        assertThat(count(root), is(4));
        assertThat(prettyPrint(root), is("1-2-3-4"));
    }

    @Test
    void testRemoveDuplicateFromEnd() {
        SinglyLinkedListNode node1 = new SinglyLinkedListNode(1);
        SinglyLinkedListNode node2 = new SinglyLinkedListNode(2);
        SinglyLinkedListNode node3 = new SinglyLinkedListNode(3);
        SinglyLinkedListNode node4 = new SinglyLinkedListNode(4);
        SinglyLinkedListNode node5 = new SinglyLinkedListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        SinglyLinkedListNode root = sut.removeDuplicates(node1);

        assertThat(count(root), is(4));
        assertThat(prettyPrint(root), is("1-2-3-4"));
    }
}
