/*
Aufgabe 3:
Durchlaufen Sie die Arrays aus Aufgabe 2 und geben Sie es auf der Konsole aus.
Umsetzung über eine eigene Methode mit dem Namen „ausgeben“.
*/
public class Aufgabe3
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
