package com.datastructure.javacollection;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by Kiran on 9/20/18.
 * <p>
 * ArrayDeque
 * The ArrayDeque class provides the facility of using deque and resizable-array. It inherits AbstractCollection class and implements the Deque interface.
 */
public class DequeC {

    public static void main(String[] args) {
        //Creating Deque and adding elements
        Deque<String> deque = new ArrayDeque<String>();
        deque.add("Ravi");
        deque.add("Vijay");
        deque.add("Ajay");
        //Traversing elements
        for (String str : deque) {
            System.out.println(str);
        }

    }
}
