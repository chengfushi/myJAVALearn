package extern_static.company;

public class Tutor extends Teacher{
    public Tutor() {
    }

    public Tutor(String subject) {
        super(subject);
    }

    public Tutor(String id, String name, String subject) {
        super(id, name, subject);
    }

    @Override
    public void work() {
        System.out.println("Tutor is working");
    }
}
