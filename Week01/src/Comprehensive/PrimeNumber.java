package Comprehensive;
/*
判断101~200之间有多少个素数，并输出所有素数。
备注：素数就是质数
*/
public class PrimeNumber {
    public static void main(String[] args) {
        PrimeNumberTest pnt = new PrimeNumberTest();
        int count = 0;

        for (int i = 101; i <= 200; i++){
            if (pnt.isPrime(i)) count++;
        }

        System.out.println("The number of prime numbers between 101 and 200 is: " + count);

    }
}
class PrimeNumberTest{
    public boolean isPrime(int num){
        for (int i = 2; i <= Math.sqrt(num); i++){
            if (num % i == 0) return false;
        }
        return true;
    }
}
