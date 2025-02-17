package ProblemSheetOnArrays;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class qno5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of an array");
        int[] arr = new int[n];
        boolean[] visit = new boolean[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            boolean c = false;
            for (int j = 0; j < n; j++) {
                if(arr[i] == arr[j] && i!=j && !visit[j]){
                    c = true;
                    visit[j] = true;
                }
            }
            if(c){
                count++;
                list.add(arr[i]);
            }
            visit[i] = true;
        }
        System.out.println("Total Repeated Element: "+count);
        System.out.println("Repeated Element: "+ list);
    }
}
