package com.exception_;


import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        //输入一个整数，如果输入的不是整数，那么一直循环输入
        Scanner scanner = new Scanner(System.in);

        int number = 0;
        String input = "";
        while (true) {
            System.out.println("请输入一个整数");
            input = scanner.next();

            try {
                number = Integer.parseInt(input);
                break;
            }catch (NumberFormatException e){
                System.out.println("输入错误，请重新输入");
            }
        }

        System.out.println("输入的整数是" + number);
    }
}
