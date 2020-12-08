package Interfaces;

class Kfz implements Groesse{
    private String kennzeichen;
    private int anzSitze;
    public Kfz (String kz, int anz)
    {
        kennzeichen = kz;
        anzSitze = anz;
    }

    public int getGroesse()
    {
        return  anzSitze;
    }
    public String toString()
    {
        return kennzeichen;
    }
}
