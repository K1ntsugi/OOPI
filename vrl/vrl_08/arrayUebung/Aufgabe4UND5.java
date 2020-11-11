/*
Aufgabe 4:
Ersetzen Sie im Array a das 5., 10. und 25. Element durch eine 1.
Aufgabe 5:
Ersetzen Sie im Array b das 10. Element durch den Inhalt des 15. Elements.
*/
public class Aufgabe4UND5
{
  public static void main (String [] args)
  {
    public static void main (String [] args)
    {
      int [] a = new int [100];
      int [] b = new int [100];
      // a befüllen
      for (int i = 0; i < a.length; i++)
      {
        a[i] = 5;
      }

      // b befüllen
      for (int i = 0; i < b.length; i++)
      {
        b[i] = i+1;
      }

      a[4] = 1;
      a[9] = 1;
      a[24] = 1;

      b[9] = b [14];

      ausgeben(a);
      ausgeben(b);
    }

    public static void ausgeben (int [] out)
    {
      for (int i = 0; i < out.length; i++)
      {
          System.out.print(out[i] + " ");
      }
      System.out.println();
    }
  }
}
