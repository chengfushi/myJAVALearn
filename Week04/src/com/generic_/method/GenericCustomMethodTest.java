package com.generic_.method;


import org.junit.Test;

public class GenericCustomMethodTest {
    @Test
    public void test1() {
        Car car = new Car();
        car.run();
        car.show("Tom");
    }

}

class Car{

    public void run() {
        System.out.println("Car is running");
    }

    public <T> void show(T t) {
        System.out.println(t.getClass());
    }
}
