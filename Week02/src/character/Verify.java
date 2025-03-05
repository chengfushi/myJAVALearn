package character;

import java.util.Random;

/*生成验证码
内容：可以是小写字母，也可以是大写字母，还可以是数字
规则：
长度为5
内容中是四位字母，1位数字。
其中数字只有1位，但是可以出现在任意的位置。
*/
public class Verify {
    public static void main(String[] args) {
        Random random = new Random();
        char[] verifyChar = new char[5];

        int isNum = random.nextInt(5);

        for (int i = 0; i < verifyChar.length; i++) {
            if (i == isNum){
                verifyChar[i] = (char) ('0' + random.nextInt(9));
            }else {
                if (random.nextBoolean()) verifyChar[i] = (char) ('A' + random.nextInt(26));
                else verifyChar[i] = (char) ('a' + random.nextInt(26));
            }
        }

        System.out.println(new String(verifyChar));

    }
}
