package Ex3;

public class qno6 {
    public static void main(String[] args) {
        if (args.length < 5 || args.length > 5) {
            System.out.println("Provide 5 Arguments A, B, C, D, E ");
        }
        var A = Integer.decode(args[0]);
        var B = Integer.decode(args[1]);
        var C = Integer.decode(args[2]);
        var D = Integer.decode(args[3]);
        var E = Integer.decode(args[4]);

        var W = (250.0 / 3) * ((double) A / B - 0.3);
        var X = (25.0 / 6)* ((double) C / B - 3);
        var Y = (1000.0 / 3) * ((double) D / B);
        var Z = (1250.0 / 3) * (0.095 - (double) E / B);

        W = Math.max(0, Math.min(W, 475.0 / 12));
        X = Math.max(0, Math.min(X, 475.0 / 12));
        Y = Math.max(0, Math.min(Y, 475.0 / 12));
        Z = Math.max(0, Math.min(Z, 475.0 / 12));

        System.out.printf("The quaterback rating : %.2f", W + X + Y + Z);
    }
}
