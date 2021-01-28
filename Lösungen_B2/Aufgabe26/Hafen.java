package Aufgabe26;

public class Hafen
{

  Schiff[] schiffe;
  int anzahlSchiffe=0;
  int maxAnzahlSchiffe = 10;


  public static void main (String[] args)
  {
    Hafen hafen = new Hafen();

    Schiff s1 = new Schiff("Titanic");
    SegelSchiff s2 = new SegelSchiff("Black Pearl");
    MotorSchiff s3 = new MotorSchiff("Thunder");

    hafen.anlegenLassen(s1);
    hafen.anlegenLassen(s2);
    hafen.anlegenLassen(s3);
    hafen.ablegenLassen();
    hafen.ablegenLassen();
    hafen.ablegenLassen();
  }


  public Hafen()
  {
    schiffe =  new Schiff[maxAnzahlSchiffe];
    anzahlSchiffe = 0;
  }

  public void anlegenLassen(Schiff s)
  {
    if(anzahlSchiffe < maxAnzahlSchiffe)
    {
      schiffe[anzahlSchiffe] = s;
      anzahlSchiffe++;
      s.anlegen();
    }
    else
    {
      System.out.println("wir sind voll");
    }
  }

  public void ablegenLassen()
  {
    if(anzahlSchiffe>0)
    {
      //etwas einfach gehalten, aber es reicht an dieser Stelle
      schiffe[anzahlSchiffe-1].ablegen();
      anzahlSchiffe--;
    }
  }

}
