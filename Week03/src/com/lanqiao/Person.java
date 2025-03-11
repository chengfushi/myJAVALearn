package com.lanqiao;

public class Person {
    private int id;
    public static int total = 0;

    public static void setTotalPerson(int total){
//        this.total = total;这是错误的，因为this.total是当前对象的total，而total是形参，所以不能这样写
        Person.total = total;
    }

    public Person(){
        ++total;
        id = total;
    }
}
