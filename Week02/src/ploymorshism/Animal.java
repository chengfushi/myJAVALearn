package ploymorshism;

public class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void cry() {
        System.out.println("Animal is crying");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
