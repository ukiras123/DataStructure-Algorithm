package com.problems;

/**
 * Created by Kiran on 9/27/18.
 */
public class ReverseALinkedList {
    public class LinkedListNode {

        public int value;
        public LinkedListNode next;

        public LinkedListNode(int value) {
            this.value = value;
        }
    }


    // Go in Circle Next -> Prev -> Current
    public static LinkedListNode reverse(LinkedListNode headOfList) {
        LinkedListNode currentNode = headOfList;
        LinkedListNode previousNode = null;
        LinkedListNode nextNode = null;

        // until we have 'fallen off' the end of the list
        while (currentNode != null) {

            // copy a pointer to the next element
            // before we overwrite currentNode.next
            nextNode = currentNode.next;

            // reverse the 'next' pointer
            currentNode.next = previousNode;

            // step forward in the list
            previousNode = currentNode;
            currentNode = nextNode;
        }

        return previousNode;
    }

}
