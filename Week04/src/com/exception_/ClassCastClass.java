package com.exception_;


public class ClassCastClass {
    public static void main(String[] args) {
        try {
            Object obj = new Object();
            String str = (String) obj;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
