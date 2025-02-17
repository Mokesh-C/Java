package Ex4;

import java.util.Scanner;

public class qno4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 9 digit number : ");
        int num = sc.nextInt();
        int i = 2 , sum = 0;
        while(num>0){
            sum += ((num%10)*i++);
            num /= 10;
        }
        System.out.println("The checkSum digit is : " + (11-(sum%11)));
    }
}
