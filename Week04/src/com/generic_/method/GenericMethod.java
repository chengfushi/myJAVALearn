package com.generic_.method;



public class GenericMethod {
    public static void main(String[] args) {
        Person<String,Integer> person = new Person<>("小白",100);
        person.show();

    }


}


class Person<T,R> {
    private T t;
    private R r;

    public Person(T t, R r) {
        this.t = t;
        this.r = r;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public R getR() {
        return r;
    }

    public void setR(R r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Person{" +
                "t=" + t +
                ", r=" + r +
                '}';
    }

    public <T,R> void show() {
        System.out.println(t.getClass());
        System.out.println(r.getClass());
    }
}
