package oop.animal;

public class Cat extends Animal{
    public Cat(){
        super(" ", " ");
    }

    public Cat(String color,String breed){
        super(color,breed);
    }

    public void eat(){
        System.out.println(this.getColor() + "的" + this.getBreed() + "正在吃鱼.....");
    }
    public void catchMouse(){
        System.out.println(this.getColor() + "的" + this.getBreed() + "正在逮老鼠....");
    }
}
