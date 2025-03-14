package com.abstract_.interface_;

//在测试类Test中创建B的对象b，并调用成员方法methodB
public class Test {
    public static void main(String[] args) {
        B b = new B(new InterB() {
            @Override
            public void showB() {
                System.out.println("showB");
            }
        });

        b.methodB();

    }
}

//定义一个接口
interface InterB {
    void showB();
}

//目标：调用成员方法methodB
class B {
    InterB b;
    public B(InterB b){
        this.b = b;
    }
    public void methodB(){
        b.showB();
    }
}