package Aufgabe26;

public class SegelSchiff extends Schiff
{
  private double segelflaeche;



  public SegelSchiff(String n)
  {
    super(n);
  }


  public void segelSetzen()
  {
    System.out.println("segel werden gesetzt");
  }


  public void segelEinholen()
  {
    System.out.println("segel werden eingeholt");
  }


  public void ablegen()
  {
    super.ablegen();
    segelSetzen();
  }

  public void anlegen()
  {
    super.anlegen();
    segelEinholen();
  }

}
