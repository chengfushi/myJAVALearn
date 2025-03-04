package oopexercise.car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Car[] cars = new Car[3];

        int priceSum = 0;

        for (int i = 0; i < cars.length; i++){
            cars[i] = new Car();
            System.out.println("Input brand：");
            cars[i].setBrand(scan.next());
            System.out.println("Input color:");
            cars[i].setColor(scan.next());
            System.out.println("Input price:");
            cars[i].setPrice(scan.nextInt());
            priceSum += cars[i].getPrice();
        }

        System.out.println(priceSum / 3);

    }
}
