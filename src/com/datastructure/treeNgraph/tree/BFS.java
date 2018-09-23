package com.datastructure.treeNgraph.tree;


import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Kiran on 9/20/18.
 *
 *All four traversals require O(n) time as they visit every node exactly once.


 *Extra Space required for Level Order Traversal is O(w) where w is maximum width of Binary Tree.
 * In level order traversal, queue one by one stores nodes of different level.
 Extra Space required for Depth First Traversals is O(h) where h is maximum height of Binary Tree.
 In Depth First Traversals, stack (or function call stack) stores all ancestors of a node.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
// Recursive Java program for level order traversal of Binary Tree

/* Class containing left and right child of current
   node and data value*/
class Node
{
    int data;
    Node left, right;
    public Node(int item)
    {
        data = item;
        left = right = null;
    }
}

class BinaryTree
{
    // Root of the Binary Tree
    Node root;

    public BinaryTree()
    {
        root = null;
    }

    /* function to print level order traversal of tree*/
    void printLevelOrder()
    {
        int h = height(root);
        int i;
        for (i=1; i<=h; i++)
            printGivenLevel(root, i);
    }

    /* Compute the "height" of a tree -- the number of
    nodes along the longest path from the root node
    down to the farthest leaf node.*/
    int height(Node root)
    {
        if (root == null)
            return 0;
        else
        {
            /* compute  height of each subtree */
            int lheight = height(root.left);
            int rheight = height(root.right);

            /* use the larger one */
            return Math.max(lheight, rheight) +1;
        }
    }

    /* Print nodes at the given level */
    void printGivenLevel (Node root ,int level)
    {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.data + " ");
        else if (level > 1)
        {
            printGivenLevel(root.left, level-1);
            printGivenLevel(root.right, level-1);
        }
    }


    void insert(int data) {
        root = insertRec(root, data);
    }

    /* A recursive function to insert a new data in BST */
    Node insertRec(Node root, int data) {

        /* If the tree is empty, return a new node */
        if (root == null) {
            root = new Node(data);
            return root;
        }

        /* Otherwise, recur down the tree */
        if (data < root.data)
            root.left = insertRec(root.left, data);
        else if (data > root.data)
            root.right = insertRec(root.right, data);

        /* return the (unchanged) node pointer */
        return root;
    }



    // BFS
    // Time Complexity: O(n) where n is number of nodes in the binary tree
    void printLevelOrderQueue()
    {
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node temp = queue.poll();
            System.out.print(temp.data+" ");
            if (temp.left != null) {
                queue.add(temp.left);
            }
            if (temp.right != null) {
                queue.add(temp.right);
            }

        }
    }




    /* Driver program to test above functions */
    public static void main(String args[])
    {
        BinaryTree tree = new BinaryTree();
        tree.root= new Node(1);
        tree.root.left= new Node(2);
        tree.root.right= new Node(3);
        tree.root.left.left= new Node(4);
        tree.root.left.right= new Node(5);

        System.out.println("Level order traversal of binary tree is ");
        tree.printGivenLevel(tree.root, 2);
        System.out.println("\n---------printLevelOrder Function\n");
        tree.printLevelOrder();
        System.out.println("\n---------printLevelOrder Queue\n");
        tree.printLevelOrderQueue();
    }
}
