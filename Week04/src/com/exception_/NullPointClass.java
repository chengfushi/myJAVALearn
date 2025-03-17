package com.exception_;


public class NullPointClass {
    public static void main(String[] args) {
        String[] strings = new String[3];

        try {
            System.out.println(strings[0].equals("Hello"));
        }catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}
