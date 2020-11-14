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
    int i_guess = 0, i_guessOutput = 0;
    int i_counterAnzahl = 0;
    int i_counterSumme = 0;
    int [] arr_riddle = new int [5];
    int [] arr_guess = new int [5];
    Scanner read = new Scanner(System.in);
    //array random befüllen -> status: funktioniert
    for (int i = 0; i < arr_riddle.length; i++)
    {
      arr_riddle[i] = (int) (9*Math.random());
    }
    // Zahl des Benutzers einlesen
    System.out.println("Bitte eine 5-stellige Zahl eingeben:");
    i_guess = read.nextInt();
    i_guessOutput = i_guess;
    // Problem: Wie bekomme ich die einzelnen Zahlen aus dem int in einem array?    
    /*
    ------------------------Zahlen in ihre Elemente Zerlegen---------------------------
    12345 % 10 = 5; 
    12345 / 10 = 1234,5 -> ergo 1234 da der int Gleitkommazahlen nicht kennt und alles hinter dem Komma verloren geht
    !Jetzt die Ergebnisse zwischenspeichern, damit im nächsten Schleifendurchlauf ->
    1234 % 10 = 4;
    1234 / 10 = 123 ^^
    --------------------------------------loop-----------------------------------------
    */
    for (int i = 4; i >= 0; i--)
    {
      arr_guess[i] = i_guess%10;
      i_guess /= 10;
    }
    for (int i = 0; i < arr_riddle.length; i++)
    {
      if (arr_guess[i] == arr_riddle[i])
      {
        i_counterAnzahl++;
        i_counterSumme += arr_guess[i]; 
      }
    }
    // user output
    System.out.print("\033[H\033[2J"); // ANSI escape code
    System.out.flush();
    System.out.println("Das war die Zufallszahl: ");
    for (int k: arr_riddle)
    {
      System.out.print(k);
    }
    System.out.println("\n");
    System.out.printf("Das war ihre geratene Zahl: %d. \n  ", i_guessOutput);
    System.out.printf("Die Anzahl der richten Ziffern beträgt: %d. \n", i_counterAnzahl); 
    System.out.printf("Die Summe der richten Ziffern beträgt: %d", i_counterSumme);
  }
}
