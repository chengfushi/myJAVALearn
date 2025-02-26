package day03;
/*
* 键盘录入一个三位数，求这个三位数每一位的数字和。
*/

import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        //使用scanner类获取键盘输入
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        //获取各位和
        int placeSum = 0;

        while (num > 0){
            placeSum += num % 10;
            num /= 10;
        }

        System.out.println(placeSum);

    }
}
