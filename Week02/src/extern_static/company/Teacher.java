package extern_static.company;

public class Teacher extends Employee{
    private String subject = "教研部";

    public Teacher(){}
    public Teacher(String subject) {
        this.subject = subject;
    }

    public Teacher(String id, String name, String subject) {
        super(id, name);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
