package oop.project;

public class Coder extends Employee {

    public Coder(String name, String id, int salary) {
        super(name, id, salary);
    }

    public Coder(){
        super(" "," ",0);
    };

    public void work(){
        System.out.println("程序员"+getName()+"正在工作，写代码，解决bug");
    }

    public void show(){
        System.out.println("工号："+getId()+"，姓名："+getName()+"，工资："+getSalary());
    }
}
