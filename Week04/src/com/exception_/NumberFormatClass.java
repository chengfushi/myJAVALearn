package com.exception_;


public class NumberFormatClass {
    public static void main(String[] args) {
        try {
            String str = "hello";
            int number = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
