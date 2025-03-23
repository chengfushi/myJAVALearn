package com.thread.duse;


public class TreadInter {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Thread thread = new Thread(dog);
        thread.start();
        
    }
}


class Dog implements Runnable {
    
    @Override
    public void run() {
        System.out.println("thread dog is running" + "线程名" + Thread.currentThread().getName());
        
        int time = 0;
        
        while (true) {
            try {
                System.out.println("thread dog is running" + "线程名" + Thread.currentThread().getName());
                time++;
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (time == 5) {
                break;
            }
        }
    }
}