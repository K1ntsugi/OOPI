/*
Aufgabe 12:
Initialisieren zwei Arrays der Länge 4 und 5 und initialisieren Sie sie mit den Werten
1-4 bzw. 1-5. Fassen Sie beide Arrays in ein mehrdimensionales Array mischMasch
zusammen.
Aufgabe 13:
Lassen Sie sich mischMasch über ihre Funktion „ausgeben“ auf der Konsole
ausgeben. Was stellen Sie fest? Wie müssen Sie die Funktion erweitern?
*/
public class Aufgabe12UND13
{
  public static void main (String [] args)
  {
    int misch [4] = {1, 2, 3, 4};
    int masch [5] = {1, 2, 3, 4, 5};
    
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
}
