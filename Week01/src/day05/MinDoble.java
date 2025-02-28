package day05;
//现有一个小数数组{12.9, 53.54, 75.0, 99.1, 3.14}。请编写代码，找出数组中的最小值并打印。
public class MinDoble {
    public static void main(String[] args) {
        double[] doubles = {12.9, 53.54, 75.0, 99.1, 3.14};

        double doubleMin = doubles[0];

        for (int i = 1; i < doubles.length; i++){
            if (doubleMin > doubles[i]) doubleMin = doubles[i];
        }

        System.out.println(doubleMin);
    }
}
