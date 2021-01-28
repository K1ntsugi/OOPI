package Wissenskontrolle1.Vererbung;

public class Adamsky extends Professor{

    public Adamsky(String name, int alter, int IQ, boolean institution) throws Exception
    {
        super(name, alter, IQ, institution);
        if (institution == HfödD)
        {
            throw new Exception("Oh...Äh...Ich bin hier an der falschen Schule");
        }
    }

    public String getName()
    {
        return name;
    }

    public void belehren()
    {
        System.out.println("Ich ähh hab da noch nen Fehler gefunden...\n " +
                "Ähh...COPY...PASTE...COPY...PASTE");
    }

}
