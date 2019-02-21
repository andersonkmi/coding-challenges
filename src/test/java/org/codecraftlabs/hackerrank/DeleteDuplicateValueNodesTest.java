package org.codecraftlabs.hackerrank;

import org.codecraftlabs.hackerrank.data.SinglyLinkedListNode;
import org.junit.Before;
import org.junit.Test;

import static org.codecraftlabs.hackerrank.SinglyLinkedListUtil.count;
import static org.codecraftlabs.hackerrank.SinglyLinkedListUtil.prettyPrint;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

public class DeleteDuplicateValueNodesTest {
    private DeleteDuplicateValueNodes sut;

    @Before
    public void setup() {
        sut = new DeleteDuplicateValueNodes();
    }

    @Test
    public void testNullList() {
        assertThat(sut.removeDuplicates(null), is(nullValue()));
    }

    @Test
    public void testSingleNodeList() {
        SinglyLinkedListNode node = new SinglyLinkedListNode(2);
        SinglyLinkedListNode root = sut.removeDuplicates(node);

        assertThat(root.data, is(2));
        assertThat(root.next, is(nullValue()));
    }

    @Test
    public void testDoubleNodeListNoDuplicate() {
        SinglyLinkedListNode node1 = new SinglyLinkedListNode(2);
        SinglyLinkedListNode node2 = new SinglyLinkedListNode(3);
        node1.next = node2;

        SinglyLinkedListNode root = sut.removeDuplicates(node1);

        assertThat(count(root), is(2));
    }

    @Test
    public void testDoubleNodeListWithDuplicate() {
        SinglyLinkedListNode node1 = new SinglyLinkedListNode(2);
        SinglyLinkedListNode node2 = new SinglyLinkedListNode(2);
        node1.next = node2;

        SinglyLinkedListNode root = sut.removeDuplicates(node1);

        assertThat(count(root), is(1));
        assertThat(root.data, is(2));
    }

    @Test
    public void testDuplicateRemoval() {
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
    public void testRemoveDuplicateFromEnd() {
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
