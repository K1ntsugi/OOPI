public class Datum {
    // private Attribute der Klasse Datum
    // Zugriff nur innerhalb, nicht von außen, nicht von Unterklassen
    private int Tag, Monat, Jahr;
    /*
     * Getter-Methoden: Einzige (offizielle) Ausleseschnittstelle für die einzelnen
     * Attribute eine Datum-Objekts
     */
    public int getTag() {
        return this.Tag;
    }

    public int getMonat() {
        return this.Monat;
    }

    public int getJahr() {
        return this.Jahr;
    }

    // Setter-Methode: Analog zu Getter, nur für das Einlesen
    public void set(int t, int m, int j) {
        Tag = t;
        Monat = m;
        Jahr = j;
    }

    // Standardkonstruktor
    public Datum() {
        Tag = 6;
        Monat = 8;
        Jahr = 1993;
    }

    // vollständiger Konstruktor
    public Datum(int Tag, int Monat, int Jahr) {
        this.Tag = Tag;
        this.Monat = Monat;
        this.Jahr = Jahr;
    }

    // eine Testausgabefunktion, welche die to-String-Methode immitieren soll
    public void ausgabe() {
        System.out.println("In meinem Gettern steht: " + getTag() + "." + getMonat() + "." + getJahr()); // ToDO
    }

    public String toString() {
        return (Tag + "." + Monat + "." + Jahr);
    }

    public boolean equals(Datum dateParam) {
        if (Tag == dateParam.Tag && Monat == dateParam.Monat && Jahr == dateParam.Jahr) {
            return true;
        } else {
            return false;
        }
    }

    public Datum clone() {
        Datum klonDatum = new Datum(Tag, Monat, Jahr);
        // Datum.Tag = Tag;
        // Datum.Monat = Monat;
        // Datum.Jahr = Jahr;
        return klonDatum;
    }
}
