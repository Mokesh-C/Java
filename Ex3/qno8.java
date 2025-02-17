package Ex3;

public class qno8 {
    public static void main(String[] args) {
        if(args.length != 2){
            System.out.println("Enter two integer as input");
            return;
        }
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);

        if(m<1 || m>12 || d<1 || d>daysInMonth(m)){
            System.out.println("Its not a valid date");
            return;
        }
        
        if((m==3 && d>=21) || (m==4 || m==5) || (m==6 & d<=20)){
            System.out.println("spring");
        } else if ((m==6 && d>=21) || (m==7 || m==8) || (m==9 && d<=22)) {
            System.out.println("Summer");
        } else if ((m==9 && d>=23) || (m==10 || m==11) || (m==12 && d<=21)) {
            System.out.println("Fall");            
        } else if ((m==12 && d>=22) || (m==1 || m==2) || (m==3 && d<=20)) {
            System.out.println("Winter");
        }
    }
    private static int daysInMonth(int m) {
        return switch(m){
            case 2-> 28;
            case 4,6,9,11->30;
            default -> 31;
        };
    }
}
