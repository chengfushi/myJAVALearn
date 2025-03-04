package oopexercise.student;
/*定义数组存储3个学生对象。

​ 学生的属性：学号，姓名，年龄。

​ 要求1：添加的时候需要进行学号的唯一性判断。

​ 要求2：添加完毕之后，遍历所有学生信息。

​ 要求3：通过id删除学生信息

​ 如果存在，则删除，如果不存在，则提示删除失败。

​ 要求4：删除完毕之后，遍历所有学生信息。

​ 要求5：id为2的学生，年龄+1岁
*/
public class Main {
    public static void main(String[] args) {

    }

    public static void addStudent(Student student,Student[] students){
        for (Student s : students){
            if (s.idEquals(student.getId())){
                System.out.println("学号已存在");
                return;
            }
        }

        for (int i = 0; i < students.length; i++){
            if (students[i] == null){
                students[i] = student;
                System.out.println("添加成功");
                return;
            }
        }
    }

    public static void deleteStudent(Student[] students,String id){
        for (int i = 0; i < students.length; i++){
            if (students[i].getId().equals(id)){
                students[i] = null;
                System.out.println("删除成功");
                return;
            }
        }

        System.out.println("未找到学生信息");
    }
}
