package com.thread.duse;


public class ThreadUse {
    public static void main(String[] args) {
        T1 t1 = new T1();
        T2 t2 = new T2();
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        thread1.start();
        thread2.start();
        
        
    }
}

class T1 implements Runnable {
    
    int count = 0;
    
    /**
     *@Description 重写run方法，测试线程
     *@return void
     *@date 2025/3/23 16:28
     *@auther Chengfu Shi
     */
    @Override
    public void run() {
        while (true) {
            System.out.println("h1" + Thread.currentThread().getName());
            count++;
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            if (count == 5) {
                break;
            }
        }
    }
}


class T2 implements Runnable {
    
    int count = 0;
    @Override
    public void run() {
        while (true) {
            System.out.println("h2" + Thread.currentThread().getName());
            count++;
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            if (count == 5) {
                break;
            }
        }
    }
}