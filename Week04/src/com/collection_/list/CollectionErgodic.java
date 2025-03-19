package com.collection_.list;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionErgodic {
    public static void main(String[] args) {
        //集合遍历方式，需要使用迭代器
        List list = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("marry");

        //创建一个集合迭代器
        Iterator iterator = list.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //这就类似与数据结构链表的实现形式，通过next()方法获取下一个元素，通过hasNext()方法判断是否还有下一个元素

        //由于集合是存放对象的，所有的对象都继承Object类，所以可以用增强for循环遍历集合
        for (Object o : list){
            System.out.println(o);
        }
    }
}
