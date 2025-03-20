package com.generic_.understand;


import java.util.ArrayList;
@SuppressWarnings({"all"})
public class GenericUse {
    public static void main(String[] args) {
        //泛型的快速体验

        ArrayList<Dog> arrayList = new ArrayList<>();
        arrayList.add(new Dog("旺财",3));
        arrayList.add(new Dog("大黄",5));
        arrayList.add(new Dog("小黄",1));

        //不小心添加了一只猫
//        arrayList.add(new Cat("cat",2));//这里就会报错

        //进行循环
        for (Dog dog : arrayList) {
            System.out.println(dog.getName() + "--" + dog.getAge());
        }
    }
}
