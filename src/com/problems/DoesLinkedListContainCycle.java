package com.problems;

/**
 * Created by Kiran on 9/27/18.
 * <p>
 * A singly-linked list is built with nodes, where each node has:
 * <p>
 * node.next—the next node in the list.
 * node.value—the data held in the node. For example, if our linked list stores people in line at the movies, node.value might be the person's name.
 */
public class DoesLinkedListContainCycle {

    public class LinkedListNode {

        public int value;
        public LinkedListNode next;

        public LinkedListNode(int value) {
            this.value = value;
        }
    }

    public static boolean containsCycle(LinkedListNode firstNode) {

        // start both runners at the beginning
        LinkedListNode slowRunner = firstNode;
        LinkedListNode fastRunner = firstNode;

        // until we hit the end of the list
        while (fastRunner != null && fastRunner.next != null) {
            slowRunner = slowRunner.next;
            fastRunner = fastRunner.next.next;

            // case: fastRunner is about to "lap" slowRunner
            if (fastRunner == slowRunner) {
                return true;
            }
        }

        // case: fastRunner hit the end of the list
        return false;
    }


}
