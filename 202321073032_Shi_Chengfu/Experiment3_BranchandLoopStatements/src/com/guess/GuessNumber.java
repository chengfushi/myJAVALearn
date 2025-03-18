package com.guess;


import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    System.out.println("给你一个1至100的整数，请猜测这个数");

    int realNumber = random.nextInt(100) + 1;

    System.out.println("请输入你的猜测：");
    int yourGuess = scanner.nextInt();

    while (yourGuess != realNumber) {
      if (yourGuess > realNumber) {
        System.out.println("猜大了，请重新猜测");
        yourGuess = scanner.nextInt();
      }
      else if (yourGuess < realNumber) {
        System.out.println("猜小了，请重新猜测");
        yourGuess = scanner.nextInt();
      }
    }
    System.out.println("恭喜你，猜对了！");
  }
}
