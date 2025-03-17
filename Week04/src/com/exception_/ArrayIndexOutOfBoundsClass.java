package com.exception_;


public class ArrayIndexOutOfBoundsClass {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[3]);
        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}
