public class PKW extends Verkehrsmittel {
    private String Hersteller;

    public PKW() {
        System.out.println("konstruktor PkW");
    }

    public void ausgabe() {
        super.ausgabe();
        System.out.println("ausgabe PkW");
    }
}
