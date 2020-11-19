public class Segelflugzeug extends Flugzeug {
    //private int gewicht;

    public Segelflugzeug() {
        System.out.println("konstruktor Segelflugzeug");
    }

    public void ausgabe() {
        super.ausgabe();
        System.out.println("ausgabe Segelflugzeug");
    }
}
