package com.collection_.list;


import java.util.ArrayList;
import java.util.List;

public class ListInterfaceUse {
    public static void main(String[] args) {
        //List接口的使用
        List list = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("marry");

        //1.void add(int index,Object ele):在index位置插入ele元素
        list.add(1,"scf");
        System.out.println("list="+list);

        //2.boolean addAll(int index,Collection eles):从index位置开始将eles中的所有元素添加进来
        List list2 = new ArrayList();
        list2.add("a");
        list2.add("b");
        list.addAll(1,list2);
        System.out.println("list="+list);

        //3.Object get(int index):获取指定index位置的元素
        System.out.println(list.get(0));

        //4.int indexOf(Object obj):返回obj在集合中首次出现的位置
        System.out.println(list.indexOf("marry"));

        //5.int lastIndexOf(Object obj):返回obj在集合中末次出现的位置
        System.out.println(list.lastIndexOf("marry"));

        //6.Object remove(int index):移除指定index位置的元素，并返回此元素
        System.out.println(list.remove(0));

        //7.Object set(int index,Object ele):设置指定index位置的元素为ele
        list.set(1,"scf");

        System.out.println("list="+list);

        //8.List subList(int fromIndex,int toIndex):返回从fromIndex到toIndex位置的子集合
        List list3 = list.subList(0, 2);
        System.out.println("list3="+list3);
    }
}
