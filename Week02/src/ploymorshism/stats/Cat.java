package ploymorshism.stats;

public class Cat extends Animal{
    private String name = "Cat";

    public Cat(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
}
