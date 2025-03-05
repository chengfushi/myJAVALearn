package character;

import java.util.Scanner;

//编写程序，由键盘录入一个字符串，统计字符串中英文字母和数字分别有多少个。比如：Hello12345World中字母：10个，数字：5个。
public class CharacterStatistics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        str = str.toLowerCase();

        int isNum = 0;
        int isChar = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') isNum++;
            else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') isChar++;
                 else System.out.println("Input error!");
        }

        System.out.println("number:" + isNum);
        System.out.println("character:" + isChar);
    }
}
