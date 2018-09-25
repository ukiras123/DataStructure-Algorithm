package com.datastructure.javacollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/**
 * Created by Kiran on 9/20/18.
 * <p>
 * Comparable
 * Java Comparable interface is used to order the objects of user-defined class
 * compareTo(Object)
 * <p>
 * <p>
 * <p>
 * Comparator
 * Java Comparator interface is used to order the objects of user-defined class.
 * compare(Object1, Object2)
 */
class Student implements Comparable<Student> {
    int rollno;
    String name;
    int age;

    Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    public int compareTo(Student st) {
        if (age == st.age)
            return 0;
        else if (age > st.age)
            return 1;
        else
            return -1;
    }
}

class Student2 {
    int rollno;
    String name;
    int age;

    Student2(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }
}

class AgeComparator implements Comparator {
    public int compare(Object o1, Object o2) {
        Student s1 = (Student) o1;
        Student s2 = (Student) o2;

        if (s1.age == s2.age)
            return 0;
        else if (s1.age > s2.age)
            return 1;
        else
            return -1;
    }

}

public class ComparableComparator {

    public static void main(String[] args) {
        System.out.println("------------Comparable--------------------");
        ArrayList<Student> al2 = new ArrayList<Student>();
        al2.add(new Student(101, "Vijay", 23));
        al2.add(new Student(106, "Ajay", 27));
        al2.add(new Student(105, "Jai", 21));

        Collections.sort(al2);
        for (Student st : al2) {
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }


        System.out.println("------------Comparator--------------------");
        ArrayList al = new ArrayList();
        al.add(new Student(101, "Vijay", 23));
        al.add(new Student(106, "Ajay", 27));
        al.add(new Student(105, "Jai", 21));

        System.out.println("Sorting by age...");

        Collections.sort(al, new AgeComparator());
        Iterator itr2 = al.iterator();
        while (itr2.hasNext()) {
            Student st = (Student) itr2.next();
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }


        System.out.println("Sorting by Name...");

        Collections.sort(al, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.name.compareTo(s2.name);
            }
        });
        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            Student st = (Student) itr.next();
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }
    }


}

