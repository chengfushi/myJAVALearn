package ployparameter;

public class PloyParameter {
    public static void main(String[] args) {

    }
    public void showEmployAnnual(Employee e) {
        System.out.println(e.getAnnual());
    }

    public void textWork(Employee e){
        if (e instanceof Manager) {
            ((Manager) e).manager();
        }else if (e instanceof NormalEmployee) {
            ((NormalEmployee) e).work();
        }
    }
}
