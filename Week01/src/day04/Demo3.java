package day04;

import java.util.Scanner;

/*某银行推出了整存整取定期储蓄业务，其存期分为一年、两年、三年、五年，到期凭存单支取本息。存款年利率表如下：
存期 年利率（%）
一年 2.25
两年 2.7
三年 3.25
五年 3.6
请存入一定金额（1000起存），存一定年限（四选一），计算到期后得到的本息总额。*/
public class Demo3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("please input the amount of money you want to save:");

        double money = scan.nextDouble();

        if (money < 1000) System.out.println("The amount of money you want to save should be more than 1000");
        else {
            //存一年
            System.out.println(money + money * 0.0225);
            //存两年
            System.out.println(money + money * 0.027 * 2);
            //存三年
            System.out.println(money + money * 0.0325 * 3);
            //存五年
            System.out.println(money + money * 0.036 * 5);
        }
    }
}
