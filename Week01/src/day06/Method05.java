package day06;
/*键盘录入一个正整数

定义一个方法,该方法的功能是计算该数字是几位数字,并将位数返回

在main方法中打印该数字是几位数

演示格式如下: (1)演示一: 请输入一个整数:1234 控制台输出:1234是4位数字 (2)演示二: 请输入一个整数:34567 控制台输出:34567是5位数字*/
public class Method05 {
    public static void main(String[] args) {
        System.out.println(getCount(1234));

    }
    public static int getCount(int num){
        int count = 0;
        while (num > 0){
            num /= 10;
            count++;
        }
        return count;
    }
}
