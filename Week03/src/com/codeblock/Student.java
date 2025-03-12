package com.codeblock;

public class Student extends Person{
    private int age;

    static {
        System.out.println("student static");
    }

    {
        System.out.println("student");
    };

    public Student(){}

    public Student(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        super(name);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void call(){
        System.out.println("student call");
    }
}
