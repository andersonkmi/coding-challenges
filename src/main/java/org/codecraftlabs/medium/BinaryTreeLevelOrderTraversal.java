package org.codecraftlabs.medium;

import java.util.*;

import static java.util.Collections.unmodifiableList;

/**
 * This class implements an approach to the tree level traversal coding challenge.
 */
public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Map<Integer, List<Integer>> result = new LinkedHashMap<>();
        visitNode(root, result, 0);
        return unmodifiableList(new LinkedList<>(result.values()));
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
        values.forEach(System.out::println);
    }
}
