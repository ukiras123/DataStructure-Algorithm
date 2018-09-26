package com.datastructure.treeNgraph.tree;

import java.util.Stack;

/**
 * Created by Kiran on 9/20/18.
 * (a) Preorder (Left, Root, Right) : 4 2 5 1 3
 * (b) Inorder (Root, Left, Right) : 1 2 4 5 3  -> It gives a sorted list for BST
 * (c) Postorder (Left, Right, Root) : 4 5 2 3 1
 *
 * Worst: O(|V| + |E|)
 * Average: O(n)
 */
public class DFS {

    Node root;


    void iterativePreorder() {
        iterativePreorder(root);
    }

    void iterativePreorder(Node node) {

        // Base Case
        if (node == null) {
            return;
        }

        // Create an empty stack and push root to it
        Stack<Node> nodeStack = new Stack<Node>();
        nodeStack.push(root);

        /* Pop all items one by one. Do following for every popped item
         a) print it
         b) push its right child
         c) push its left child
         Note that right child is pushed first so that left is processed first */
        while (nodeStack.empty() == false) {
            Node temp = nodeStack.peek();
            System.out.print(temp.data + " ");

            nodeStack.pop();

            if (temp.right != null) {
                nodeStack.add(temp.right);
            }

            if (temp.left != null) {
                nodeStack.add(temp.left);
            }
        }
    }


    void iterativeInorder() {

        if (root == null)
            return;


        Stack<Node> s = new Stack<Node>();
        Node curr = root;

        // traverse the tree
        while (curr != null || s.size() > 0) {

            /* Reach the left most Node of the
            curr Node */
            while (curr != null) {
                /* place pointer to a tree node on
                   the stack before traversing
                  the node's left subtree */
                s.push(curr);
                curr = curr.left;
            }

            /* Current must be NULL at this point */
            curr = s.pop();

            System.out.print(curr.data + " ");

            /* we have visited the node and its
               left subtree.  Now, it's right
               subtree's turn */
            curr = curr.right;
        }
    }


    // Recursive
    void printPreorder(Node node) {

        if (node == null) {
            return;
        }

        System.out.print(node.data + " ");
        printPostorder(node.left);
        printPostorder(node.right);

    }

    void printInorder(Node node) {

        if (node == null) {
            return;
        }

        printPostorder(node.left);
        System.out.print(node.data + " ");
        printPostorder(node.right);

    }

    void printPostorder(Node node) {
        if (node == null) {
            return;
        }
        printPostorder(node.left);
        printPostorder(node.right);
        System.out.print(node.data + " ");

    }

    // Wrappers over above recursive functions
    void printPostorder() {
        printPostorder(root);
    }

    void printInorder() {
        printInorder(root);
    }

    void printPreorder() {
        printPreorder(root);
    }

    // Driver method
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();  // Binary Search Tree
        tree.insert(45);
        tree.insert(22);
        tree.insert(3234);
        tree.insert(2);
        tree.insert(9);
        tree.insert(234);
        tree.insert(2434);
        tree.insert(4);
        tree.insert(-3);
        DFS dfs = new DFS();
        dfs.root = tree.root;

        System.out.println("Preorder traversal of binary tree is ");
        dfs.printPreorder();
        System.out.println("\nIterative Preorder traversal of binary tree is ");
        dfs.iterativePreorder();

        System.out.println("---------------------------");
        System.out.println("\nInorder traversal of binary tree is ");
        dfs.printInorder();
        System.out.println("\nIterative Inorder traversal of binary tree is ");
        dfs.iterativeInorder();

        System.out.println("---------------------------");

        System.out.println("\nPostorder traversal of binary tree is ");
        dfs.printPostorder();


    }


}
