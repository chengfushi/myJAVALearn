package day06;
/*需求：

​ 定义一个方法copyOf(int[] arr, int newLength)

功能：

​ 将数组arr中的newLength个元素拷贝到新数组中，并将新数组返回，从索引为0开始*/
public class Method08 {
    public static void main(String[] args) {

    }
    public static int[] copy0f(int[] arr,int newLength){
        int[] newArr = new int[newLength];

        for (int i : newArr){
            newArr[i] = arr[i];
        }
        return newArr;
    }
}
