package com.palindromicnumber;
import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        int number = 0, d5, d4, d3, d2, d1;
        Scanner reader = new Scanner(System.in);
        System.out.println("输入一个1至99999之间的数");
        number = reader.nextInt();

        // 【代码 1】 判断 number 在 1~99999 的条件
        if (number >= 1 && number <= 99999) {
            // 【代码 2】 计算 number 的最高位 d5（万位）
            d5 = number / 10000;
            // 【代码 3】 计算 number 的千位 d4
            d4 = (number % 10000) / 1000;
            // 【代码 4】 计算 number 的百位 d3
            d3 = (number % 1000) / 100;
            d2 = number % 100 / 10;
            d1 = number % 10;

            // 【代码 5】 判断 number 是 5 位数的条件
            if (d5 != 0) {
                System.out.println(number + "是5位数");
                // 【代码 6】 判断 number 是回文数的条件
                if (d1 == d5 && d2 == d4) {
                    System.out.println(number + "是回文数");
                } else {
                    System.out.println(number + "不是回文数");
                }
            } else if (d4 != 0) { // 【代码 7】 判断 number 是 4 位数的条件
                System.out.println(number + "是4位数");
                // 【代码 8】 判断 number 是回文数的条件
                if (d1 == d4 && d2 == d3) {
                    System.out.println(number + "是回文数");
                } else {
                    System.out.println(number + "不是回文数");
                }
            } else if (d3 != 0) { // 【代码 9】 判断 number 是 3 位数的条件
                System.out.println(number + "是3位数");
                // 【代码 10】 判断 number 是回文数的条件
                if (d1 == d3) {
                    System.out.println(number + "是回文数");
                } else {
                    System.out.println(number + "不是回文数");
                }
            } else if (d2 != 0) {
                System.out.println(number + "是2位数");
                if (d1 == d2) {
                    System.out.println(number + "是回文数");
                } else {
                    System.out.println(number + "不是回文数");
                }
            } else if (d1 != 0) {
                System.out.println(number + "是1位数");
                System.out.println(number + "是回文数");
            } else {
                System.out.printf("\n%d 不在1至99999之间", number);
            }
        } else {
            System.out.printf("\n%d 不在1至99999之间", number);
        }
    }
}

