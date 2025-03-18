package com.commonclass.date;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateClass {
    public static void main(String[] args) {
        //LocalDate类，只包含日期，可以获取日期字段
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        //LocalTime类，只包含时间，可以获取时间字段
        LocalTime localTime =  LocalTime.now();
        System.out.println(localTime);

        //LocalDateTime类，包含日期和时间，可以获取日期和时间字段
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        //通过plus和minus方法来对当前日期进行加减操作
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        System.out.println(dateTimeFormatter.format(localDateTime.plusDays(1)));
        System.out.println(dateTimeFormatter.format(localDateTime.minusDays(1)));



    }
}
