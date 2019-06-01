package org.codecraftlabs;

import org.codecraftlabs.CompareTwoLinkedLists;
import org.codecraftlabs.SinglyLinkedListNode;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class CompareTwoLinkedListsTest {
    private CompareTwoLinkedLists sut;

    @Before
    public void setup() {
        sut = new CompareTwoLinkedLists();
    }

    @Test
    public void testNullNodes() {
        assertThat(sut.compareLists(null, null), is(true));
    }

    @Test
    public void testNullNode() {
        SinglyLinkedListNode head = new SinglyLinkedListNode(1);

        assertThat(sut.compareLists(head, null), is(false));
    }
}
