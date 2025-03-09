package Ex8;

public class Rational {
    private int numerator;
    private int denominator;

    public Rational(){
        numerator = 0;
        denominator = 1;
    }

    public Rational(int numerator, int denominator){
        if(denominator == 0){
            System.out.println("Denominator cannot be Zero...");
        }
        else{
            this.numerator  = numerator;
            this.denominator = denominator;
        }
    }

    public Rational add(Rational b){
        int newNumerator = this.numerator*b.denominator + this.denominator*b.numerator;
        int newDenominator = this.denominator * b.denominator;
        return new Rational(newNumerator, newDenominator);
    }

    public Rational divide(Rational b){
        int newNumerator = this.numerator * b.numerator;
        int newDenominator = this.denominator*b.denominator;
        return new Rational(newNumerator, newDenominator);
    }

    public Rational reduce(){
        int hcf = gcd(Math.abs(this.numerator), Math.abs(this.denominator));
        this.numerator /= hcf;
        this.denominator /= hcf;
        if(denominator < 0){
            numerator = -numerator;
            denominator = -denominator;
        }
        return this;
    }

    private int gcd(int a, int b) {
        return a == 0 ? b : gcd(b%a, a);
    }

    public String toString(){
        return this.numerator + "/" + this.denominator;
    }

    public String toString(int precision){
        return String.format("%." + precision + "f",(double)this.numerator/this.denominator);
    }


}
