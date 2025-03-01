package day06;
/*需求：

​ 定义一个方法fill(int[] arr,int fromIndex,int toIndex,int value)

功能：

​ 将数组arr中的元素从索引fromIndex开始到toIndex（不包含toIndex）对应的值改为value*/
public class Method07 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        fill(arr,0,arr.length,1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
    public static void fill(int[] arr,int fromIndex,int toIndex,int value) {
        while (fromIndex < toIndex) {
            arr[fromIndex++] = value;
        }
    }
}
