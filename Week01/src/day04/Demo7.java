package day04;

import java.util.Scanner;

//键盘录入两个数字number1和number2表示一个范围，求这个范围之内的数字和。
public class Demo7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number1 = scan.nextInt();
        int number2 = scan.nextInt();

        if (number1 > number2){
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        int sum = 0;

        for (int i = number1; i <= number2; i++){
            sum += i;
        }

        System.out.println(sum);

    }
}
