/*
Aufgabe 2:
Erstellen Sie ein Array a und b mit jeweils 100 Elementen. Der Inhalt von
- a soll 100 x die Zahl 5 sein (alle Elemente gleich)
- b sollen die Zahlen 1 bis 100 in aufsteigender Reihenfolge sein
*/
public class Aufgabe2
{
  public static void main (String [] args)
  {
    int [] a = new int [100];
    int [] b = new int [100];

    // a befüllen
    for (int i = 0; i < a.length; i++)
    {
      a[i] = 5;
      System.out.println(a[i]);
    }

    // b befüllen
    for (int i = 0; i < b.length; i++)
    {
      b[i] = i+1;
      System.out.println(b[i]);
    }
  }
}
