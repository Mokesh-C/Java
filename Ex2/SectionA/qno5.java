package Ex2.SectionA;

import java.util.Scanner;

public class qno5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                System.out.println("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b : ");
        int b = sc.nextInt();

        System.out.println("The Addition of a+b is : " + add(a, b));

    }
    private static int add(int a, int b) {
        return a + b;
    }
}
