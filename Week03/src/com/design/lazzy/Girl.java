package com.design.lazzy;

public class Girl {
    private String name;
    //首先，将构造器私有化
    private Girl(String name){
        this.name = name;
    }

    //创建一个静态的成员变量，这里默认为空
    private static Girl girl;

    //创建一个静态的成员方法，返回一个对象
    public static Girl getInstance(){
        if (girl == null) {
            girl = new Girl("小红");
        }
        return girl;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                '}';
    }
}
