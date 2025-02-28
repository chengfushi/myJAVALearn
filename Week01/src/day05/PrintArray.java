package day05;

import java.util.Scanner;

//请创建一个长度为6的整数数组，并为数组中的元素赋值。遍历数组，打印所有元素，元素之间用空格隔开。比如：
public class PrintArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[6];

        System.out.println("Please enter 6 integers:");

        for (int i = 0; i < arr.length; i++){
            arr[i] = scan.nextInt();
        }

        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }

    }
}
