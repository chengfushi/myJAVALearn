package day05;

import java.util.Scanner;

//有一个数组，其中有十个元素从小到大依次排列 {12,14,23,45,66,68,70,77,90,91}。
// 再通过键盘录入一个整数数字。
// 要求：把数字放入数组序列中，生成一个新的数组，并且数组的元素依旧是从小到大排列。
public class InsertNum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] preArray = {12,14,23,45,66,68,70,77,90,91};

        int newNum = scan.nextInt();

        int[] newArray = new int[preArray.length + 1];

        int Index = 0;
        boolean inserted = false;
        for (int i = 0; i < newArray.length; i++){
            if (preArray[Index] > newNum && !inserted){
                newArray[i] = newNum;
                inserted = true;
            }else {
                newArray[i] = preArray[Index++];
            }
        }

        for (int i = 0; i < newArray.length; i++){
            System.out.println(newArray[i]);
        }

    }
}
