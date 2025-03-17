package com.exception_;


public class ArithmeticClass {
    public static void main(String[] args) {

        try {
            int number1 = 10;
            int number2 = 0;
            int result = number1 / number2;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }


    }
}
