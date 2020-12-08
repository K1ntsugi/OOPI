package abstrakteKlassen;

class Sparkonto5 extends Konto5 {
    private float zinssatz;

    public Sparkonto5(int kontoNr,
                      float zins) {
        super(kontoNr);
        zinssatz = zins;
    }

    public String kennung() {
        return "Sparkonto";
    }

    public String toString() {
        return super.toString() + "\nZins (in %): " + zinssatz;
    }
}