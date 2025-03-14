package com.abstract_.interface_;

public class Phone implements UsbInterface{
    private String brand;

    public Phone() {}

    public Phone(String brand) {
        this.brand = brand;
    }

    @Override
    public void start() {
        System.out.println("手机开始工作");
    }

    @Override
    public void close() {
        System.out.println("手机结束工作");
    }
}
