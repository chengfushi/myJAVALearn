package com.commonclass.string_;

/*StringBuffer是一个容器。
StringBuffer 的直接父类 是 AbstractStringBuilder
StringBuffer 实现了 Serializable, 即StringBuffer的对象可以串行化
在父类中 AbstractStringBuilder 有属性 char[] value,不是final，该 value 数组存放 字符串内容，因此存放在堆中的。
StringBuffer 是一个 final类，不能被继承
因为StringBuffer 字符内容是存在 char[] value, 所有在变化(增加/删除)不用每次都更换地址(即不是每次创建新对象)， 所以效率高于 String。*/
public class StringBufferClass {
    public static void main(String[] args) {
        String str = "HelloWorld";
        StringBuffer strBuffer = new StringBuffer(str);
        System.out.println(strBuffer);
        System.out.println(strBuffer.append("!"));
        System.out.println(strBuffer.delete(0, 1));
        System.out.println(strBuffer.replace(0, 3, "abc"));
        System.out.println(strBuffer.insert(0, "abc"));
        System.out.println(strBuffer.reverse());
        System.out.println(strBuffer.length());

    }
}
