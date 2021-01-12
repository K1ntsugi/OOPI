package zusatzaufgaben.B2.Hafen;

public class Unterklasse_Motorschiff extends Oberklasse_Schiffe {

    private int Motorleistung;

    public Unterklasse_Motorschiff(String name, int tonnage, double laenge, int motorleistung) {
        super(name, tonnage, laenge);
        Motorleistung = motorleistung;
    }

    public void tanken(double öl) {
        System.out.println("Das Schiff wurde mit" + öl + "Liter betankt.");
    }

}
