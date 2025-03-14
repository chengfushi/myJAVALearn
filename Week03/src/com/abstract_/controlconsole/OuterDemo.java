package com.abstract_.controlconsole;
//在控制台输出”HelloWorld”
//
//自己书写，不要用idea自动生成。
interface Inter {
    void show();
}
class Outer {
    public static Inter method() {
        return new Inter() {
            @Override
            public void show() {
                System.out.println("Hello World");
            }
        };
    }
}
public class OuterDemo {
    public static void main(String[] args) {
        Outer.method().show();
    }
}