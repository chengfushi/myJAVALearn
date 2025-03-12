package com.codeblock;

public class Person {
    private String name;

    public static void call(){
        System.out.println("叫");
    }


    {
        System.out.println("非静态类代码块");
    };

    static {
        System.out.println("静态类代码块");
    };

    public Person() {
        System.out.println("构造方法");
    }
    public Person(String name) {
        this.name = name;
        System.out.println("构造方法");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println("吃");
    }
}
