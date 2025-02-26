package day03;
/*
* 1.实现对数组的选择排序
* 2.进行二分查找
*/

import java.util.Scanner;

public class Demo6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("input the length of the array:");

        int len = scan.nextInt();

        //创建一个数组
        int[] arr = new int[len];

        //输入数组元素
        System.out.println("input the elements of the array:");
        for (int i = 0; i < len; i++){
            arr[i] = scan.nextInt();
        }

        //选择排序
        for (int i = 0; i < arr.length - 1; i++){
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }

            if (minIndex != i){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }

        //进行二分查找
        System.out.println("input the elements of the array you want to find");
        int elem = scan.nextInt();

        int left = 0;
        int right = arr.length - 1;

        while (left <= right){
            int mid = left + (right - left) / 2;

            if (arr[mid] > elem) right = mid - 1;
            else if (arr[mid] < elem) left = mid + 1;
            else System.out.println("the element index is" + mid); break;
        }
    }
}
