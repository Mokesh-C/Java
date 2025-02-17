package ProblemSheetOnArrays;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class qno6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> prime = new ArrayList<>();
        ArrayList<Integer> composite = new ArrayList<>();
        for (int num : arr){
            if (isPrime(num)) prime.add(num);
            else if (num == 1) continue;
            else composite.add(num);
        }
        System.out.println("Elements of prime array : "+prime);
        System.out.println("Elements of composite array : "+composite);
    }

    private static boolean isPrime(int num) {
        if(num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if(num%i == 0) return false;
        }
        return true;
    }
}
