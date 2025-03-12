package com.design.lazzy;

public class Person {
    private String name;
    private int age;

    public static Person person;

    private Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static Person getInstance(){
        if (person == null){
            person = new Person("小红", 18);
        }

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
