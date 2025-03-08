package extern_static.tlias;

public class Teacher extends Character{
    private String section;

    public Teacher (){

    }

    public Teacher(String section) {
        this.section = section;
    }

    public Teacher(String name, int age, String section) {
        super(name, age);
        this.section = section;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    @Override
    public void showCurriculumSchedule(){
        System.out.println("Teacher showCurriculumSchedule");
    }

    public void publicForm() {
        System.out.println("Teacher publicForm");
    }
}
