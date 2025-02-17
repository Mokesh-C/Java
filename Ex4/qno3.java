package Ex4;

public class qno3 {
    public static void main(String[] args) {
        averageOf3(4, 7, 13);
    }

    private static void averageOf3(int... arr) {
        int avg = 0;
        for(int a : arr) avg += a;
        System.out.println((float)avg/ arr.length);
    }
}
