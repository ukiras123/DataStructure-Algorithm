package com.datastructure.javacollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Kiran on 9/20/18.
 */
public class CollectionsUtils {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("C");
        list.add("Core Java");
        list.add("Advance Java");
        System.out.println("Initial collection value:" + list);
        Collections.addAll(list, "Servlet", "JSP");
        System.out.println("After adding elements collection value:" + list);
        String[] strArr = {"C#", ".Net"};
        Collections.addAll(list, strArr);
        System.out.println("After adding array collection value:" + list);


        System.out.println("-----------Collection max()-----------");
        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(46);
        list2.add(67);
        list2.add(24);
        list2.add(16);
        list2.add(8);
        list2.add(12);
        System.out.println("Value of maximum element from the collection: "+Collections.max(list2));
    }
}