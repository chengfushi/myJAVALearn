package character;

import java.util.Scanner;

/*请定义一个方法用于判断一个字符串是否是对称的字符串，并在主方法中测试方法。
例如："abcba"、"上海自来水来自海上"均为对称字符串*/
public class Symmetry {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();

        int l = 0;
        int r = str.length() - 1;
        boolean isSymmetry = true;

        while (l <= r) {
            if (str.charAt(l) != str.charAt(r)){
                isSymmetry = false;
                break;
            }
            l++;
            r--;
        }

        System.out.println(isSymmetry);



    }
}
