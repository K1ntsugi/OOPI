/*
Aufgabe 3.2 Vertiefungsaufgaben aus VL
Wie sieht ein Code-Block aus, der folgende Aufgabe löst?
In einem Ratespiel soll eine 5-stellige Zahl erraten werden. Dazu kann der Benutzer
eine 5-stellige Zahl eingeben, dass Programm antwortet daraufhin mit zwei
Ausgaben:
1. Die Anzahl der Ziffern die an der richtigen Stelle stehen.
2. Die Summe dieser Ziffern.
Wenn die zu erratende Zahl 42356 ist und der Benutzer 62006 eingibt, sind die
Ausgaben des Programms 2 und 8
*/
import java.util.Scanner;

public class zahlenraten2
{
  public static void main(String [] args)
  {
    Scanner read = new Scanner(System.in);
    int a = 0;
    int [] riddle = new int [5];
    int [] guess = new int [5];
    // array random befüllen
    for (int i = 0; i < riddle.length. i++)
    {
      riddle[i] = (int) (9*Math.random());
    }
    // array des benutzers einlesen


  }

}
