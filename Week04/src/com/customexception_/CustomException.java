package com.customexception_;

import java.util.Scanner;

public class CustomException {
    public static void main(String[] args) {
        //输入一个整数，要求在0到100之间，否则抛出异常
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入一个整数：");
        int input = scanner.nextInt();

        if (input < 0 || input > 100) {
            throw new NumberException("输入的整数不在0到100之间");
        }

        System.out.println("输入的整数是" + input);
    }
}

class NumberException extends RuntimeException {

    public NumberException(String message) {
        super(message);
    }
}
