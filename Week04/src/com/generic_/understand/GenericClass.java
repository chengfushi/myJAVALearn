package com.generic_.understand;


import java.util.ArrayList;

public class GenericClass {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Dog("旺财",3));
        arrayList.add(new Dog("大黄",5));
        arrayList.add(new Dog("小黄",1));

        //假如这里不小心加入了一个Cat对象
        arrayList.add(new Cat("小花",2));

        for (Object o : arrayList) {
            //向下转型
            Dog dog = (Dog) o;
            System.out.println(dog.getName() + "--" + dog.getAge());
        }



    }
}


class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}