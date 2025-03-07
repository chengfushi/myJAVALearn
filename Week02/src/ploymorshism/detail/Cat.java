package ploymorshism.detail;

public class Cat extends Animal{

    public Cat() {
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public void cry() {
        System.out.println("Cat is crying");
    }

    public void fly() {
        System.out.println("飛");
    }
}
