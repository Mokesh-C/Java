package Ex1.SectionA;

import java.util.Scanner;

public class qno8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Edge 1 : ");
        int e1 = sc.nextInt();
        System.out.println("Enter Edge 1 : ");
        int e2 = sc.nextInt();
        System.out.println(findThirdEdge(e1, e2));
    }

    private static int findThirdEdge(int e1, int e2) {
        return e1 + e2 - 1;
    }
}
