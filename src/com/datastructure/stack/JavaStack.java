package com.datastructure.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Stack;

/**
 * Created by Kiran on 9/20/18.
 * <p>
 * * Stack Implementation
 * java.util.Stack
 * <p>
 * peek();
 * add();
 * pop();
 * isEmpty();
 */
public class JavaStack {


    public static void main(String[] args) {

        System.out.println("-----Stack Class-------");
        Stack<String> stack = new Stack<String>();
        stack.push("element 1");
        stack.push("element 2");
        stack.push("element 3");

        // See Element From the Stack
        System.out.println("Peek: " + stack.peek());
        System.out.println(stack);

        // Remove Element from the Stack
        System.out.println("Pop: " + stack.pop());
        System.out.println(stack);

        // Iterator of Stack
        Iterator it = stack.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("------------");
        // Iterating different way
        for (String x :
                stack) {
            System.out.println(x);

        }


        System.out.println("-----Stack as Deque {recommended}-------");
        Deque<String> dequeStack = new ArrayDeque<>();
        dequeStack.addFirst("element 1");
        dequeStack.addFirst("element 2");
        dequeStack.addFirst("element 3");

        // See Element From the Stack
        System.out.println("Peek: " + dequeStack.peekFirst());
        System.out.println(dequeStack);

        // Remove Element from the Stack
        System.out.println("Pop: " + dequeStack.removeFirst());
        System.out.println(dequeStack);

        // Iterator of Stack
        Iterator it2 = dequeStack.iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }
        System.out.println("------------");
        // Iterating different way
        for (String x :
                dequeStack) {
            System.out.println(x);

        }

    }


}
