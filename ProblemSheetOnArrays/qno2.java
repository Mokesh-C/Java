package ProblemSheetOnArrays;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class qno2 {
    static Scanner sc =new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter the size of the Aarry: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n],arr2 = new int[n],ans = new int[n];
        System.out.println("Enter the elements of array 1 : ");
        getInput(arr1,n);
        System.out.println("Enter the elements of array 2 : ");
        getInput(arr2,n);
        for (int i = 0; i < n; i++) {
            ans[i] = arr1[i]+arr2[i];
        }
        System.out.println(Arrays.toString(ans));
    }

    private static void getInput(int[] arr,int n) {
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }
}
