package oop.phone;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();

        phone.setBrand("小米");
        phone.setPrice(3988);
        phone.setColor("黑色");

        phone.call();
        phone.sendMessage();
    }
}
