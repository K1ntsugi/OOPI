package Wissenskontrolle1.Vererbung;

public abstract class Professor implements HAW, HföD {

    protected boolean institution;
    protected int IQ;
    protected int alter;
    protected String name;

    public Professor(String name, int alter, int IQ)
    {
        this.name = name;
        this.alter = alter;
        this.IQ = IQ;
    }

    public Professor(String name, int alter, int IQ, boolean institution)
    {
        this(name, alter, IQ);
        this.institution = institution;
    }

    abstract public void belehren();


}
