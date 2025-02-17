package ProblemSheetOnArrays;

import java.util.Scanner;

public class qno3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of 2d array : ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        System.out.println("Enter the elements of he 2d array : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                 sum = (i==j || j==n-i-1) ? sum+arr[i][j] : sum;
//                 sum = (i==j && j==n-i-1) ? sum+arr[i][j] : sum;
//
//            }
//        }

        for (int i = 0; i < n; i++) {
            sum += (arr[i][i] + arr[i][n-i-1]);
        }
        System.out.println("The sum of Diagonal elements is " + sum);
    }
}
