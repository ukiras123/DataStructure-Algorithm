package com.datastructure.javacollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 * Created by Kiran on 9/20/18.
 * <p>
 * HashSet
 * HashSet stores the elements by using a mechanism called hashing.
 * HashSet contains unique elements only.
 * <p>
 * <p>
 * LinkedHashSet
 * Maintains insertion order. All like HashSet.
 * <p>
 * <p>
 * TreeSet
 * It inherits AbstractSet class and implements NavigableSet interface
 * The objects of TreeSet class are stored in ascending order.
 * Access and retrieval times are quiet fast.
 * Maintains ascending order.
 * <p>
 * <p>
 * loadFactor
 */
public class Set {

    public static void main(String[] args) {

        System.out.println("---------HashSet--------");
        //Creating HashSet and adding elements
        HashSet<String> set = new HashSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");
        //Traversing elements
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("-------LinkedHashSet----------");
        LinkedHashSet<String> al = new LinkedHashSet<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        Iterator<String> itr2 = al.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }

        System.out.println("-------TreeSet----------");
        TreeSet<String> al2=new TreeSet<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        //Traversing elements
        Iterator<String> itr3=al2.iterator();
        while(itr3.hasNext()){
            System.out.println(itr3.next());
        }
    }


}
