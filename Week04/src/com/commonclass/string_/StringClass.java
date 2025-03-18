package com.commonclass.string_;
/*
* String对象用于保存字符串,也就是一组字符序列
字符串常量对象是用双引号括起的字符序列。例如:"你好"、"12.97"、"boy"等
字符串的字符使用Unicode字符编码，一个字符(不区分字母还是汉字)占两个字节
String类较常用构造器(其它看手册);
String s1 =new String();
String s2 = new String(String original);
String s3 = new String(char[] a);
String s4 = new String(char[] a, int startIndex, int count)
*/

public class StringClass {
    public static void main(String[] args) {
/*        String s1 = "123";
        String s2 = new String("123");
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
        System.out.println(s1.intern());
        System.out.println(s2.intern());
        System.out.println(s1 == s2.intern());//intern（）方法会先在常量池中查找，如果常量池中有，则直接返回常量池中的地址，如果没有，则新建一个，并返回地址
        System.out.println(s2 == s2.intern());*/

        /*equals //区分大小写，判断内容是否相等
equalsIgnoreCase //忽略大小写的判断内容是否相等length/获取字符的个数,字符串的长度
length 获取字符的个数，字符串的长度
indexOf //获取字符在字符串中第1次出现的索引索引从0开始,如果找不到,返回-1
lastIndexOf //获取字符在字符串中最后1次出现的索引,索引从0开始,如找不到,返回-1
substring //截取指定范围的子串
trim //去前后空格
charAt // 获取某索引处的字符, 注意不能使用Str[index]这种方式.*/

        String str = "abcdefg";

        System.out.println(str.equals("Abcdefg"));
        System.out.println(str.equalsIgnoreCase("Abcdefg"));
        System.out.println(str.length());
        System.out.println(str.indexOf('d'));
        System.out.println(str.lastIndexOf('d'));
        System.out.println(str.substring(2,4));
        System.out.println(str.trim());
        System.out.println(str.charAt(2));


    }
}
