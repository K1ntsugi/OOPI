public class Mensch {

    protected float Größe = 0, Gewicht = 0;
    protected int Intelligenz = 0;
    protected Haendigkeit Hand;

    enum Haendigkeit {
        rechtshänder, linkshänder
    };

    public Haendigkeit getHaendigkeit() {
        return Hand;
    }

    public void setHaendigkeit(Haendigkeit h) {
        Hand = h;
    }

    public Mensch() {
        Gewicht = 80F;
        Größe = 1.80F;
        Intelligenz = 100;
        System.out.println("Standardkonstruktor Mensch");
    }

    public Mensch(float Größe) {
        this.Größe = Größe;
        System.out.println("Konstruktor Mensch");
    }

    public Mensch(float Größe, float Gewicht) {
        this(Größe);
        this.Gewicht = Gewicht;
        System.out.println("Konstruktor Mensch");
    }

    public Mensch(float Größe, float Gewicht, int Intelligenz) {
        this(Größe, Gewicht);
        this.Intelligenz = Intelligenz;
        System.out.println("Konstruktor Mensch");
    }

    public void Laufen() {
        System.out.println(" lauft - super");
    }

    public void Schlafen() {
        System.out.println("Schlafen - super");
    }

    public void Jagen() {
        System.out.println("JAGEN! - super");
    }

    public float ausgabe() {
        return Gewicht;
    }

}
