package org.codecraftlabs.hackerrank;

import org.codecraftlabs.hackerrank.data.SinglyLinkedListNode;

import java.util.ArrayList;

public class ReverseLinkedList {
    public SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
        if(head == null) {
            return null;
        }

        ArrayList<SinglyLinkedListNode> values = new ArrayList<>();
        SinglyLinkedListNode node = head;
        while(node != null) {
            SinglyLinkedListNode nextNode = node.next;
            node.next = null;
            values.add(node);


            if(values.size() == 1) {
                node.next = null;
            } else {
                node.next = values.get(values.size() - 2);
            }

            node = nextNode;
        }

        return values.get(values.size() - 1);
    }
}