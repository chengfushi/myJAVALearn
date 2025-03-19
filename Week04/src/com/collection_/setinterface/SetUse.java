package com.collection_.setinterface;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetUse {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("john");
        set.add("lucy");
        set.add("john");//重复
        set.add("jack");
        set.add("hsp");
        set.add("mary");
        set.add(null);//
        set.add(null);//

        System.out.println(set);
        System.out.println("-----------------------");

        //遍历方式1：使用迭代器
        System.out.println("=====使用迭代器=====");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //遍历方式2：增强for循环
        System.out.println("=====增强for循环=====");
        for (Object o :set){
            System.out.println(o);
        }
    }
}
