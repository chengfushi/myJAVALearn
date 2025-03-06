package collection.teacher;

import java.util.ArrayList;

/*请定义教师（Teacher）类，属性包含姓名和专业名称。
将若干教师对象存入ArrayList集合中，并遍历集合打印教师信息，格式如下：
姓名：赵老师, 专业：javase
姓名：钱老师, 专业：javaee
姓名：孙老师, 专业：php
姓名：李老师, 专业：python
*/
public class Main {
    public static void main(String[] args) {
        ArrayList<Teacher> teachers = new ArrayList<>();

        teachers.add(new Teacher("赵老师", "javase"));
        teachers.add(new Teacher("钱老师", "javaee"));
        teachers.add(new Teacher("孙老师", "php"));
        teachers.add(new Teacher("李老师", "python"));

        for (int i = 0; i < teachers.size(); i++){
            System.out.println("姓名：" + teachers.get(i).getName() + ", 专业：" + teachers.get(i).getSubject());
        }
    }
}
