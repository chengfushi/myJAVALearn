package extern_static.phone;

public class Text {
    public static void main(String[] args) {
        Phone phone = new Phone("Apple" ,9999.99);

        phone.call();
        phone.sendMessage();
        phone.playGame();

        System.out.println(phone.getBrand() + phone.getPrice());

    }
}
