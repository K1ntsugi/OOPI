/*
Geben Sie drei verschiedene Möglichkeiten an, um ein Feld zu erzeugen.
Gegeben seien zwei Felder a und b vom Typ int[].
Warum kann man die Felder nicht mit a==b vergleichen?
Wie könnte ein Programmstück aussehen, dass beide Felder vergleicht?
Zwei Felder seien dann gleich, wenn sie die gleiche Länge haben und
wenn die Elemente paarweise gleich sind.
*/
public class array
{
  public static void main (String[] args)
  {
    //1
    //int [] array1;
    //array = new int [5];
    //2
    //int [] array2 = new int [5];
    //3
    //int [] array3 = {1, 2, 3, 4, 5};

    /*
    Würde man array a mit array b gleichsetzen, so erreicht man damit nur, dass beide
    Namen [a, b] auf die gleiche Refferenz zeigen. Anstatt zwei arrays zu haben, haben wir nun
    einen array mit zwei Namen.
    */

    // arrayVergleich

    int [] a = {1,2,3,4};
    int [] b = {1,2,3,4};

    boolean istGleich = true;

    if (a.length != b.length)
    {
      istGleich = false;
    }
    else
    {
      for (int i=0; i<a.length; i++)
      {
        if (a[i] != b[i])
        {
          istGleich = false;
        }
      }
    }
    System.out.println("Die Felder sind gleich?" + istGleich);
  }
}
