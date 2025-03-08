package extern_static.company;

public class AdminStaff extends Employee{
    private String subject = "行政部";

    public AdminStaff(){}

    public AdminStaff(String subject) {
        this.subject = subject;
    }

    public AdminStaff(String id, String name, String subject) {
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
