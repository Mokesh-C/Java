package Ex2;

public class qno3 {
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("No command line argument is provided..");
        }
        else {
            String s = args[0];
            Boolean ans = false;
            for(String st : args){
                if(!st.equals(s)){
                    ans = false;
                    break;
                }
                else{
                    ans = true;
                }
            }
            System.out.println((ans==true) ? "Equal" : "Not Equal");
        }
    }
}
