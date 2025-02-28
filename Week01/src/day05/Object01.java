package day05;

public class Object01 {
    public static void main(String[] args) {
        Cat a = new Cat();
        a.name = "Tom";
        a.age = 2;
        System.out.println(a.name);

        Cat b = a;
        b = null;
        System.out.println(b);
        System.out.println(a.age);
    }
}

class Cat{
    String name;
    int age;
}
