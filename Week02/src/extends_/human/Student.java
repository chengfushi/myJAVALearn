package extends_.human;

public class Student extends People {

    public Student(String name,int age,char gender) {
        super(name, age, gender);
    }
    public Student(String name,int age) {
        super(name, age);
    }
    public Student(String name) {
        super(name);
    }

}
