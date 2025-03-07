package ployparameter;

public class Manager extends Employee {
    private double bonus;

    public Manager() {}
    public Manager(double bonus) {
        this.bonus = bonus;
    }

    public Manager(double salary, double bonus) {
        super(salary);
        this.bonus = bonus;
    }

    public void manager(){
        System.out.println("I am a manager.");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual() + this.bonus;
    }
}
