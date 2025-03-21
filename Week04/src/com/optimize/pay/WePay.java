package com.optimize.pay;


public class WePay implements IPay{
    @Override
    public void pay(int money) {
        System.out.println("微信支付了"+money+"元");
    }
}
