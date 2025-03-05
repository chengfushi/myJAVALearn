package character;
/*在String类的API中，有如下两个方法：

// 查找参数字符串str在调用方法的字符串中第一次出现的索引，如果不存在，返回-1
public int indexOf(String str)

// 截取字符串，从索引beginIndex（包含）开始到字符串的结尾
public String substring(int beginIndex)
请仔细阅读API中这两个方法的解释，完成如下需求。

现有如下文本："Java语言是面向对象的，Java语言是健壮的，Java语言是安全的，Java是高性能的，Java语言是跨平台的"。请编写程序，统计该文本中"Java"一词出现的次数。

*/
public class StringAPI {
    public static void main(String[] args) {
        String str = "Java语言是面向对象的，Java语言是健壮的，Java语言是安全的，Java是高性能的，Java语言是跨平台的";
        int count = 0;
        int index = 0;

        while ((index = str.indexOf("Java", index)) != -1) {
            count++;
            index += 4;
        }
        System.out.println("Java出现的次数为：" + count);



    }
}
