package zusatzaufgaben.B2.Hafen;

public class Oberklasse_Schiffe {

    protected int tonnage;
    protected double laenge;
    protected String name;

    public Oberklasse_Schiffe(String name) {
        this.name = name;
    }

    public Oberklasse_Schiffe(String name, int tonnage) {
        this.name = name;
        this.tonnage = tonnage;
    }

    public Oberklasse_Schiffe(String name, int tonnage, double laenge) {
        this(name, tonnage);
        this.laenge = laenge;
    }


}
