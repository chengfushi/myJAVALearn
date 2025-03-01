package day06;

public class Recursion {
    public static void main(String[] args) {
        Fipolacci fi = new Fipolacci();
        System.out.println(fi.fipolacci(10));
    }
}
class Fipolacci{
    public int fipolacci(int n){
        if (n == 1 || n == 2) return 1;
        else return fipolacci(n - 1) + fipolacci(n - 2);
    }
}
