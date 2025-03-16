package com.enum_;
/*
@Author Chengfu Shi
@Description 通过枚举实现接口
*/
public class EnumInnerClass {
    public static void main(String[] args) {
        MusicEnum musicEnum = MusicEnum.MUSIC1;
        musicEnum.play();
        musicEnum.stop();

    }
}

interface Music {
    public void play();
    public void stop();
}

enum MusicEnum implements Music{
    MUSIC1("music1"),MUSIC2("music2"),MUSIC3("music3");

    private String name;

    MusicEnum(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("播放音乐：" + name);
    }

    @Override
    public void stop() {
        System.out.println("停止播放音乐：" + name);
    }
}