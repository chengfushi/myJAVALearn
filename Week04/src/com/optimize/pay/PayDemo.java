package com.optimize.pay;


import java.util.HashMap;
import java.util.Map;

public class PayDemo {
    public static void main(String[] args) {
        String payType = "wechat";
        Map<String,IPay> mapPay = new HashMap<>();
        mapPay.put("wechat",new WePay());
        mapPay.put("alipay",new AliPay());

        mapPay.get(payType).pay(100);
    }
}
