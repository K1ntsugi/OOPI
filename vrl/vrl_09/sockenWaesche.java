public class sockenWaesche
{
  public static void main (String[] args)
  {
    Socke stinki = new Socke ("rot", false);

    Socke stinki2 = new Socke("blau", true);

    //stinki.init("rot", true);

    stinki.waschen();
    stinki.trocknen();
    stinki.print();
  }
}

class Socke
{
  private String farbe;
  private boolean istTrocken;

  // Konstruktor
  public Socke(String farbe, boolean istTrocken)
  {
    this.farbe = farbe;
    this.istTrocken = istTrocken;
  }

  void waschen()
  {
    farbe = "blass";
    istTrocken = false;
  }
  void trocknen()
  {
    istTrocken = true;
  }

  public void init (String initFarbe, boolean initIstSocken)
  {
    farbe = initFarbe;
    istTrocken =initIstSocken;
  }

  public void print ()
  {
    System.out.print ("Stinki ist " + farbe + " und ");

    if (istTrocken)
    {
      System.out.println ("trocken.");
    }
    else
    {
      System.out.println ("nass.");
    }
  }
}
