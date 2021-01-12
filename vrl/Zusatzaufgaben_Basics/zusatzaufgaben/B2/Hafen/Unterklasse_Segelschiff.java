package zusatzaufgaben.B2.Hafen;

public class Unterklasse_Segelschiff extends Oberklasse_Schiffe {

    private double Segelfläche;

    public Unterklasse_Segelschiff(String name, int tonnage, double laenge, double Segelfläche) {
        super(name, tonnage, laenge);
        this.Segelfläche = Segelfläche;
    }

    private void Segelsetzen(Unterklasse_Segelschiff obj) {
        System.out.println(obj);
    }

    public String toString() {
        return "Das Segelschiff " + name + " setzt die Segel.";
    }

}
