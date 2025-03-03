package oop.animal;

public class Dog extends Animal {
    public Dog() {
        super(" ", " ");
    }

    public Dog(String color, String breed) {
        super(color, breed);
    }

    public void eat() {
        System.out.println(this.getColor() + "的" + this.getBreed() + "正在啃骨头.....");
    }

    public void lookHome() {
        System.out.println(this.getColor() + "的" + this.getBreed() + "正在看家.....");
    }

}
