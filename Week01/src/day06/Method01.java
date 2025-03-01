package day06;
//定义一个方法，该方法能够找出两个小数中的较小值并返回。在主方法中调用方法进行测试。
public class Method01 {
    public static void main(String[] args) {
        System.out.println(getMin(1.1,1.2));

    }
    public  static double getMin(double a,double b){
        return  a < b ? a : b;
    }
}

