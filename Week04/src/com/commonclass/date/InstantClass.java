package com.commonclass.date;


import java.time.Instant;
import java.util.Date;

public class InstantClass {
    public static void main(String[] args) {
        //时间戳
        Instant now = Instant.now();
        System.out.println(now);

        //通过from将instant转成date
        Date date = Date.from(now);
        System.out.println(date);

        //通过date的toInstant()方法可以把date转化为instant
        Instant instant = date.toInstant();
        System.out.println(instant);
    }
}
