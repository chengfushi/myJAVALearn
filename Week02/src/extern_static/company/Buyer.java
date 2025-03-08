package extern_static.company;

public class Buyer extends AdminStaff{
    public Buyer() {
    }

    public Buyer(String subject) {
        super(subject);
    }

    public Buyer(String id, String name, String subject) {
        super(id, name, subject);
    }

    @Override
    public void work(){
        System.out.println("我是买家，我正在购物");
    }
}
