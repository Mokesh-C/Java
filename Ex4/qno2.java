package Ex4;

public class qno2 {
    public static void main(String[] args) {
        int[] arr = {1, -2, 4, -4, 9, -6, 16, -8, 25, -10};
        System.out.println(computeAverage(arr));
    }

    private static float computeAverage(int[] arr) {
        int ans = 0;
        for(int a : arr) ans += a;
        return (float)ans/arr.length;
    }
}
