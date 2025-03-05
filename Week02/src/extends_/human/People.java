package extends_.human;

public class People {
    protected String name;
    protected int age;
    protected char gender;

    public People() {
        System.out.println("People无参构造器被调用");
    }

    public People(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        System.out.println("People(String name, int age,char gender)构造器被调用");
    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("People(String name, int age)构造器被调用");
    }

    public People(String name) {
        this.name = name;
        System.out.println("People(String name)构造器被调用");
    }
}
