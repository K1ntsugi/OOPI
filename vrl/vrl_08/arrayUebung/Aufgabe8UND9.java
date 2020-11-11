/*
Aufgabe8:
Realisieren Sie eine Tabelle tabelle als zweidimensionales array mit 10 Zeilen und
5 Spalten.
Füllen Sie die Tabelle mit den Werten 1-50.
Aufgabe 9:
Geben Sie tabelle mit Hilfe der überladenen Funktion „ausgeben“ auf der Konsole
aus.
*/
public class Aufgabe8UND9
{
  public static void main (String [] args)
  {
    int [] [] tabelle;
    tabelle = new int [5] [10];

    for (int i = 0; i < tabelle.length; i++)
    {
      for (int j = 0; j < tabelle[i].length; j++)
      {
        tabelle[i][j] =  (j+1) + (tabelle[i].length * i);
      }
    }
    ausgeben(tabelle);
  }

  public static void ausgeben (int [] [] out)
  {
    for (int i = 0; i < 5; i++)
    {
      for (int j = 0; j < 10; j++)
      {
        System.out.print(out[i][j] + " ");
      }
      System.out.println();
    }
  }

}
