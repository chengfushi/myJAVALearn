package com.optimize.pay;


public class AliPay implements IPay{
    @Override
    public void pay(int money) {
        System.out.println("支付宝支付" + money + "元");
    }
}
