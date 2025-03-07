package ployparameter;

public class NormalEmployee extends Employee{
    public NormalEmployee() {}

    public NormalEmployee(double salary) {
        super(salary);
    }

    public void work(){
        System.out.println("I am a normal employee.");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }
}
