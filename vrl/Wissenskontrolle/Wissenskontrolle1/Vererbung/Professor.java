package Wissenskontrolle1.Vererbung;

public abstract class Professor implements HAW, HföD {

    protected int IQ;
    protected int alter;
    protected String name;

    public Professor(String name, int alter, int IQ)
    {
        this.name = name;
        this.alter = alter;
        this.IQ = IQ;
    }

    abstract public void belehren();


}
