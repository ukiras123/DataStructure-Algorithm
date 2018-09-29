package com.problems;

import java.util.*;

/**
 * Created by Kiran on 9/27/18.
 * <p>
 * Let's say:
 * <p>
 * '(', '{', '[' are called "openers."
 * ')', '}', ']' are called "closers."
 * Write an efficient method that tells us whether or not an input string's openers and closers are properly nested.
 * <p>
 * "{ [ ] ( ) }" should return true
 * "{ [ ( ] ) }" should return false
 * "{ [ }" should return false
 */
public class BracketValidator {


    public static boolean isValid(String code) {

        Map<Character, Character> openersToClosers = new HashMap<>();
        openersToClosers.put('(', ')');
        openersToClosers.put('[', ']');
        openersToClosers.put('{', '}');

        Set<Character> openers = openersToClosers.keySet();
        Set<Character> closers = new HashSet<>(openersToClosers.values());

        Deque<Character> openersStack = new ArrayDeque<>();
        for (char ch : code.toCharArray()) {
            if (openers.contains(ch)){
                openersStack.push(ch);
            }else if (closers.contains(ch))
            {
               char expectedOpener = openersStack.pop();
               if (openersStack.size() == 0 || openersToClosers.get(expectedOpener) != ch){
                   return false;
               }

            }
        }

        return openersStack.isEmpty();
    }


    public static void main(String[] args) {
        System.out.println(isValid("{ [ ] ( ) }}"));
    }
}
