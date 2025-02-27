package day04;

import java.util.Scanner;

//让用户依次录入三个整数，求出三个数中的最小值，并打印到控制台。
public class Demo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();


        System.out.println((num1 < num2 ? num1 : num2) < num3 ? (num1 < num2 ? num1 : num2) :num3);

    }
}
