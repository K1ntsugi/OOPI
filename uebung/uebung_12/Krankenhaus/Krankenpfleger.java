package Krankenhaus;

public class Krankenpfleger extends Mitarbeiter {

    public Krankenpfleger(String name) throws Exception {
        super(name);
    }


    public void vorstellen() {
        System.out.println("Krankenpfleger " + name + " sagt hallo");
    }
}
