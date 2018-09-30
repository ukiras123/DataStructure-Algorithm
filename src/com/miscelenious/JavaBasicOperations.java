package com.miscelenious;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kiran on 9/29/18.
 */
public class JavaBasicOperations {

    private String basic;
    private int basicInt;

    public String getBasic() {
        return basic;
    }

    public void setBasic(String basic) {
        this.basic = basic;
    }

    public int getBasicInt() {
        return basicInt;
    }

    public void setBasicInt(int basicInt) {
        this.basicInt = basicInt;
    }

    public JavaBasicOperations(int basicInt) {
        this.basicInt = basicInt;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JavaBasicOperations)) return false;

        JavaBasicOperations that = (JavaBasicOperations) o;

        if (getBasicInt() != that.getBasicInt()) return false;
        return getBasic() != null ? getBasic().equals(that.getBasic()) : that.getBasic() == null;
    }

    @Override
    public int hashCode() {
        int result = getBasic() != null ? getBasic().hashCode() : 0;
        result = 31 * result + getBasicInt();
        return result;
    }

    {
        System.out.println("I am instance");
    }

    public static void main(String[] args) {

        System.out.println("--------------String Operation--------------------");
        System.out.println("--------------String = \"hello\" -> \"String constant pool\" – which is inside the Heap memory--------------------");
        // Convert String to Integer
        int intNum = Integer.parseInt("123");

        // Convert Integer to String
        String str = Integer.toString(123);


        // Convert to String to charArray
        char[] charArr = "Hello".toCharArray();
        System.out.println(charArr.length);

        // Split a String with some value
        String[] spltString = "I am really good.".split("\\s");
        System.out.println(spltString.length);

        // Find the char at index
        System.out.println("I am here".charAt(0));

        // Equals
        System.out.println("Hello".equals("HELLO"));

        // Equals Ignore Case
        System.out.println("Hello".equalsIgnoreCase("HELLO"));

        // Index of
        System.out.println("Hello there".indexOf("there"));

        // Replace
        System.out.println("Hello there".replace("there", "here"));

        // SubString from index
        System.out.println("Hello there".substring(5));

        // SubString from index - to index
        System.out.println("Hello there".substring(6, 11));

        // Trim
        System.out.println("   Hello there   ".trim());

        // Contains
        System.out.println("   Hello there   ".contains("Hello"));

        // EndsWith
        System.out.println("   Hello there   ".endsWith(" "));


        /**
         * Comparing String and Integers
         * if s1 > s2, it returns a positive number
         * if s1 < s2, it returns a negative number
         * if s1 == s2, it returns 0
         **/
        String apple = "Apple";
        String ball = "Ball";
        System.out.println("Comparing Apply with Ball : " + apple.compareTo(ball));  // -1
        System.out.println("Comparing Ball with Apple : " + ball.compareTo(apple));  // 1
        System.out.println("Comparing Apple with Apple : " + apple.compareTo(apple));  // 0

        Integer x = 3;
        Integer y = 4;
        System.out.println("Comparing 3 with 4 : " + x.compareTo(y)); // -1
        System.out.println("Comparing 4 with 3 : " + y.compareTo(x)); // 1
        System.out.println("Comparing 3 with 3 : " + x.compareTo(x)); // 0

        // String Builder since String is Immutable
        // String Builder is faster than StringBuffer since it is not thread safe
        StringBuilder strBuilder = new StringBuilder("Hello");
        strBuilder.append(" there");
        System.out.println(strBuilder);


        // Max and Min Integer
        System.out.println("MAX INT VALUE : " + Integer.MAX_VALUE);
        System.out.println("MIN INT VALUE : " + Integer.MIN_VALUE);


        // Get HashCode
        System.out.println(new JavaBasicOperations(2).hashCode());

        // Instance OfSystem.out.println(subClass instanceof SubClass);//
        String one = new String("hi");
        System.out.println(one instanceof String);

        if (2 == 3) {
            throw new IllegalArgumentException("I am throwing");
        }


        // Generics
        MyListGeneric<String> myListString = new MyListGeneric<String>();
        myListString.add("Value 1");
        myListString.add("Value 2");
        System.out.println(myListString);
        MyListGeneric<Integer> myListInteger = new MyListGeneric<Integer>();
        myListInteger.add(1);
        myListInteger.add(2);
        System.out.println(myListInteger);
    }

    // Generic Class
    static class MyListGeneric<T> {
        private List<T> values = new ArrayList<T>();

        void add(T value) {
            values.add(value);
        }

        void remove(T value) {
            values.remove(value);
        }

        T get(int index) {
            return values.get(index);
        }

        @Override
        public String toString() {
            return values.toString();
        }
    }
}
