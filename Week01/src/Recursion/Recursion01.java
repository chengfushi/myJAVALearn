package Recursion;

public class Recursion01 {
    public static void main(String[] args) {
        printRecursion(3);
    }
    public static void printRecursion(int n){
        if (n > 2) printRecursion(n - 1);
        System.out.println(n);
    }

}
