package Ex2;

public class qno7 {
    public static void main(String[] args) {
        System.out.println(fibo(50));
    }


    private static int fibo(int n) {
        if(n<=1){
            return  n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
