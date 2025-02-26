package day03;
/*
* 红茶妹妹有21元钱，她攒了几天钱之后自己的钱比原来的两倍还多三块。
* 绿茶妹妹有24元钱，她攒了几天钱之后自己的钱正好是原来的两倍。
* 那么红茶和绿茶现在的钱一样多，请问对么？
*/

public class Demo2 {
    public static void main(String[] args) {
        int redTeaMoney = 21, greenTeaMoney = 24;

        int redResult = redTeaMoney * 2 + 3;
        int greenResult = greenTeaMoney * 2;

        System.out.println(redResult == greenResult);
    }
}
