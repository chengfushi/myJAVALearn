package com.codeblock;

public class Text {
    public static void main(String[] args) {
//        Person person = new Person();
////        Person.call();
//        person.eat();

        Student.call();//在student类加载时，先加载Person类，然后调用person类的静态代码块，然后调用student的静态代码块，再调用student的静态方法

        //类加载的三种情况，调用静态代码块，调用静态方法，调用静态变量：
        //1.new 创建对象
        //2.继承时，子类继承父类，父类有静态代码块，子类也有静态代码块，先加载父类，再加载子类
        //3.类名.方法


        /*创建一个对象，执行顺序是：
        1.加载类，执行静态代码块，初始化静态属性，执行静态方法
        2.执行非静态代码块
        3.执行构造方法
        * */

        /*继承一个类，创建对象，执行顺序是：
        1.加载父类，执行静态代码块，初始化静态属性执行静态方法
        2.子类静态代码块和静态属性
        3.父类普通代码块和普通属性
        4.父类构造方法
        5.子类普通代码块和普通属性
        6.子类构造方法
        * */
    }
}
