package ploymorshism.detail;

public class PloyDetail {
    public static void main(String[] args) {
        Object obj = new Cat();

        //可以调用父类的所有成员
        //不能调用子类特有的成员
        //因为在编译阶段，能调用哪些成员，是由编译类型来决定的

        Animal animal = new Cat();
        animal.cry();

        Cat cat = (Cat) animal;
        cat.run();
    }
}
