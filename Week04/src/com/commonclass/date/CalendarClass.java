package com.commonclass.date;


import java.util.Calendar;

public class CalendarClass {
    public static void main(String[] args) {
        //Calender是一个抽象类，并且构造器是private
        Calendar c = Calendar.getInstance();
        System.out.println(c);
        //年
        System.out.println("year" + c.get(Calendar.YEAR));
        //月
        System.out.println("month" + c.get(Calendar.MONTH));
        //日
        System.out.println("day" + c.get(Calendar.DAY_OF_MONTH));
        //时
        System.out.println("hour" + c.get(Calendar.HOUR_OF_DAY));
        //分
        System.out.println("min" + c.get(Calendar.MINUTE));
        //秒
        System.out.println("second" + c.get(Calendar.SECOND));
    }
}
