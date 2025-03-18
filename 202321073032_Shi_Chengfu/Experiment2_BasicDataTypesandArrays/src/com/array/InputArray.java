package com.array;


public class InputArray {
    public static void main(String[] args) {
        int[] a = {100,200,300};
        //输出数组a的长度
        System.out.println(a.length);
        //输出数组a的引用
        System.out.println(a);
        int b[][] = {{1},{1,1},{1,2,1},{1,3,3,1},{1,4,6,4,1}};
        //输出数组b的一维数组个数
        System.out.println(b.length);



        //将数组a的引用赋值给b[4]
        b[4] = a;//
        System.out.println(b[4][2]);

        System.out.println(b[0].length);
        System.out.println(b[0]);
        System.out.println(b[1].length);
        System.out.println(b[1]);
        System.out.println(b[2].length);
        System.out.println(b[2]);
        System.out.println(b[3].length);
        System.out.println(b[3]);
        System.out.println(b[4].length);
        System.out.println(b[4]);


    }
}
