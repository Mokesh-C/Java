package Ex2;

import java.util.Arrays;

public class qno5 {
    public static void main(String[] args) {
        if(args.length >=1){
            Arrays.sort(args);
            int avg = 0;
            for (int i = 1; i < args.length-1; i++) {
                avg += Integer.decode(args[i]);
            }
            System.out.printf("The average of the Gymnastics  : %.2f",(float)avg/(args.length-2) );

        }
        else{
            System.out.println("No Command line argument found");
        }
    }
}
