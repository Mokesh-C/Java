package Ex2;

import java.util.Scanner;

public class qno2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day in number : ");
        int num = sc.nextInt();
        String result = switch (num){
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Not a valid day";
        };
        System.out.println(result);

        // using array
        String[] str = {"Sunday", "Monday", "Tuesday","Wednesday", "Thursday", "Friday", "Saturday"};
        String res = (num>=0 && num<=6)  ? str[num] : "Not a valid day";
        System.out.println(res);
    }
}
