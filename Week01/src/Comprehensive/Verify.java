package Comprehensive;

import java.util.Random;

/*定义方法实现随机产生一个5位的验证码

验证码格式：

​ 长度为5

​ 前四位是大写字母或者小写字母

​ 最后一位是数字
*/
public class Verify {
    public static void main(String[] args) {
        System.out.println(getVerify());

    }
    public static String getVerify(){
        Random random = new Random();
        StringBuilder code = new StringBuilder();

        //From first to fourth character
        for (int i = 0; i < 4; i++){
            if (random.nextBoolean()) code.append((char) ('A' + random.nextInt(26)));
            else code.append((char) ('a' + random.nextInt(26)));
        }

        //The last character
        code.append(random.nextInt(10));

        return code.toString();
    }
}

