package com.datastructure.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Kiran on 9/20/18.
 *
 * Queue Implementation
 * java.util.LinkedList
 * java.util.PriorityQueue
 *
 * peek();
 * add();
 * remove(); -> poll();
 * isEmpty();
 *
 */
public class JavaQueue {


    public static void main(String[] args) {
        Queue<String> queueA = new LinkedList<String>();
        queueA.add("element 1");
        queueA.add("element 2");
        queueA.add("element 3");

        // See Element From the Queue
        System.out.println("Peek: "+queueA.peek());
        System.out.println(queueA);

        // Remove Element from the Queue
        System.out.println("Poll: "+ queueA.poll());  // Poll throws null when empty / can use remove();
        System.out.println(queueA);

        // Iterator of Queue
        Iterator it = queueA.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("------------");
        // Iterating different way
        for (String x :
                queueA) {
            System.out.println(x);

        }

    }
}
