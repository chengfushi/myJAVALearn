package com.optimize;


import java.util.HashMap;
import java.util.Map;

public class OptimizeIfElse {
    public static void main(String[] args) {
        String payType = "wechat";

        Map<String,Runnable> mapPay = new HashMap<>();
        mapPay.put("wechat",()->{
            System.out.println("微信支付");
        });
        mapPay.put("alipay",()->{
            System.out.println("支付宝支付");
        });
        mapPay.get(payType).run();
    }
}
