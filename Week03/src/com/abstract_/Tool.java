package com.abstract_;
//这个类计算一个方法计算的时间
abstract class Tool {

    public abstract void code();

    public void getTime(){
        long before = System.currentTimeMillis();

        code();

        long after = System.currentTimeMillis();

        System.out.println("程序运行时间：" + (after - before) + "ms");
    }
}
