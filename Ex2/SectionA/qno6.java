package Ex2.SectionA;

import java.util.Scanner;

public class qno6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the hours : ");
        int hours = sc.nextInt();
        System.out.println(hours + " hours is euqual to " + convertToSeconds(hours) + " Seconds");
    }
    private static int convertToSeconds(int hours) {
        return hours * 60 * 60;
    }
}
