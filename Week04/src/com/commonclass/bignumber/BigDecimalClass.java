package com.commonclass.bignumber;


import java.math.BigDecimal;

public class BigDecimalClass {
    public static void main(String[] args) {
        BigDecimal bigDecimal1 = new BigDecimal("111.129999999999999999999999999999999999999");
        BigDecimal bigDecimal2 = new BigDecimal("12.8888888888888888888888888888888888888888");
        System.out.println(bigDecimal1.add(bigDecimal2));
        System.out.println(bigDecimal1.subtract(bigDecimal2));
        System.out.println(bigDecimal1.multiply(bigDecimal2));
        System.out.println(bigDecimal1.divide(bigDecimal2,30,BigDecimal.ROUND_HALF_UP));


    }
}
