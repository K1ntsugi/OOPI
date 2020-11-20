public class cpDatum {

    public static void main(String[] args) {
        // Ein Neues Objekt Datum
        Datum heute = new Datum(); // Standardkonstruktor -> 6.8.1993 ~ mein Geburtstag *hust*
        System.out.println("Heute ist der: " + heute.toString());
        Datum someday = new Datum(10, 10, 2023);
        System.out.println("Da werde ich villeicht fertig: " + someday.toString());
        heute.ausgabe();
        heute.set(19, 11, 2020);
        heute.ausgabe();
        System.out.println("Wir haben das Jahr " + heute.getJahr());
        binIchReal(heute, someday);
        Datum mirror = heute.clone();
        binIchReal(heute, mirror);
        System.out.println(heute); // Weil println einen String erwartet und guess what -> "heute" wird automatisch mit der to String-Methode aufgerufen
        // Beispiel für Polymorphismus

    }

    public static void binIchReal(Datum x, Datum y) {
        if (x.equals(y)) {
            System.out.println("Die Objekte " + x + " und " + y + " sind gleich...oder wurden geklont.");
        } else {
            System.out.println("Die Objekte " + x + " und " + y + " sind unterschiedlich");
        }
    }

}
