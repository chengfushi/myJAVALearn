package com.abstract_.interface_;

public class Main {
    public static void main(String[] args) {
        Tools tools = new Tools();
        Computer computer = new Computer("Dell");
        Phone phone = new Phone("Apple");
        tools.work(computer);
        tools.work(phone);
    }
}
