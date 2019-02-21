package org.sharpsw.leetcode;

public class RemoveDuplicatesSortedLinkedList {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) {
            return head;
        }

        ListNode root = null;
        ListNode lastNode = null;

        ListNode node = head;
        int currentVal = Integer.MIN_VALUE;
        while(node != null) {
            if(node.val != currentVal) {
                ListNode newNode = new ListNode(node.val);
                if(root == null) {
                    root = newNode;
                } else {
                    lastNode.next = newNode;
                }
                lastNode = newNode;
                currentVal = node.val;
            }
            node = node.next;
        }
        return root;
    }
}
