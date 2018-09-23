package com.datastructure.linkedlist;

/**
 * Created by Kiran on 9/21/18.
 */
public class Node {
    private int data;
    private Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public Node getNext(){
        return next;
    }
}
