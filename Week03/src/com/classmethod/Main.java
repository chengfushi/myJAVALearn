package com.classmethod;

public class Main {
    public static void main(String[] args) {
        System.out.println(Child.count);

        Child child1 = new Child("child1");
        Child child2 = new Child("child2");
        Child child3 = new Child("child3");

        System.out.println(Child.count);

    }
}
