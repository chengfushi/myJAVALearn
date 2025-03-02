package Comprehensive;

import java.util.Scanner;

/*需求:

​ 机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。

​ 按照如下规则计算机票价格：旺季（5-10月）头等舱9折，经济舱8.5折，淡季（11月到来年4月）头等舱7折，经济舱6.5折。
*/
public class Airticket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please input the original price of the ticket:");
        double originalPrice = scan.nextDouble();

        System.out.println("Please input the mouth of the ticket:");
        int mouth = scan.nextInt();

        System.out.println("Please input the class of the ticket(top is 1/normal is 0):");
        int ticketClass = scan.nextInt();

        double finalPrice = 0;

        if (mouth >= 5 && mouth <= 10){
            if (ticketClass == 1) finalPrice = originalPrice * 0.9;
            else if (ticketClass == 0) finalPrice = originalPrice * 0.85;
                else System.out.println("Wrong input!");
        }else {
           if (ticketClass == 1) finalPrice = originalPrice * 0.7;
           else if (ticketClass == 0) finalPrice = originalPrice * 0.65;
                else System.out.println("Please input the correct class of the ticket!");
        }

        System.out.println("The final price of the ticket is: " + finalPrice);
    }
}
