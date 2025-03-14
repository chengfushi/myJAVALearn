package com.stack_;
//两个栈来模拟队列
public class Queue_ {
    private Stack_ stack1;
    private Stack_ stack2;

    public Queue_(){
        stack1 = new Stack_();
        stack2 = new Stack_();
    }

    //元素入队
    public void push_(int elem){
        stack1.push(elem);
    }

    //元素出队
    public int pop(){
        //如果stack2为空，将stack1的所有元素入stack2，出栈顶元素
        if (stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        }
        //如果stack2不为空，直接出栈顶元素
        return stack2.pop();
    }
}
