package collection.employee;

import java.util.ArrayList;

/*有如下员工信息：

姓名：张三，工资：3000
姓名：李四，工资：3500
姓名：王五，工资：4000
姓名：赵六，工资：4500
姓名：田七，工资：5000
先需要将所有的员工信息都存入ArrayList集合中，并完成如下操作：

1、判断是否有姓名为“王五”的员工，如果有，改名为“王小五”

2、判断是否有姓名为“赵六”的员工，如果有，将其删除

3、给姓名为“田七”的员工，涨500工资
*/
public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("张三", 3000));
        employees.add(new Employee("李四", 3500));
        employees.add(new Employee("王五", 4000));
        employees.add(new Employee("赵六", 4500));
        employees.add(new Employee("田七", 5000));

        //1、判断是否有姓名为“王五”的员工，如果有，改名为“王小五”
        //2、判断是否有姓名为“赵六”的员工，如果有，将其删除
        //3、给姓名为“田七”的员工，涨500工资
        for (int i = 0; i < employees.size(); i++){
            if (employees.get(i).getName().equals("王五")) employees.get(i).setName("王小五");
            if (employees.get(i).getName().equals("赵六")) employees.remove(i);
            if (employees.get(i).getName().equals("田七")) employees.get(i).setSalary(employees.get(i).getSalary() + 500);
        }

        for (int i = 0; i < employees.size(); i++){
            System.out.println("姓名：" + employees.get(i).getName() + ", 工资：" + employees.get(i).getSalary());
        }


    }
}
