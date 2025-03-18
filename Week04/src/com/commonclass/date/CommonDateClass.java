package com.commonclass.date;


import java.text.SimpleDateFormat;
import java.util.Date;

public class CommonDateClass {
    public static void main(String[] args) {
        Date date = new Date();

        System.out.println("当前日期" + date);

        //创建SimpleDateFormat对象 可以指定相应的格式
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        System.out.println("当前日期" + simpleDateFormat.format(date));

        System.out.println(new SimpleDateFormat().format("2025年3月18日 15:12:30 星期二"));
    }
}
