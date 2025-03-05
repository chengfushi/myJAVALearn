package character;
/*定义一个方法，把 int 数组中的数据按照指定的格式拼接成一个字符串返回，调用该方法，并在控制台输出结果。*/
public class Convert {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        String str = convert(arr);
        System.out.println(str);

    }

    public static String convert(int[] arr) {
        StringBuilder str = new StringBuilder("[");

        for (int i = 0; i < arr.length; i++){
            str.append(arr[i]);
            if (i < arr.length - 1) str.append(",");
        }
        str.append("]");

        return  str.toString();
    }
}
