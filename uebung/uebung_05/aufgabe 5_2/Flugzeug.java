public class Flugzeug extends Verkehrsmittel {
    private int triebwerke;

    public Flugzeug() {
        Besitzer = "neuer Besitzer";
        System.out.println("flugzeug konstruktor");
    }

    public void ausgabe() {
        super.ausgabe();
        System.out.println("ausgabe im Flugzeug");
    }
}
