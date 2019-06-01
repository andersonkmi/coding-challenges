package org.codecraftlabs;

public class DeleteDuplicateValueNodes {
    public SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {
        if (head == null) {
            return null;
        }

        SinglyLinkedListNode root = null;
        SinglyLinkedListNode current = null;

        SinglyLinkedListNode node = head;
        while(node != null) {
            if (root == null) {
                root = new SinglyLinkedListNode(node.data);
                current = root;
            } else {
                if(current != null && current.data != node.data) {
                    SinglyLinkedListNode aNode = new SinglyLinkedListNode(node.data);
                    current.next = aNode;
                    current = aNode;
                }
            }

            node = node.next;
        }
        return root;
    }
}
