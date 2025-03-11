package com.byte_;

public class Type_ {
    public static void main(String[] args) {
        System.out.println(josephus(5,3));
    }
    public static int josephus(int n,int m){
        if (n == 1){
            return 0;
        }else {
            return (josephus(n - 1,m) + m) % n;
        }
    }
}
