package org.example;

import java.lang.System;



public class LongestCommonPrefix {

    public static void main(String[] args) {

        String[] strs = {"flow","flower","flight"};
        String result = longestCommonPrefix(strs);
        specialPrint(result);
    }


    private static String longestCommonPrefix(String[] strs) {

        if(strs.length == 0){
            return "";
        }
        String firstValue = strs[0];

        for (int i = 1; i < strs.length; i++) {
            System.out.println(strs[i].indexOf(firstValue));
            while (strs[i].indexOf(firstValue) != 0){
                firstValue = firstValue.substring(0, firstValue.length() - 1);
            }
        }
        return firstValue;
    }

    public static void specialPrint(String  result) {
        System.out.println(result);
    }
}
