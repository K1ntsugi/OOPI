package Klausurvorbereitung;

public class Bruch {
    // Attribute:
    private int zaehler;
    private int nenner;

    //Konstruktor:
    public Bruch(int zaehler, int nenner) throws Exception {
        if (nenner == 0) {
            throw new Exception("Division durch Null");
        } else {
            this.zaehler = zaehler;
            this.nenner = nenner;
        }
    }
    // Methode add:
    public static Bruch add(Bruch a, Bruch b) throws Exception {
        int gemeinsamerNenner = a.nenner * b.nenner;
        int aErweitert = a.zaehler * gemeinsamerNenner;
        int bErweitert = b.zaehler * gemeinsamerNenner;
        int neuerZaehler = aErweitert+bErweitert;
        return new Bruch(neuerZaehler, gemeinsamerNenner);
    }
    // Methode toString:
    public String toString ()
    {
       return "Zähler: " + zaehler + "\n Nenner: " + nenner;
    }
}
