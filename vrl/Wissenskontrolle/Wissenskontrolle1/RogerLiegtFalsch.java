package Wissenskontrolle1;

public class RogerLiegtFalsch {

    private int alter;
    private int ausdauer;

    public RogerLiegtFalsch(int alter, int ausdauer)
    {
        this.alter = alter;
        this.ausdauer = ausdauer;
    }

    public static void joggen ()
    {
        System.out.println("Roger kann wieder joggen! Juhu ;)");
    }

    public void MetaJoggen ()
    {
        joggen();
    }



    //String roger = "Roger liegt sowas von falsch";

    /*public RogerLiegtFalsch(String roger) {
        this.roger = roger;
    }

    public void SCHANDE() {
        RogerLiegtFalsch a = new RogerLiegtFalsch(roger);
        System.out.println(a);
    }*/

}
