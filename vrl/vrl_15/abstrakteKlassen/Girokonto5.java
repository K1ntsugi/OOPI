class Girokonto5 extends Konto5
{
    private int nummer;
    public Girokonto5 (int kontoNr, int
            geheimNr)
    {
        super(kontoNr);
        nummer = geheimNr;
    }
    public String kennung()
    {
        return "Girokonto";
    }
    public String toString()
    {
        return super.toString() +
                "\nGeheimnummer: " + nummer;
    }
}