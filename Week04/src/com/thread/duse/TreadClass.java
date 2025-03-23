package com.thread.duse;


public class TreadClass {
    public static void main(String[] args) throws InterruptedException {
        Cat cat = new Cat();
        cat.start();
        
        System.out.println("thread main is running" + "线程名" + Thread.currentThread().getName());
        
        for (int i = 0; i < 60; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class Cat extends Thread{
    
    int time = 0;
    
    @Override
    public void run() {
        
        while (true) {
            System.out.println("thread cat is running" + "线程名" + Thread.currentThread().getName());
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            time++;
            if (time ==80) {
                break;
            }
        }
    }
}
