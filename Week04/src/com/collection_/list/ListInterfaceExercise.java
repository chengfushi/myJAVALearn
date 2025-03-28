package com.collection_.list;
/*
* 添加10个以上的元素(比如String "hello")，
* 在2号位插入一个元素"韩顺平教育”，
* 获得第5个元素，删除第6个元素，修改第7个元素，
* 在使用迭代器遍历集合，
* 要求:使用List的实现类ArrayList完成。*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListInterfaceExercise {
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add("hello" + i);
        }

        //2号位插入一个元素"韩顺平教育"
        list.add(2,"韩顺平教育");
        //获得第五个元素
        System.out.println("第五个元素是："+list.get(4));
        //删除第六个元素
        System.out.println(list.remove(5));
        //修改第七个元素
        System.out.println(list.set(6, "scf"));

        //使用迭代器遍历集合
        Iterator iterator = list.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------" );

        //采用增强for循环遍历集合
        for (Object o : list){
            System.out.println(o);
        }
    }
}
