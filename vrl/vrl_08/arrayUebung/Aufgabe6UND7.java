/*
Aufgabe 6:
Kopieren Sie das Array b in ein neues Array bKopie.
Aufgabe7:
Kopieren Sie das Array b in ein neues Array bRueck. Der Inhalt von bRueck soll dem
von array b in umgekehrter Reihenfolge entsprechen.
*/
public class Aufgabe6UND7
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

    // kopiere Array
    int [] bKopie = new int [100];
    for (int i = 0; i < b.length; i++)
    {
      bKopie[i] = b[i];
    }
    // Gebe rückwärts aus
    int [] bRueck = new int [100];
    for (int i = 0; i < b.length; i++)
    {
      bRueck[i] = b[(b.length-1) - i];
    }

    ausgeben(a);
    ausgeben(b);
    System.out.println();
    ausgeben(bKopie);
    ausgeben(bRueck);
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
