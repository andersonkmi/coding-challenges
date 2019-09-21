package org.sharpsw.leetcode;

import static org.hamcrest.CoreMatchers.is;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;

class AddTwoNumbersTest {
    private AddTwoNumbers cut;

    @BeforeEach
    void setup() {
        cut = new AddTwoNumbers();
    }

    @Test
    void addSymmetricNumbers() {
        ListNode root1 = new ListNode(1);
        ListNode root2 = new ListNode(2);

        ListNode result = cut.addTwoNumbers(root1, root2);

        assertThat(result, notNullValue());
        assertThat(ListNodeUtils.getLength(result), is(1));
        assertThat(ListNodeUtils.getValue(result), is(3));
    }

    @Test
    void addEmptyLists() {
        ListNode result = cut.addTwoNumbers(null, null);

        assertThat(result, nullValue());
    }

    @Test
    void addWithOneNullList() {
        ListNode root1 = new ListNode(5);
        ListNode result = cut.addTwoNumbers(root1, null);

        assertThat(result, notNullValue());
        assertThat(ListNodeUtils.getLength(result), is(1));
        assertThat(ListNodeUtils.getValue(result), is(5));
    }

    @Test
    void addTwoNodeLists() {
        ListNode root11 = new ListNode(1);
        ListNode root12 = new ListNode(2);
        root11.next = root12;

        ListNode root21 = new ListNode(2);
        ListNode root22 = new ListNode(3);
        root21.next = root22;

        ListNode result = cut.addTwoNumbers(root11, root21);

        assertThat(result, notNullValue());
        assertThat(ListNodeUtils.getLength(result), is(2));
        assertThat(ListNodeUtils.getValue(result), is(53));
    }

    @Test
    void addTwoNodeListsWithCarrying() {
        ListNode root11 = new ListNode(1);
        ListNode root12 = new ListNode(7);
        root11.next = root12;

        ListNode root21 = new ListNode(2);
        ListNode root22 = new ListNode(3);
        root21.next = root22;

        ListNode result = cut.addTwoNumbers(root11, root21);

        assertThat(result, notNullValue());
        assertThat(ListNodeUtils.getLength(result), is(3));
        assertThat(ListNodeUtils.getValue(result), is(103));
    }

}
