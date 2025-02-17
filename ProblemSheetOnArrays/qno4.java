package ProblemSheetOnArrays;

import java.util.Scanner;

public class qno4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number to find the sum of series: ");
        int n = sc.nextInt(), sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (i * (i + 1)) / 2;
        }
        System.out.println("The Sum of the series is " + sum);
    }
}
