package com.problems;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by Kiran on 9/26/18.
 */

public class isThisBinarySearchTree {
    private static class NodeBounds {

        BinaryTreeNode node;
        int lowerBound;
        int upperBound;

        NodeBounds(BinaryTreeNode node, int lowerBound, int upperBound) {
            this.node = node;
            this.lowerBound = lowerBound;
            this.upperBound = upperBound;
        }
    }

    public static boolean isSearchTree(BinaryTreeNode root) {

        // start at the root, with an arbitrarily low lower bound
        // and an arbitrarily high upper bound
        Deque<NodeBounds> nodeAndBoundsStack = new ArrayDeque<>();
        nodeAndBoundsStack.push(new NodeBounds(root, Integer.MIN_VALUE, Integer.MAX_VALUE));

        // depth-first traversal
        while (!nodeAndBoundsStack.isEmpty()) {
            NodeBounds nb = nodeAndBoundsStack.pop();
            BinaryTreeNode node = nb.node;
            int lowerBound = nb.lowerBound;
            int upperBound = nb.upperBound;

            // if this node is invalid, we return false right away
            if (node.value <= lowerBound || node.value >= upperBound) {
                return false;
            }

            if (node.left != null) {
                // this node must be less than the current node
                nodeAndBoundsStack.push(new NodeBounds(node.left, lowerBound, node.value));
            }
            if (node.right != null) {
                // this node must be greater than the current node
                nodeAndBoundsStack.push(new NodeBounds(node.right, node.value, upperBound));
            }
        }

        // if none of the nodes were invalid, return true
        // (at this point we have checked all nodes)
        return true;
    }
}