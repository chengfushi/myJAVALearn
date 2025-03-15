package com.inner.staticinner;

public class StaticInnerClass {
    public static void main(String[] args) {
        new Outer.Inner().clod();
    }
}

class Outer {

    static class Inner {
        public void clod(){
            System.out.println("静态内部类");
        }
    }
}
