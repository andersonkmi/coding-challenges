package org.codecraftlabs.hackerrank;

import org.codecraftlabs.hackerrank.data.SinglyLinkedListNode;

public class SinglyLinkedListUtil {
    public static int count(SinglyLinkedListNode root) {
        int counter = 0;
        SinglyLinkedListNode node = root;
        while(node != null) {
            counter++;
            node = node.next;
        }
        return counter;
    }

    public static String prettyPrint(SinglyLinkedListNode root) {
        StringBuilder buffer = new StringBuilder();

        SinglyLinkedListNode node = root;
        while (node != null) {
            buffer.append(node.data).append("-");
            node = node.next;
        }

        return buffer.toString().replaceAll("-$", "");
    }
}
