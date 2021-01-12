package Aufgabe1;

public class Mathe {

    private static final int cap = 1420;

    public static double div(double a, double b) throws Exception {
        double c = 0;
        boolean valid = a < cap && b < cap && b != 0 && a >= 0 && b > 0;
        if (valid) {
            c = a / b;
            if (c > cap) {
                throw new InvalidMathException("Ergebnis größer 1420 !");
            }
        } else {
            throw new InvalidMathException("Mathe Fehler in sub. Argumenten " + a + " / " + b);
        }
        return c;
    }

    public static double sub(double a, double b) throws Exception {
        double c = 0;
        boolean valid = a < cap && b < cap && b <= a && a >= 0 && b > 0;
        if (valid) {
            c = a - b;
            if (c > cap) {
                throw new Exception("Ergebnis größer 1420 !");
            }
        } else {
            throw new Exception("Mathe Fehler in sub. Argumenten " + a + " - " + b);
        }
        return c;
    }

}
