package day04;

import java.util.Scanner;

/*需求：给你一个整数 x 。

​ 如果 x 是一个回文整数，打印 true ，否则，返回 false 。

解释：回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。

例如，121 是回文，而 123 不是。

*/
public class Demo9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();

        int l = 0;
        int r = str.length() - 1;

        boolean falg = true;

        while (l < r){
            if (str.charAt(l) != str.charAt(r)){
                falg = false;
                break;
            }
            l++;
            r--;
        }
        System.out.println(falg);
    }
}
