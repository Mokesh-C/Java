package Ex8;

public class Factions {
    public static void main(String[] args) {
        Rational r1 = new Rational(12,5);
        Rational r2 = new Rational(8,3);
        Rational r3 = r1.add(r2);
        Rational r4 = r3.divide(r2);
        System.out.println(r3.toString(3));
        System.out.println(r4.reduce());
    }
}
