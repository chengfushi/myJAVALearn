package day03;

import java.util.Scanner;

/*
    数字6是一个真正伟大的数字，键盘录入两个整数。

 	如果其中一个为6，最终结果输出true。

  	如果它们的和为6的倍数。最终结果输出true。

  	其他情况都是false。
*/
public class Demo4 {
    public static void main(String[] args) {
        //使用scanner类获取键盘输入
        Scanner scan = new Scanner(System.in);

        // 创建两个变量存储输入数据
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        //判断结果
        System.out.println((num1 == 6 || num2 == 6) || (num1 + num2) % 6 == 0);



    }
}
