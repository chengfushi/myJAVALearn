package com.design.hunger;
//饿汉式设计模式
//1.构造器私有化 =》防止直接new
//2.类的内部创建对象
//3.向外暴露一个静态的公共方法。getlnstance
public class Girl {
    private String name;

    private Girl(String name) {
        this.name = name;
    }

    private static Girl girl = new Girl("小红");

    public static Girl getInstance(){
        return girl;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                '}';
    }
}
