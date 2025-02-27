package day04;

public class Demo1 {
    public static void main(String[] args) {
        int prePrice = 7988;

        int sellPrice = 1500;

        double disCount = 0.8;

        System.out.println((prePrice - sellPrice) > (prePrice * disCount) ? true : false);

    }
}
