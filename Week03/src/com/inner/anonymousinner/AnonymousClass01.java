package com.inner.anonymousinner;

public class AnonymousClass01 {
    public static void main(String[] args) {
        AnonymousClass anonymousClass = new AnonymousClass();
        anonymousClass.person.cry();
        anonymousClass.b.cry();
    }
}

class Person{
    public void cry(){}
}

interface B{
    public void cry();
}


class AnonymousClass {
    private int num = 10;

    //创建匿名内部类
    Person person = new Person(){
        @Override
        public void cry() {
            System.out.println("基于类的匿名内部类");
        }
    };

    B b = new B(){
        @Override
        public void cry() {
            System.out.println("基于接口的匿名内部类");
        }
    };

    public AnonymousClass() {
        new Person(){
            @Override
            public void cry() {
                System.out.println("基于类的匿名内部类");
            }
        }.cry();

    }
}