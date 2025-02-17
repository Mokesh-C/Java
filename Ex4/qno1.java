package Ex4;

import java.util.Scanner;

public class qno1 {
    public static void main(String[] args) {
        perfectNumber();
    }

    private static void perfectNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int sum = 0;
        System.out.print("THe proper divisors : ");
        for (int i = 1 ; i <= num/2; i++) {
            if(num%i==0){
                sum += i;
                System.out.print(i + " ");
            }
        }
        System.out.println(sum == num ? "\nPerfect Number" : "\nNot a Perefect NUmber");
    }
}
