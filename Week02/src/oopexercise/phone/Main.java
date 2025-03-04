package oopexercise.phone;

import java.util.Scanner;

/*
* 定义数组存储3部手机对象。

​ 手机的属性：品牌，价格，颜色。

​ 要求，计算出三部手机的平均价格
* */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Phone[] phones = new Phone[3];

        double priceSum = 0;

        for (int i = 0; i < 3; i++){
            phones[i] = new Phone();
            System.out.println("请输入第" + (i + 1) + "部手机的品牌、价格、颜色：");
            phones[i].setBrand(scan.next());
            phones[i].setPrice(scan.nextDouble());
            phones[i].setColor(scan.next());
            priceSum += phones[i].getPrice();
        }

        System.out.println(priceSum / 3);
    }
}
