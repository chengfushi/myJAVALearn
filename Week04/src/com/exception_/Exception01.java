package com.exception_;

public class Exception01 {
    public static void main(String[] args) {
        try {
            int number1 = 10;
            int number2 = 0;
            int result = number1 / number2;
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("End of program");
    }
}
