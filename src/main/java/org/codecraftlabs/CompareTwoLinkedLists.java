package org.codecraftlabs;

import java.util.LinkedList;
import java.util.List;

public class CompareTwoLinkedLists {
    public boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        List<Integer> numbers1 = convert(head1);
        List<Integer> numbers2 = convert(head2);
        return numbers1.equals(numbers2);
    }

    private List<Integer> convert(SinglyLinkedListNode head) {
        SinglyLinkedListNode node = head;

        List<Integer> items = new LinkedList<>();
        while(node != null) {
            items.add(node.data);
            node = node.next;
        }

        return items;
    }
}
