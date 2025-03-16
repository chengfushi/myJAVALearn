package com.annotation;

/*
@Author Chengfu Shi
@Description Override 注解
*/public class Override {
    public static void main(String[] args) {

    }
}


class Father {
    public void cry(){
        System.out.println("Father cry");
    }
}

class Son extends Father {
    @java.lang.Override
    public void cry() {
        System.out.println("Son cry");
    }

}