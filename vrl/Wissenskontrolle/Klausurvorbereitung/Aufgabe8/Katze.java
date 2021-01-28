package Klausurvorbereitung.Aufgabe8;

public class Katze extends Tier{

    public Katze (String name)
    {
        super(name);
    }

    public void verstaendigen()
    {
        System.out.println(super.getName() + " macht miau.");
    }

}
