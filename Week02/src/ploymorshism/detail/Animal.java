package ploymorshism.detail;

public class Animal {
    protected String name;

    public Animal() {}
    public Animal(String name) {
        this.name = name;
    }

    public void cry() {
        System.out.println("Animal is crying");
    }

    public void run() {
        System.out.println("跑");
    }
}
