package Ex1.SectionA;

import java.util.Scanner;

public class qno9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        System.out.println(increment(num));
    }

    private static int increment(int num) {
        return num+1;
    }
}
