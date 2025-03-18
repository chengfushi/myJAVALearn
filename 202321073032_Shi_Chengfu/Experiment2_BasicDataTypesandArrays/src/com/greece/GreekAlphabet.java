package com.greece;

//编写一个程序，输出希腊字母表
public class GreekAlphabet {
    public static void main(String[] args) {
        int startPosition  = 0;
        int endPosition = 0;

        char cStart = 'α';
        char cEnd = 'ω';

        //对cStart做int型转换运算，并赋值给startPosition
        startPosition = (int)cStart;

        //对cEnd做int型转换运算，并赋值给endPosition
        endPosition = (int)cEnd;
        System.out.println("希腊字母\'α\'在unicode表中的顺序位置：" + startPosition);
        System.out.println("希腊字母表：");

        for (int i = startPosition; i <= endPosition; i++) {
            char c = '\0';
            //对i做char型转换运算，并赋值给c
            c = (char)i;
            System.out.print(" " + c);

            if ((i - startPosition + 1) % 10 == 0){
                System.out.println();
            }
        }

    }
}
