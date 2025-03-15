package com.inner.menber;

public class MemberInnerClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.f1();

        //外部其他类使用成员内部类，三种方式
        Outer.Inner inner = outer.new Inner();
        inner.clod();

        Outer.Inner inner1 = new Outer().new Inner();
        inner1.clod();

        //在外部类写一个方法 返回内部类对象
        Outer.Inner inner2 = new Outer().getInner();
        inner2.clod();
    }
}

class Outer {
    private int n = 10;

    //成员内部类，属于内部类的一个成员，可以添加访问权限修饰符，默认是包访问权限
    class Inner {
        public void clod() {
            System.out.println(n);
        }
    }

    public void f1() {
        new Inner().clod();
    }

    public Inner getInner() {
        return new Inner();
    }
}
