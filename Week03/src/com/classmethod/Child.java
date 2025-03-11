package com.classmethod;

public class Child {
    private String name;
    public static int count = 0;

    public Child () {}

    public Child(String name) {
        this.name = name;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
