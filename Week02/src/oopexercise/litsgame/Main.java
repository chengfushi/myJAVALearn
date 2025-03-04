package oopexercise.litsgame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();

        while (t-- > 0){
            int n = scan.nextInt();

            int[][] arr = new int[n][n];

            for (int i = 0; i < n; i++){
                for (int j = 0; j < n; j++){
                    arr[i][j] = scan.nextInt();
                }
            }
        }
    }
}
