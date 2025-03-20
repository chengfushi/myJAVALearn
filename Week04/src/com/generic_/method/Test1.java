package com.generic_.method;


import org.junit.Test;

public class Test1 {
    @Test
    public void test1() {
        Person<String, Integer> p1 = new Person<>("Tom", 12);
        p1.show();
        Person<Integer, String> p2 = new Person<>(12, "Tom");
        p2.show();
    }
}
