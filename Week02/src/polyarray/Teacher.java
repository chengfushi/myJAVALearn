package polyarray;

public class Teacher extends Person{
    private double salary;

    public Teacher(double salary) {
        this.salary = salary;
    }

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void say(){
        System.out.println("I am a teacher.");
    }
}
