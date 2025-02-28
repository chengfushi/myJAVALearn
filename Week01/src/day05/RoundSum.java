package day05;
//创建一个长度为6的整数数组。请编写代码，随机生成六个0（包含）-100（不包含）之间的整数存放到数组中，然后计算出数组中所有元素的和并打印。
import java.util.Random;

public class RoundSum {
    public static void main(String[] args) {
        Random random = new Random();

        int[] randArray = new int[6];

        for (int i = 0; i < randArray.length; i++) randArray[i] = random.nextInt(100);

        //输出生成的数组，并求和
        int randSum = 0;
        for (int i = 0; i < randArray.length; i++){
            System.out.print(randArray[i] + " ");
            randSum += randArray[i];
        }

        System.out.println("\n数组中所有元素的和为：" + randSum);
    }
}
