/*
Basiert auf 8/9:
Aufgabe 10:
Modifizieren Sie die erste Zeile so, dass dort nur noch Einsen stehen.
Aufgabe 11:
Modifizieren Sie die 3. Zeile so, dass sie nun rückwärts gespeichert ist.
Modifizieren Sie die 2. Spalte so, ass sie nun rückwärts gespeichert ist.
*/
public class Aufgabe10UND11
{
  public static void main (String [] args)
  {
    int count = 1;
    int spalten = 5;
    int zeilen = 10;

    int [] [] tabelle = new int [spalten] [zeilen];
    int [] cacheSpalten = new int [spalten];
    int [] cacheZeilen = new int [zeilen];
    int [] [] container = new int[spalten][zeilen];

    for (int i = 0; i < tabelle.length; i++)
    {
      for (int j = 0; j < tabelle[i].length; j++)
      {
        // Aufgabe 10
        tabelle[0][j] = 1;
        // Aufgabe 11
        container[2][j] = tabelle[2][j];
        // 1 -50
        tabelle[i][j] =  count;
        count++;

      }
    }
    ausgeben(tabelle);
  }

  public static void ausgeben (int [] [] out)
  {
    for (int i = 0; i < out.length; i++)
    {
      for (int j = 0; j < out[i].length; j++)
      {
        System.out.print(out[i][j] + " ");
      }
      System.out.println();
    }
  }
}
