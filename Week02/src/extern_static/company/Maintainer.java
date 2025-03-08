package extern_static.company;

public class Maintainer extends AdminStaff{
    public Maintainer() {
    }

    public Maintainer(String subject) {
        super(subject);
    }

    public Maintainer(String id, String name, String subject) {
        super(id, name, subject);
    }
    @Override
    public void work(){
        System.out.println("维护公司");
    }
}
