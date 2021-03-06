package com.main.java;

public class ReverseString {

    static String reverseString(String inputString) {
        String reverse = "";
        for (int i = inputString.length() - 1; i >= 0; i--) {
            reverse += inputString.charAt(i);
        }
        return reverse;
    }

    public static String reverse(String str) {
        if ((null == str) || (str.length() <= 1)) {
            return str;
        }
        String subString = str.substring(1); // ello World
        Character data = str.charAt(0);   // H
        return reverse(subString) + data;
    }

    public static void main(String[] args) {

        System.out.println("Iterate Reverse is : " + reverseString("Hello World"));
        System.out.println("Iterate Reverse is : " + reverse("Hello World"));
        StringBuffer a = new StringBuffer("Java programming is fun");
        System.out.println(a.reverse());

    }
}
