package day06;

import java.util.Scanner;

//在主方法中通过键盘录入三个整数。定义一个方法，方法接收三个整数变量，在方法中从大到小依次打印三个变量。执行效果如下：
public class Method03 {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        printNum(num1,num2,num3);

    }
    public  static void printNum(int a,int b,int c){
        int maxNum = (a > b ? a : b) > c ? (a > b ? a : b) : c;
        int minNum = (a < b ? a : b) < c ? (a < b ? a : b) : c;
        int midNum = a + b + c - maxNum - minNum;

        System.out.println(maxNum + " " + midNum + " " + minNum);
    }
}
