import java.util.*;

public class Problem3 {

    public static class Rational extends Number implements Comparable<Rational> {
        private long numerator = 0;
        private long denominator = 1;

      
        public Rational() {
                this(0, 1);
        }

      
        public Rational(long numerator, long denominator) {
                long gcd = gcd(numerator, denominator);
                this.numerator = ((denominator > 0) ? 1 : -1) * numerator / gcd;
                this.denominator = Math.abs(denominator) / gcd;
        }

        public long gcd(long n, long d) {
                long n1 = Math.abs(n);
                long n2 = Math.abs(d);
                int gcd = 1;

                for (int k = 1; k <= n1 && k <= n2; k++) {
                        if (n1 % k == 0 && n2 % k == 0)
                                gcd = k;
                }

                return gcd;
        }

        public long getNumerator() {
                return numerator;
        }

        public long getDenominator() {
                return denominator;
        }

        public Rational add(Rational secondRational) {
                long n = numerator * secondRational.getDenominator() + denominator
                                * secondRational.getNumerator();
                long d = denominator * secondRational.getDenominator();
                return new Rational(n, d);
        }

        public Rational subtract(Rational secondRational) {
                long n = numerator * secondRational.getDenominator() - denominator
                                * secondRational.getNumerator();
                long d = denominator * secondRational.getDenominator();
                return new Rational(n, d);
        }

        public Rational multiply(Rational secondRational) {
                long n = numerator * secondRational.getNumerator();
                long d = denominator * secondRational.getDenominator();
                return new Rational(n, d);
        }

        public Rational divide(Rational secondRational) {
                long n = numerator * secondRational.getDenominator();
                long d = denominator * secondRational.numerator;
                return new Rational(n, d);
        }


        public String toString() {
                if (denominator == 1)
                        return numerator + "";
                else
                        return numerator + "/" + denominator;
        }

        public boolean equals(Object other) {
                if ((this.subtract((Rational) (other))).getNumerator() == 0)
                        return true;
                else
                        return false;
        }

        public int intValue() {
                return (int) doubleValue();
        }

        public float floatValue() {
                return (float) doubleValue();
        }

        public double doubleValue() {
                return numerator * 1.0 / denominator;
        }

        public long longValue() {
                return (long) doubleValue();
        }

        public int compareTo(Rational o) {
                if (this.subtract(o).getNumerator() > 0)
                        return 1;
                else if (this.subtract(o).getNumerator() < 0)
                        return -1;
                else
                        return 0;
        }

        public static Rational parseRationalNumber(String s) {
                if (s.contains("/")) {
                        String words[] = s.split("/");
                        long numerator = Long.parseLong(words[0].trim());
                        long denominator = Long.parseLong(words[1].trim());
                        return new Rational(numerator, denominator);
                } else {
                        return new Rational(Long.parseLong(s.trim()), 1);
                }
        }
}
        public static void main(String[] args) {
                
            Scanner sc = new Scanner(System.in);
    
            System.out.print("Enter the first rational number: ");
            String rational1 = sc.nextLine();
    
            System.out.print("Enter the second rational number: ");
            String rational2 = sc.nextLine();
    
            sc.close();
    
            Rational rat1 = Rational.parseRationalNumber(rational1);
            Rational rat2 = Rational.parseRationalNumber(rational2);
    
            System.out.println(rat1+" + "+rat2+" = "+rat1.add(rat2));
}


    
}
