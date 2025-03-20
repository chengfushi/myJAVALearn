package com.generic_.method;


public class CustomMethodGeneric {
    public static void main(String[] args) {
        Apple<String,Integer,Double> apple = new Apple<>();
        apple.show("111");

    }
}

class Apple<T,R,E> {

    public <E> void show(E e) {
        System.out.println(e.getClass());
        System.out.println(e);
    }
}

