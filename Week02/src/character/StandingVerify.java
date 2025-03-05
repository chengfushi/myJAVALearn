package character;

import java.util.Scanner;

/*我国的居民身份证号码，由由十七位数字本体码和一位数字校验码组成。
请定义方法判断用户输入的身份证号码是否合法，并在主方法中调用方法测试结果。
规则为：号码为18位，不能以数字0开头，前17位只可以是数字，最后一位可以是数字或者大写字母X。
 */
public class StandingVerify {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        boolean isLegal = verify(str);
        System.out.println(isLegal);
    }

    public static boolean verify(String str){
        //如果长度不为18
        if (str.length() != 18) return false;

        //如果以0开头
        if (str.charAt(0) == '0') return false;

        //遍历前17位
        for (int i = 0; i < 17; i++) {
            if (str.charAt(i) < '0' || str.charAt(i) > '9') return false;
        }

        //判断最后一位
        if ((str.charAt(str.length() - 1) < '0' || str.charAt(str.length() - 1) > '9') && str.charAt(str.length() - 1) != 'X') return  false;

        return true;
    }

}
