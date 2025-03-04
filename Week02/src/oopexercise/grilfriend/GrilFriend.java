package oopexercise.grilfriend;

public class GrilFriend {
    private String name;
    private int age;
    private char sex;
    private String found;

    public GrilFriend() {};

    public GrilFriend(String name, int age, char sex, String found) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.found = found;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getFound() {
        return found;
    }

    public void setFound(String found) {
        this.found = found;
    }

    public void showInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Sex: " + sex + ", Found: " + found);
    }
}
