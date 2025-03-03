package oop.project;
/*定义项目经理类Manager。
属性：姓名name，工号id，工资salary，奖金bonus。
行为：工作work()
*/
public class Manager extends Employee {
    private int bonus;

    public Manager(){
        super(" "," ",0);
    };

    public Manager(String name,String id,int salary,int bonus){
        super(name,id,salary);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public void work(){
        System.out.println("项目经理"+getName()+"正在工作，管理程序员，给程序员分配任务");
    }

    public void show(){
        System.out.println("工号："+getId()+"，姓名："+getName()+"，工资："+getSalary()+"，奖金："+bonus);
    }

}
