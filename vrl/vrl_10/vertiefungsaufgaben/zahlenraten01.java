/*
• Programmieren Sie ein Zahlenratespiel. Erzeugen Sie eine geheime Zahl über folgenden
Befehl: int geheimeZahl = (int)(99*Math.random()+1);
• Der Benutzer soll zuvor über die Regeln aufgeklärt werden. Anschließend kann der Benutzer
in jeder Runde einen Rateversuch tätigen. Das Programm erzeugt folgende Ausgabe in jeder
Runde:
• Nummer des aktuellen Versuchs
• Ob die eingegebene Zahl zu niedrig, zu hoch oder korrekt ist
• Varianten: der Spieler darf raten, bis die Zahl stimmt / der Spieler darf max. 10 Mal raten
• Beispiel:
Willkommen beim Zahlenratespiel! Ich denke mir eine Zahl zwischen
0 und 100 und du musst sie erraten.
1. Versuch: 50
Meine Zahl ist kleiner! ...
*/
import java.util.Scanner;
public class zahlenraten01
{
  public static void main (String [] args)
  {
    //Variablen
    int geheimeZahl = (int) (99*Math.random()+1);
    int count = 1;
    int geraten = 1;
    //Objektinstanzen
    Scanner read = new Scanner(System.in);
    do
    {
      System.out.println("Willkommen beim Zahlenratespiel! Ich denke mir eine Zahl zwischen 0 und 100 und du musst sie erraten.");
      System.out.println(count + ". Versuch: ");
      geraten = read.nextInt();
      if (geheimeZahl == geraten)
      {
        System.out.println("Glueckwunsch! Richtig geraten!");
      }
      else
      {
        System.out.println("Leider falsch. Naechster Versuch");
      }
      count++;
    } while (geraten != geheimeZahl);
  }
}
