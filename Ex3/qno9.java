package Ex3;

public class qno9 {
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

        String ans = switch (m){
            case 1-> (d>19) ? "Aquarius" : "Capricon";
            case 2-> (d>17) ? "Pisces" : "Aquarius";
            case 3-> (d>19) ? "Aries" : "Pisces";
            case 4-> (d>19) ? "Taurus" : "Aries";
            case 5-> (d>20) ? "Gemini" : "Taurus";
            case 6-> (d>20) ? "Cancer" : "Gemini";
            case 7-> (d>22) ? "Leo" : "Cancer";
            case 8-> (d>22) ? "Virgo" : "Leo";
            case 9-> (d>22) ? "Libra" : "Virgo";
            case 10-> (d>22) ? "Scorpio" : "Libra";
            case 11-> (d>21) ? "Sagittarius" : "Scorpio";
            case 12-> (d>21) ? "Capricon" : "Sagittarius";
            default -> "Not a valid date and month";
        };

        System.out.println(ans);

    }

    private static int daysInMonth(int m) {
        return switch(m){
            case 2-> 28;
            case 4,6,9,11->30;
            default -> 31;
        };
    }
}
