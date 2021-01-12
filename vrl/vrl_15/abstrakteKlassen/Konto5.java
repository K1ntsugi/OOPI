package abstrakteKlassen;

abstract class Konto5 {
    private int nummer;
    private float stand = 0;

    public Konto5(int nr) {
        nummer = nr;
    }

    abstract public String kennung();

    public String toString() {
        String str = "Kontonummer: " + nummer + "\nKontostand: " + stand;
        return str;
    }

}