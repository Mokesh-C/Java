package Ex3;

import java.text.DecimalFormat;

public class qno4 {
    public static void main(String[] args) {
        if(args.length == 1){
            int target = Integer.decode(args[0]);
            int[] arr = {74,95,110,130,155};
            int i = 0;
            while ( i< arr.length) {
                if(target<=arr[i]){
                    System.out.println("Hurricance Catagory : "+ i);
                    break;
                }
                i++;
            }
            if(target>arr[arr.length-1]){
                System.out.println("Hurricance Catagory : "+ i);
            }
        }
        else {
            System.out.println("No command line argument found..");
        }
//        DecimalFormat df = new DecimalFormat("##].#");
//        var d = 3.44567;
//        System.out.println(df.format(d));


    }
}
