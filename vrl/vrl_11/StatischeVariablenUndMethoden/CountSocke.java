public class CountSocke
{
  public static void main (String[] args)
  {
    Socke stinkiRechts = new Socke("gruen");
    Socke stinkiLinks = new Socke ("gruen");
    System.out.println("Es gibt " + Socke.anzahl + " Socken.");
  }
}

class Socke
{
  private String farbe;
  public static int anzahl = 0;
  public Socke(String farbe)
  {
    this.farbe = farbe;
    anzahl++;
  }
}
