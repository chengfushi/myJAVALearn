package day06;
//编写copyPerson可以复制一个Person对象，
//返回复制的对象。
public class MethodClone {
    public static void main(String[] args) {

    }
}
class Person{
    String name;
    int age;
}
class MyTools{
    public Person copyPerson(Person p){
        Person p2 = new Person();
        p2.name = p.name;
        p2.age = p.age;

        return p2;
    }
}