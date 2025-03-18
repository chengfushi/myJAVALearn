package com.commonclass.bignumber;


import java.math.BigInteger;

public class BigIntegerClass {
    public static void main(String[] args) {
        BigInteger bigInteger1 = new BigInteger("12311111111111111111111111111111111111789411");
        BigInteger bigInteger2 = new BigInteger("12311111111111111111111111111111111111789411");
        System.out.println(bigInteger1.add(bigInteger2));
        System.out.println(bigInteger1.subtract(bigInteger2));
        System.out.println(bigInteger1.multiply(bigInteger2));
        System.out.println(bigInteger1.divide(bigInteger2));
    }
}
