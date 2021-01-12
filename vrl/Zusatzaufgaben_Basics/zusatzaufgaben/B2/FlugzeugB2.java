package zusatzaufgaben.B2;

public class FlugzeugB2 {

    private String name;
    private boolean captain;
    private int passagiere;

    public String getName() {
        return name;
    }

    public boolean isCaptain() {
        return captain;
    }

    public int getPassagiere() {
        return passagiere;
    }

    public FlugzeugB2(String name) {
        this.name = name;
    }

    public FlugzeugB2(String name, int passagiere) {
        this(name);
        this.passagiere = passagiere;
    }

    public boolean Captainzusteigen() {
        return captain = true;
    }

    public boolean Captainaussteigen() {
        return captain = false;
    }

    public void fliegen() throws Exception {
        try {
            if (captain) {
                System.out.println("Das Flugzeug hat abgehoben.");
            } else {
                throw new Exception();
            }
        } catch (Exception Bruchlandung) {
            System.out.println("Kein Captain im Flugzeug!!!");
        }
    }

    @Override
    public String toString() {
        return "Das Flugzeug " +
                "mit der Kennung " + name + '\'' +
                ", fliegt mit einem Captain: " + captain +
                " und " + passagiere + " Passagieren " +
                '}';
    }
}
