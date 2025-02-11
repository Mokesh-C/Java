package Ex3;

import java.util.Scanner;

public class qno10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double g = 9.8;
        System.out.println("Enter the target distance in miles : ");
        double x = sc.nextDouble()*1.60934*1000;
        System.out.println("Enter the wind speed : ");
        double w = sc.nextDouble()*1.60934*1000/3600;
        System.out.println("Enter the initial velocity in meter per seconds : ");
        double u = sc.nextDouble()+w;
        double sin2theta = (g*x)/Math.pow(u,2);

        if(sin2theta < -1 || sin2theta > 1){
            System.out.println("The target cannot be hit with the given parameters");
            return;
        }

        double twoTheta = Math.asin(sin2theta);

        double angle1 = Math.toDegrees(twoTheta/2);
        double angle2 = Math.toDegrees((Math.PI - twoTheta)/2);

        System.out.printf("The projectile can hit the target at the angle : %.2f or %.2f degrees",angle1,angle2);
    }
}
