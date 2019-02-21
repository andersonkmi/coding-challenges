package org.codecraftlabs.hackerrank;

import org.codecraftlabs.hackerrank.data.SinglyLinkedList;
import org.codecraftlabs.hackerrank.data.SinglyLinkedListNode;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;


public class ReverseLinkedListTest {
    private ReverseLinkedList sut;

    @Before
    public void setup() {
        sut = new ReverseLinkedList();
    }


    @Test
    public void reverseNullLinkedList() {
        assertThat(sut.reverse(null), is(nullValue()));
    }

    @Test
    public void reverseSingleLinkedList() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertNode(0);
        SinglyLinkedListNode root = list.head;

        SinglyLinkedListNode result = sut.reverse(root);
        assertThat(result.data, is(0));
        assertThat(result.next, is(nullValue()));
    }

    @Test
    public void reverseLinkedListCase001() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertNode(0);
        list.insertNode(1);
        SinglyLinkedListNode root = list.head;

        SinglyLinkedListNode result = sut.reverse(root);
        assertThat(result.data, is(1));
        assertThat(result.next, is(not(nullValue())));

        assertThat(result.next.data, is(0));
        assertThat(result.next.next, is(nullValue()));
    }
}
