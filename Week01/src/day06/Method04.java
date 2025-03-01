package day06;
//数字是有绝对值的，负数的绝对值是它本身取反，非负数的绝对值是它本身。请定义一个方法，方法能够得到小数类型数字的绝对值并返回。请定义方法并测试。
public class Method04 {
    public static void main(String[] args) {
        System.out.println(getAbs(-3.5));
    }
    public static double getAbs(double num){
        return num < 0 ? -num : num;
    }
}
