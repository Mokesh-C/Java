package Ex2.SectionA;

import java.util.Scanner;

public class qno3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Celsius : ");
        double far, cel = sc.nextDouble();
        far = (9.0/5)*cel+32;
        System.out.println("Fahrenheit : "+far);
    }
}
