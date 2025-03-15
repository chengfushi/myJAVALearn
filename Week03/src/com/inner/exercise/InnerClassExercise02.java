package com.inner.exercise;

import com.abstract_.interface_.Phone;

//有一个铃声接口Bell，里面有个ring方法。有一个手机类Cellphone，
//具有闹钟功能alarmclock,参数是Bell类型。
// 测试手机类的闹钟功能,通过匿名内部类(对象)作为参数，打印:懒猪起床了。再传入另一个匿名内部类(对象)，打印:小伙伴上课了
public class InnerClassExercise02 {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        cellPhone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了");
            }
        });

        cellPhone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("小伙伴上课了");
            }
        });
    }
}

interface Bell {
    public void ring();
}

class CellPhone {
    public void alarmclock(Bell bell) {
        bell.ring();
    }
}
