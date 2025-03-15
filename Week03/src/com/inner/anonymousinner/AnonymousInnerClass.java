package com.inner.anonymousinner;
/*
* 匿名内部类
* */
public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.a.cry();
        outer.father.cry();
    }
}

interface A {
    public void cry();
}

class Outer {
    private int num = 10;

    //A的编译类型？A
    //A的运行类型？匿名内部类
    /*
    底层是：
    class XXX implements A {
        @Override
            public void cry() {
                System.out.println("匿名内部类");
            }
    }
    * */
    A a = new A() {
        @Override
        public void cry() {
            System.out.println("匿名内部类");
        }
    };

    //用类来实现匿名内部类
    Father father = new Father("father"){
        @Override
        public void cry() {
            super.cry();
        }
    };

}

class Father {
    private String name;

    public Father(String name) {
        this.name = name;
    }

    public void cry() {
        System.out.println("Father cry");
    }

}