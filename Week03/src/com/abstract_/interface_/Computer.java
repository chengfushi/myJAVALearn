package com.abstract_.interface_;

public class Computer implements UsbInterface{
    private String brand;

    public Computer(){}

    public Computer(String brand) {
        this.brand = brand;
    }

    @Override
    public void start() {
        System.out.println("电脑开机");
    }

    @Override
    public void close() {
        System.out.println("电脑关机");
    }
}
