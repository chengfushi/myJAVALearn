package day06;
/*需求：

​ 定义一个方法equals(int[] arr1,int[] arr2).

功能：

​ 比较两个数组是否相等（长度和内容均相等则认为两个数组是相同的）*/
public class Method06 {
    public static void main(String[] args) {
        System.out.println(equalsArray(new int[]{1,2,3},new int[]{1,2,3}));

    }
    public static boolean equalsArray(int[] arr1,int[] arr2){
        boolean flag = true;

        if (arr1.length != arr2.length) flag = false;

        int arrayIndex = 0;
        while (arrayIndex++ < arr1.length - 1){
            if (arr1[arrayIndex] != arr2[arrayIndex]){
                flag = false;
                break;
            }
        }
        return  flag;
    }
}
