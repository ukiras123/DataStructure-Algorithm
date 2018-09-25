package com.datastructure.javacollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Kiran on 9/20/18.
 * <p>
 * ArrayList
 * LinkedList
 */
public class List {

    public static void main(String[] args) {
        System.out.println("-------ArrayList---------");

        ArrayList<String> list = new ArrayList<String>();//Creating arraylist
        list.add("Ravi");//Adding object in arraylist
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");
        //Traversing list through Iterator
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        for (String g : list) {
            System.out.println(g);
        }


        System.out.println("------LinkedList----------");
        LinkedList<String> al = new LinkedList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");

        Iterator<String> itr2 = al.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }


    }
}
