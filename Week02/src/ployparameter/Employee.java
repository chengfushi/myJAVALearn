package ployparameter;

public class Employee {
    private double salary;

    public Employee() {}
    public Employee(double salary) {
        this.salary = salary;
    }

    public double getAnnual() {
        return 12 * this.salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
