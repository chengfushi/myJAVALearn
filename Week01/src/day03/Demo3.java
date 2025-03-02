package day03;
/*
* 某小伙想定一份外卖，商家的优惠方式如下：
* 鱼香肉丝单点24元，
* 油炸花生米单点8元，
* 米饭单点3元。订单满30元8折优惠。
* 鱼香肉丝优惠价16元，但是优惠价和折扣不能同时使用。
* 那么这个小伙要点这三样东西，最少要花多少钱？
 */

public class Demo3 {
    public static void main(String[] args) {
        int fishMeet = 24, oilPeanut = 8, rice = 3;

        double discountPrice = (fishMeet + oilPeanut + rice) > 30 ? (fishMeet + oilPeanut + rice) * 0.8 :(fishMeet + oilPeanut + rice);
        double salePrice = (oilPeanut + rice) + 16;

        System.out.println(Math.min(discountPrice,salePrice));
    }
}
