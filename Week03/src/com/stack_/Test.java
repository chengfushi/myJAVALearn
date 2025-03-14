package com.stack_;

public class Test {
    public static void main(String[] args) {
        Queue_ queue = new Queue_();

        queue.push_(1);
        queue.push_(2);
        queue.push_(3);
        System.out.println(queue.pop());
    }
}
