/*
Aufgabe 3.1 Tage im Monat
Realisieren Sie ein Programm, das nach dem Monat (in Kleinbuchstaben) fragt.
Ausgehend vom Monat gibt es die Anzahl der Tage des Monats aus. Realisierung
z.B. mit Switch/Case.
*/

import java.util.Scanner;

public class a3_1
{
  public static void main (String[] args)
  {
    int month = 0;
    Scanner read = new Scanner(System.in);
    System.out.println("Monat eingeben: ");
    month = read.nextInt();
    switch(month)
    {
      case 1, 3, 5, 7, 8, 10, 12:
      {
        System.out.println("31 Tage!");
        break;
      }
      case 2:
      {
        System.out.println("28 Tage!");
        break;
      }
      case 4, 6, 9, 11:
      {
        System.out.println("30 Tage!");
        break;
      }
      default:
      {
        System.out.println("Bitte einen Integer eingeben...");
        break;
      }
    }
  }
}
