package com.datastructure.javacollection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Kiran on 9/20/18.
 * A map contains values on the basis of key i.e. key and value pair.
 * Each key and value pair is known as an entry. Map contains only unique keys.
 * <p>
 * <p>
 * HashMap
 * HashMap is the implementation of Map but it doesn't maintain any order.
 * It may have one null key and multiple null values.
 * <p>
 * LinkedHashMap
 * LinkedHashMap is the implementation of Map, it inherits HashMap class. It maintains insertion order.
 * <p>
 * <p>
 * TreeMap
 * TreeMap is the implementation of Map and SortedMap, it maintains ascending order.
 * <p>
 * <p>
 * put()
 * putAll(Map)
 * get()
 * remove(key)
 * containsKet(key)
 * Set ketSet()  -> It is used to return the Set view containing all the keys.
 * Set entrySet() -> It is used to return the Set view containing all the keys and values.
 */
public class MapC {

    public static void main(String[] args) {

        System.out.println("---------------HashMap-----------------");
        Map<Integer, String> map1 = new HashMap<Integer, String>();
        map1.put(100, "Amit");
        map1.put(101, "Vijay");
        map1.put(102, "Rahul");


        for (Map.Entry m : map1.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        System.out.println("---------------LinkedHashMap-----------------");
        Map<Integer, String> map = new LinkedHashMap<Integer, String>();
        map.put(101, "Let us C");
        map.put(102, "Operating System");
        map.put(103, "Data Communication and Networking");
        System.out.println("Values before remove: " + map);
        // Remove value for key 102
        map.remove(102);
        System.out.println("Values after remove: " + map);

        System.out.println("---------------TreeMap-----------------");
        TreeMap<Integer, String> hm = new TreeMap<Integer, String>();
        hm.put(100, "Amit");
        hm.put(102, "Ravi");
        hm.put(101, "Vijay");
        hm.put(103, "Rahul");
        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}

