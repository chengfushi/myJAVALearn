package com.inner.localinner;
/*
* 演示内部类的使用
* */
public class LocalInnerClass {
    public static void main(String[] args) {
        Outer01 outer01 = new Outer01();
        outer01.method();

    }
}
class Outer01 {
    private int n_1 = 100;

    public void method(){
        //局部内部类，定义在类方法的内部
        class Inner {
            private int n_1 = 200;
            //可以访问外部类的所有成员，包括私有的
            public void getN_1() {
                System.out.println(n_1 + Outer01.this.n_1);
            }

        }
        Inner inner = new Inner();
        inner.getN_1();
    }
}
