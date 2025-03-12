package com.design.hunger;

public class Person {
    private String name;
    private int age;

    public static Person person = new Person("John", 25);
    private Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static Person getInstance(){
        return person;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
