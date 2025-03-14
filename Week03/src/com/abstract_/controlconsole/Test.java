package com.abstract_.controlconsole;
//在测试类Test中创建A的对象a并调用成员方法methodA(),要求用两种方式实现
public class Test {
    public static void main(String[] args) {
        A a1 = new A();
        a1.methodA(new InterA() {
            @Override
            public void showA() {
                System.out.println("showA");
            }
        });
        
        A a2 = new A();

        a2.methodA(() -> System.out.println("showA"));
    }
}

//定义接口
interface InterA {
    void showA();
}

class A {
    public void methodA(InterA a) {
        a.showA();
    }

}
