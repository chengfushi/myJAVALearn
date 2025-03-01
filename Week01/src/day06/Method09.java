package day06;
/*需求：

​ 定义一个方法copyOfRange(int[] arr,int from, int to)

功能：

​ 将数组arr中从索引from（包含from）开始，到索引to结束（不包含to）的元素复制到新数组中，

​ 并将新数组返回。*/
public class Method09 {
    public static void main(String[] args) {

    }
    public static int[] copyOfRange(int[] arr,int from, int to){
        int[] newArr = new int[to - from];

        for (int i = 0; i < newArr.length; i++){
            newArr[i] = arr[from + i];
        }
        return newArr;
    }
}
