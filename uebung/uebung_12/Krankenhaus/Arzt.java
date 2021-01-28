package Krankenhaus;

public class Arzt extends Mitarbeiter{

    public Arzt(String name) throws Exception
    {
        super(name);
    }

    public void vorstellen() {
        System.out.println("Arzt " + name + " sagt hallo");
    }

}
