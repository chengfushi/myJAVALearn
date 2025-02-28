package day05;
//现有一个整数数组，数组中的每个元素都是[0-9]之间的数字，
// 从数组的最大索引位置开始到最小索引位置，依次表示整数的个位、十位、百位。。。依次类推。请编写程序计算，这个数组所表示的整数值。例如：
public class ByteSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        int sum = 0;
        int current = 0;

        for (int i = arr.length - 1; i >= 0; i--){
            sum += arr[i] * Math.pow(10,current++);
        }
        System.out.println(sum);
    }
}
