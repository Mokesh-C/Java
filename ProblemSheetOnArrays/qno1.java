package ProblemSheetOnArrays;

import java.util.Arrays;
import java.util.Scanner;

public class qno1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Total number odf elements in an array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the position : ");
        int pos = sc.nextInt();

        if(pos>n){
            System.out.println("Index out of bound");
            return;
        }
        System.out.println("Enter the Elements in the array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("The desired element is "+ arr[pos-1]);
    }
}
