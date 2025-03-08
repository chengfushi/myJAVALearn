package extern_static.company;

public class Lecturer extends Teacher{
    public Lecturer() {}

    public Lecturer(String subject) {
        super(subject);
    }

    public Lecturer(String id, String name, String subject) {
        super(id, name, subject);
    }

    @Override
    public void work(){
        System.out.println("I am a lecturer, I am teaching");
    }
}
