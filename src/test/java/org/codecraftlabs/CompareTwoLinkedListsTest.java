package org.codecraftlabs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


class CompareTwoLinkedListsTest {
    private CompareTwoLinkedLists sut;

    @BeforeEach
    void setup() {
        sut = new CompareTwoLinkedLists();
    }

    @Test
    void testNullNodes() {
        assertThat(sut.compareLists(null, null), is(true));
    }

    @Test
    void testNullNode() {
        SinglyLinkedListNode head = new SinglyLinkedListNode(1);

        assertThat(sut.compareLists(head, null), is(false));
    }
}
