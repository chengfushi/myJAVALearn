package com.abstract_.work.phone;
// 在测试类中定义一个用手机的方法,要求该方法既能接收老手机对象,也能接收新手机对象
public class Text {
    public static void main(String[] args) {
        NewPhone newPhone = new NewPhone();
        OldPhone oldPhone = new OldPhone();
        usePhone(newPhone);
        usePhone(oldPhone);


    }
    public static void usePhone(Phone phone){
        phone.call();
        phone.sendMessage();
        if(phone instanceof NewPhone){
            ((NewPhone) phone).play();
        }
    }
}
