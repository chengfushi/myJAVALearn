package Comprehensive;
/*需求：

​ 某系统的数字密码（大于0），比如1983，采用加密方式进行传输。

规则如下：

​ 先得到每位数，然后每位数都加上5 , 再对10求余，最后将所有数字反转，得到一串新数。
*/
public class Encipher {
    public static void main(String[] args) {
        EncipherTools tools = new EncipherTools();

        System.out.println(tools.getEncipher(10));

    }
}
class EncipherTools{
    public int getEncipher(int code){
        int newCode = 0;

        while (code != 0){
            int digit =  (code % 10 + 5) % 10;
            newCode = newCode * 10 + digit;
            code /= 10;
        }

        return newCode;

    }
}
