package org.sharpsw.leetcode;

import java.util.*;

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Map<Integer, List<Integer>> result = new LinkedHashMap<>();
        visitNode(root, result, 0);
        List<List<Integer>> elements = new LinkedList<>(result.values());
        return elements;
    }

    private void visitNode(TreeNode node, Map<Integer, List<Integer>> numbersVisitedPerLevel, int currentLevel) {
        if(node != null) {
            if(numbersVisitedPerLevel.containsKey(currentLevel)) {
                numbersVisitedPerLevel.get(currentLevel).add(node.val);
            } else {
                List<Integer> elements = new ArrayList<>();
                elements.add(node.val);
                numbersVisitedPerLevel.put(currentLevel, elements);
            }

            visitNode(node.left, numbersVisitedPerLevel, currentLevel + 1);
            visitNode(node.right, numbersVisitedPerLevel, currentLevel + 1);
        }
    }

    public static void main(String[] args) {
        BinaryTreeLevelOrderTraversal service = new BinaryTreeLevelOrderTraversal();
        TreeNode root = new TreeNode(0);
        TreeNode left = new TreeNode(1);
        TreeNode right = new TreeNode(2);

        root.left = left;
        root.right = right;

        List<List<Integer>> values = service.levelOrder(root);
        values.forEach(item -> System.out.println(item));
    }
}
