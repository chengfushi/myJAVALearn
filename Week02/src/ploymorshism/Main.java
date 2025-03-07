package ploymorshism;

public class Main {
    public static void main(String[] args) {
        // 编译类型与运行类型
        //animal 的编译类型是Animal
        //animal 的运行类型是Cat
        Animal animal = new Cat("tom");
        // animal的运行类型是什么，就会调用谁的方法
        animal.cry();//因为运行时，animal的运行类型时cat
        test(animal);

        animal = new Dog("Dog");
        animal.cry();//运行到这里时 animal的运行；类型是Dog

        test(animal);




    }
    public static void test(Animal animal){
        System.out.println(animal.getName());
    }
}
