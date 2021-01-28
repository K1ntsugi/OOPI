package Krankenhaus;

public abstract class Mitarbeiter {

    protected String name;

    public Mitarbeiter(String name) throws Exception {
        if (name.length() == 0) {
            throw new Exception("Missing name.");
        } else {
            this.name = name;
        }
    }

    public abstract void vorstellen();

}
