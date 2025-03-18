package com.commonclass.arrays_;

import java.util.Arrays;

public class ArraysClass {
    public static void main(String[] args) {
        int[] intArray = {5, 3, 4, 6, 8};
        System.out.println("Original array length: " + intArray.length);

        // Sort the array
        Arrays.sort(intArray);

        // Print the sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}