package Ex3;

import java.util.ArrayList;

public class qno7 {
    public static void main(String[] args) {
        if(args.length != 2){
            System.out.println("please enter the two input");
            return;
        }
        int p = Integer.parseInt(args[0]);
        int q = Integer.parseInt(args[1]);
        StringBuilder result = new StringBuilder();
        result.append(p/q).append(".");
        int remainder = p%q;

        ArrayList<Integer> remainders = new ArrayList<>();
        ArrayList<Integer> quotient = new ArrayList<>();

        while(remainder != 0){
            int index = remainders.indexOf(remainder);
            if(index != -1){
                for(int i=0; i<index; i++){
                    result.append(quotient.get(i));
                }
                result.append("(");
                for (int i = index; i < quotient.size() ; i++) {
                    result.append(quotient.get(i));
                }
                result.append(")");
                System.out.println(result);
                return;
            }
            remainders.add(remainder);
            remainder *= 10;
            quotient.add(remainder/q);
            remainder %= q;
        }
        for (int quot : quotient){
            result.append(quot);
        }
        System.out.println(result);
    }
}
