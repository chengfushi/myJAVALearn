package day05;
//定义一个数组来存储10个学生的成绩，例如：{72, 89, 65, 87, 91, 82, 71, 93, 76, 68}。计算并输出学生的平均成绩。
public class MeanSource {
    public static void main(String[] args) {
        int[] sourceArray = {72, 89, 65, 87, 91, 82, 71, 93, 76, 68};

        int sourceSum = 0;

        for (int i = 0; i < sourceArray.length; i++){
            sourceSum += sourceArray[i];
        }

        System.out.println(sourceSum / sourceArray.length);

    }
}
