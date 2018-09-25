package com.datastructure.javacollection;

import java.util.Hashtable;
import java.util.Map;

/**
 * Created by Kiran on 9/20/18.
 * Java Hashtable class implements a hashtable, which maps keys to values. It inherits Dictionary class and implements the Map interface.
 * A Hashtable is an array of list. Each list is known as a bucket.
 * The position of bucket is identified by calling the hashcode() method. A Hashtable contains values based on the key.
 * It is synchronized.
 *
 *
 *
 *
 *
 * HashMap vs Hash Table
 * HashMap is not synchorinized and is not thread safe but HashTable is synchorinized
 * HashMap applys one null key and multiple null value, HashTable does not allow any null
 * HashMap is faster than HashTable
 */
public class HashTable {

    public static void main(String[] args) {
        Hashtable<Integer, String> hm = new Hashtable<Integer, String>();

        hm.put(100, "Amit");
        hm.put(102, "Ravi");
        hm.put(101, "Vijay");
        hm.put(103, "Rahul");

        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
