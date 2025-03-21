package com.generic_.method;


public class GenericExtend {
    public static void main(String[] args) {
        Bottle2 bottle2 = new Bottle2();
        bottle2.show("123");
    }
}

class Bottle<T> {
    public void show(T t){
        System.out.println(t.getClass());
    }
}

class Bottle2 extends Bottle<String>{}