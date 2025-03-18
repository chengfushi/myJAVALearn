package com.array;


import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,500,600,700,800};
        int[] b,c,d;
        System.out.println(Arrays.toString(a));
        b = Arrays.copyOf(a,a.length);
        System.out.println(Arrays.toString(b));

        //Arrays类调用copyOf方法复制数组a的前4个元素
        c = Arrays.copyOf(a,4);
        System.out.println(Arrays.toString(c));
        //Arrays类调用copyOf方法复制数组a的后4个元素
        d = Arrays.copyOfRange(a,4,a.length);
        System.out.println(Arrays.toString(d));


        d[d.length - 1] = -200;
        System.out.println(Arrays.toString(d));
    }
}
