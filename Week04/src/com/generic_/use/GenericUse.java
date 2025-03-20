package com.generic_.use;


public class GenericUse {
    public static void main(String[] args) {
        Person<String> person1 = new Person<String>("小明");
        person1.show();

        Person<Integer> person2 = new Person<Integer>(1000);
        person2.show();

        Person<String> stringPerson = new Person<String>(" ");

    }
}

class Person<E> {
    private E s;

    public Person(E s) {
        this.s = s;
    }

    public E getS() {
        return s;
    }

    public void setS(E s) {
        this.s = s;
    }

    public void show(){
        System.out.println(s.getClass());
    }
}
