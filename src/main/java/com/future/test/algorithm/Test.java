// Copyright (C) 2017 Meituan
// All rights reserved
package com.future.test.algorithm;

import java.util.*;

/**
 * @version 1.0
 * @created 2017/9/15 下午12:15
 **/
public class Test {
    public static final List<Character> a = Arrays.asList('(', '[', '{');
    public static final List<Character> b = Arrays.asList(')', ']', '}');


    public static void main(String[] args) {

        String aa = "(sdfs{[dsf]sdfs}sdf)";
        String bb = "(((([[]))))";
        String cc = "(((([[]]]]]))))";

        System.out.println(isValid(aa));
        System.out.println(isValid(bb));
        System.out.println(isValid(cc));

    }


    public static boolean isValid(String s) {
        if (s == null || s.equals(""))
            return true;


        Map<Character, Character>  d = new HashMap<>();
        d.put('(',')');
        d.put('[',']');
        d.put('{','}');

        Stack<Character> stack = new Stack<>();

        char[] sc = s.toCharArray();

        for (int i = 0; i < sc.length; i++) {
            if (d.keySet().contains(sc[i])) {
                stack.push(sc[i]);
            }

            if (d.values().contains(sc[i])) {
                if (stack.empty()){
                    return false;
                }
                Character ccc = stack.pop();
                if (ccc == null) {
                    return false;
                }
                if (d.get(ccc) != sc[i]) {
                    return false;
                }
            }
        }

        if (stack.empty()) {
            return true;
        } else {
            return false;
        }
    }
}
