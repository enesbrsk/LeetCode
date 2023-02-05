package org.example;

public class RomanToInteger {

    public static void main(String[] args) {

        String romanValue = "III";
        int result = romanToInt(romanValue);

        System.out.println(result);
    }

    private static int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int val = getRoman(s.charAt(i));
            if (i + 1 < s.length() && getRoman(s.charAt(i + 1)) > val) {
                result -= val;
            } else {
                result += val;
            }
        }
        return result;
    }

    private static int getRoman(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }

}
