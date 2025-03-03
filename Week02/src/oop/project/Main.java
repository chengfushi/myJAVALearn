package oop.project;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("张三","001",15000,5000);
        Coder coder = new Coder("李四","002",10000);
        manager.work();
        manager.show();
        coder.work();
        coder.show();
    }
}
