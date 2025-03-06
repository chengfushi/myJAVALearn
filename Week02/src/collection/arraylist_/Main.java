package collection.arraylist_;

import java.util.ArrayList;

//现有如下字符串元素：["aaa", "bbb", "aaa", "aaa", "ccc", "bbb"]，
// 请将所有的元素按顺序存入ArrayList集合中，并遍历集合查看存储结果。
public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("aaa");
        arrayList.add("bbb");
        arrayList.add("aaa");
        arrayList.add("aaa");
        arrayList.add("ccc");
        arrayList.add("bbb");

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
