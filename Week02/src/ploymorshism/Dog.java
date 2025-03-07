package ploymorshism;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void cry() {
        System.out.println("Dog is crying");
    }

}
