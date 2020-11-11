/*
Aufgabe 3.2 Zinseszins
Realisieren Sie ein Programm zur Zinsberechnung.
Nach Eingabe des anzulegenden
Betrags, des Zinssatzes und der Laufzeit der Geldanlage soll der Wert der
Investition nach jedem Jahr ausgegeben werden.
Beispiel-Ausgabe:
Anzulegender Geldbetrag in Eur: 100
Jahreszins (z.B. 0.1 für 10 Prozent): 0.06
Laufzeit in Jahren: 4
Wert nach 1 Jahren: 106.0
Wert nach 2 Jahren: 112.36
Wert nach 3 Jahren: 119.1016
Wert nach 4 Jahren: 126.247696
*/

import java.util.Scanner;

public class a3_2
{
  public static void main (String[] args)
  {
    // Variablen
    double kapital = 0;
    double zinssatz = 0;
    double output = 0;
    int zinsperiode = 0;
    // Scanner Instanz
    Scanner read = new Scanner(System.in);
    // Input
    System.out.println("Anzulegender Geldbetrag in Euro: ");
    kapital = read.nextDouble();
    System.out.println("Jahreszins (z.B. 0,1 fuer 10 Prozent: )");
    zinssatz = read.nextDouble();
    System.out.println("Laufzeit in Jahren: ");
    zinsperiode = read.nextInt();

    for (int i = 0; i < zinsperiode; i++)
    {
      System.out.println(potenz((1 + (zinssatz / 100)), (i)));
      output = zinseszins(kapital, zinssatz, i);
      System.out.printf("Wert nach %d Jahren:  %.2f Euro\n", i+1, output);
    }
  }

  public static double potenz (double basis, int exponent)
  {
    double result = 1.0;
    for (int i = 0; i <= exponent; i++)
    {
      result *= basis;
    }
    return result;
  }

  public static double zinseszins (double K, double p, int t)
  {
    double Z = 0.0;
    double p2 = p * 100;
    Z = (K) * potenz((1 + (p2 / 100)), (t));
    return Z;
  }
}
