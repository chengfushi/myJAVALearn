package extern_static.tlias;

public class Student extends Character{
    private String classRoom;

    public Student() {}

    public Student(String classRoom) {
        this.classRoom = classRoom;
    }

    public Student(String name, int age, String classRoom) {
        super(name, age);
        this.classRoom = classRoom;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    @Override
    public void showCurriculumSchedule() {
        System.out.println("学生" + getName() + "的课表是");
    }

    public void fillForm(){
        System.out.println("学生" + getName() + "填写了表单");
    }
}
