package day04;

import java.util.Scanner;

//需求：键盘录入两个数字，表示一个范围。
//
//        ​ 统计这个范围中。
//
//        ​ 既能被3整除，又能被5整除数字有多少个？
public class Demo8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int number1 = scan.nextInt();
        int number2 = scan.nextInt();

        if (number1 > number2){
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        int count = 0;

        for (int i = number1; i <= number2; i++) {
            if (i % 3 == 0 && i % 5 == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
