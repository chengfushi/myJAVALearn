package com.collection_.list;


import java.util.ArrayList;
import java.util.List;

public class CollectionMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        //添加单个元素
        list.add("jack");
        list.add(10);
        list.add(true);
//        System.out.println(list);
//
//        //删除指定的元素
//        System.out.println(list.remove(0));//删除第一个元素，返回该元素
//        System.out.println(list.remove(true));//删除指定的元素，返回布尔值，表示是否删除成功
//        System.out.println(list.remove("tom"));
//        System.out.println(list);

//        //查找某个元素是否存在contains(Object o)
//        System.out.println(list.contains("jack"));
//        System.out.println(list.contains("tom"));

        //获取元素个数
//        System.out.println(list.size());

        //判断是否为空
        System.out.println(list.isEmpty());

        //清空集合
        list.clear();
        System.out.println(list);

        //添加多个元素
        List list1 = new ArrayList();
        list1.add("tom");
        list1.add("smith");
        list.addAll(list1);
        System.out.println(list);

        //查找多个元素是否存在
        System.out.println(list.containsAll(list1));

        //删除多个元素
        list.removeAll(list1);
        System.out.println(list);
    }
}
