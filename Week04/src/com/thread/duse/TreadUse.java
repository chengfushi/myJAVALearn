package com.thread.duse;

public class TreadUse {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Thread thread = new Thread(tiger);
        thread.start();
    }
}


class Tiger implements Runnable {
    int count = 0;
    
    @Override
    public void run() {
        while (true) {
            System.out.println("hi" + Thread.currentThread().getName());
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
    
    

    public int getCount(String name,String id) {
        return count;
    }
}
