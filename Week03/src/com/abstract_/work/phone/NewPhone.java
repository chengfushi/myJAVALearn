package com.abstract_.work.phone;

public class NewPhone extends Phone implements IPlay{
    public NewPhone() {}

    @Override
    public void play() {
        System.out.println("新手机玩儿游戏");
    }
}
