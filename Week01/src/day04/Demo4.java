package day04;

import java.util.Scanner;

/*某商场购物可以打折，具体规则如下：

​ 普通顾客购不满100元不打折，满100元打9折；

​ 会员购物不满200元打8折，满200元打7.5折；

​ 不同打折规则不累加计算。

请根据此优惠计划进行购物结算，键盘录入顾客的类别（0表示普通顾客，1表示会员）和购物的折前金额（整数即可），输出应付金额（小数类型）。
*/
public class Demo4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //input the type of customer
        int customerType = scan.nextInt();

        if (customerType != 0 && customerType != 1) {
            System.out.println("The type of customer should be 0 or 1");
        }else {
            int prePrice = scan.nextInt();

            if (customerType == 0) {
                if (prePrice < 100) System.out.println(prePrice);
                else System.out.println(prePrice * 0.9);
            }else {
                if (prePrice < 200) System.out.println(prePrice * 0.8);
                else System.out.println(prePrice * 0.75);
            }
        }
    }
}
