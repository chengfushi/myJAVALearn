package com.exercise;


public class Computer {
    //单例设计模式-饿汉式
    private Computer() {}
    
    private static Computer computer = new Computer();
    
    public static Computer getInstance() {
        return computer;
    }
}
