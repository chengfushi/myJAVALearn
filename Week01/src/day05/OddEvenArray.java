package day05;
//定义一个数组其中包含多个数字。
// 用自己的方式最终实现，奇数放在数组的左边，偶数放在数组的右边。（可以创建其他数组，不必须在原数组中改变）
public class OddEvenArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};

        int left = 0;
        int right = arr.length - 1;
        while (left < right){
            if (arr[left] % 2 == 0 && arr[right] % 2 != 0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            if (arr[left] % 2 != 0){
                left++;
            }
            if (arr[right] % 2 == 0){
                right--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
