package org.codecraftlabs;

import java.util.*;

public class TreeNode {
    TreeNode left;
    TreeNode right;
    int value;

    public TreeNode(int value) {
        this.value = value;
    }

    public void insert(int data) {
        if (data <= value) {
            if (left == null) {
                left = new TreeNode(data);
            } else {
                left.insert(data);
            }
        } else {
            if (right == null) {
                right = new TreeNode(data);
            } else {
                right.insert(data);
            }
        }
    }

    public boolean contains(int data) {
        if (value == data) {
            return true;
        } else if (data < value) {
            if(left != null) {
                return left.contains(data);
            } else {
                return false;
            }
        } else {
            if (right != null) {
                return right.contains(data);
            } else {
                return false;
            }
        }
    }

    public void printInOrder() {
        if (left != null) {
            left.printInOrder();
        }

        System.out.println(value);

        if (right != null) {
            right.printInOrder();
        }
    }

    public static void printByLevel(TreeNode root) {
        Map<Integer, List<Integer>> levels = new LinkedHashMap<>();
        processLevels(root, levels, 0);

        Collection<List<Integer>> elements = levels.values();
        elements.forEach(System.out::println);
    }

    private static void processLevels(TreeNode node, Map<Integer, List<Integer>> levels, int levelId) {
        if (node != null) {
            if (levels.containsKey(levelId)) {
                levels.get(levelId).add(node.value);
            } else {
                List<Integer> values = new LinkedList<>();
                values.add(node.value);
                levels.put(levelId, values);
            }
            processLevels(node.left, levels, levelId + 1);
            processLevels(node.right, levels, levelId + 1);
        }

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);

        root.insert(2);
        root.insert(3);
        root.insert(8);
        root.insert(6);
        root.insert(-1);

        System.out.println(root.contains(3));
        System.out.println(root.contains(10));

        root.printInOrder();

        printByLevel(root);
    }
}
