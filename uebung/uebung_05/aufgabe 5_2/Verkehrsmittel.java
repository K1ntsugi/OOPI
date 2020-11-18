/*
Aufgabe 5.2 Vererbung
Erstellen Sie die Klassen Verkehrsmittel, PKW, Schiff und Flugzeug. Die Klasse
Verkehrsmittel ist die Oberklasse mit den Eigenschaften Geschwindigkeit,
Bezeichnung und Besitzer. Die anderen Klassen sind Unterklassen der Klasse
Verkehrsmittel. Implementieren Sie in den Unterklassen die Besonderheiten der
Typen PKW, Schiff sowie Flugzeug in Form von Eigenschaften und Methoden.
Testen Sie Ihre Implementierung mit einer geeigneten main()-Methode.
Erstellen Sie anschließend noch eine Unterklasse Segelflugzeug von der Klasse
Flugzeug sowie auch hier Besonderheiten eines Segelflugzeuges.
*/
public class Verkehrsmittel {
    float Geschwindigkeit = 0.0F;
    String Bezeichnung = "undefined";
    String Besitzer = "undefined";

    public Verkehrsmittel() {
        System.out.println("Oberklassenkonstruktor - standard");
    }

    public Verkehrsmittel(String Bezeichnung) {
        this.Bezeichnung = Bezeichnung;
    }

    public Verkehrsmittel(String Bezeichnung, String Besitzer) {
        this.Bezeichnung = Bezeichnung;
        this.Besitzer = Besitzer;
    }

    public Verkehrsmittel(String Bezeichnung, String Besitzer, float Geschwindigkeit) {
        this(Bezeichnung, Besitzer);
        this.Geschwindigkeit = Geschwindigkeit;
    }

    public void ausgabe() {
        System.out.println("ausgabe Verkehrsmittel");
    }
}
