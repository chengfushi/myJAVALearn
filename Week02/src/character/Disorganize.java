package character;

import java.util.Random;
import java.util.Scanner;

//键盘输入任意字符串，打乱里面的内容
public class Disorganize {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        String str = scan.next();

        char[] ch = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            int strIndex = random.nextInt(ch.length);

            char temp = ch[i];
            ch[i] = ch[strIndex];
            ch[strIndex] = temp;
        }

        String newStr = new String(ch);
        System.out.println(newStr);


    }
}
