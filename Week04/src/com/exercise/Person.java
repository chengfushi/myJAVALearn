package com.exercise;


public class Person {
    //单例设计模式-懒汉式
    
    private Person(){}
    
    private static Person person;
    
    public static Person getInstance(){
        if (person == null) {
            return new Person();
        }
        return person;
    }
}
