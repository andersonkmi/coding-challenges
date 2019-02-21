package org.codecraftlabs.hackerrank;

import org.codecraftlabs.hackerrank.data.SinglyLinkedListNode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class GetNodeValue {
    public int getNode(SinglyLinkedListNode head, int positionFromTail) {
        List<Integer> items = new LinkedList<>();

        SinglyLinkedListNode node = head;

        while(node != null) {
            items.add(node.data);
            node = node.next;
        }

        Collections.reverse(items);
        return items.get(positionFromTail);
    }
}
