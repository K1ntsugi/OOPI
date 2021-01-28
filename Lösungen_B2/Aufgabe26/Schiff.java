package Aufgabe26;

public class Schiff
{
  protected int tonnage;
  protected double laenge;
  protected String name;


  public Schiff()
  {
    name = "sea-turtle";
  }

  public Schiff(String n)
  {
    name = n;
  }

  public void ablegen()
  {
    System.out.println(name + " legt ab");
  }

  public void anlegen()
  {
    System.out.println(name + " legt an");
  }


}
