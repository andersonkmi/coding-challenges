package org.codecraftlabs;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.CoreMatchers.not;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;

class ReverseLinkedListTest {
    private ReverseLinkedList sut;

    @BeforeEach
    void setup() {
        sut = new ReverseLinkedList();
    }


    @Test
    void reverseNullLinkedList() {
        assertThat(sut.reverse(null), is(nullValue()));
    }

    @Test
    void reverseSingleLinkedList() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertNode(0);
        SinglyLinkedListNode root = list.head;

        SinglyLinkedListNode result = sut.reverse(root);
        assertThat(result.data, is(0));
        assertThat(result.next, is(nullValue()));
    }

    @Test
    void reverseLinkedListCase001() {
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
