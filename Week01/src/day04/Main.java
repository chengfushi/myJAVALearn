package day04;

//令 S=1!+2!+3!+⋯+202320232023!，求 S 的末9位数字。

public class Main {
    public static void main(String[] args) {
        long sum = 0;

        final long MOD = 1000000000;

        for (int i = 1; i <= 39; i++) {
            long factorial = 1;
            for (int j = 1; j <= i; j++) {
                factorial = (factorial * j) % MOD;  // 每次乘法后取模，防止溢出
            }
            sum = (sum + factorial) % MOD;  // 每次加法后取模，防止溢出
        }

        System.out.println(sum);

    }
}
