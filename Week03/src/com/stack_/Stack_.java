package com.stack_;

import java.util.LinkedList;

//数据结构——栈
public class Stack_ {
    private LinkedList<Integer> list;

    public Stack_(){
        list = new LinkedList<>();
    }

    //元素入栈
    public void push(int x){
        list.add(x);
    }

    //元素出栈
    public int pop(){
        return list.removeLast();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }
}
