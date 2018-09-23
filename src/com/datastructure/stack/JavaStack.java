package com.datastructure.stack;

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
        Stack<String> stack = new Stack<String>();
        stack.add("element 1");
        stack.add("element 2");
        stack.add("element 3");

        // See Element From the Queue
        System.out.println("Peek: " + stack.peek());
        System.out.println(stack);

        // Remove Element from the Queue
        System.out.println("Pop: " + stack.pop());
        System.out.println(stack);

        // Iterator of Queue
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

    }


}
