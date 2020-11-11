import java.util.Scanner;

public class minMax
{
  /*public static void main (String[] args)
  {
    boolean input = false;
    while (input != true)
    {
      System.out.println("Bitte Wert eingeben: ");
      input = eingabeImBereich(5,50);
    }
  }

  public static boolean eingabeImBereich (int min, int max)
  {
    Scanner read = new Scanner(System.in);
    int zahl = read.nextInt();
    if ((min <= zahl) && (zahl <= max))
    {
      return true;
    }
    else
    {
      return false;
    }
  }*/

  public static boolean eingabeImBereich(int min, int max)
  {
    Scanner read = new Scanner(System.in);

    int zahl = read.nextInt();

    if((min < zahl) && ( zahl < max) )
    {
      return true;
    }
    else
    {
      return false;
    }
  }


    public static void main (String[] args)
    {
      boolean eingabeLagImBereich = false;
      System.out.println("bitte wert eingeben ");
      while(!eingabeLagImBereich)
      {
        eingabeLagImBereich = eingabeImBereich(5,50);
      }
    }
}
