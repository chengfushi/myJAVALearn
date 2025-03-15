package com.inner.exercise;

public class InnerClassExercise01 {
    public static void main(String[] args) {
        //匿名内部类可以当实参直接传递
        f1(new IT(){
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        });
    }

    public static void f1(IT it) {
        it.show();
    }
}

//定义一个接口
interface IT{
    void show();
}
