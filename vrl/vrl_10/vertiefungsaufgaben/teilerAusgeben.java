/*
Wie sieht ein Java-Codeblock aus, der die Teiler für die über die Tastatur
eingegebene int Zahl z ausgibt?
*/
import java.util.Scanner;

public class teilerAusgeben
{
  public static void main (String[] args)
  {
    input();
    teilerOutput(z);
  }aa


  public static void teilerOutput(int input)
  {

  }

  public static int input(void)
  {
    Scanner read = new Scanner(System.in);
    int z = 0;
    System.out.println("Bitte Zahl eingeben:");
    z = read.nextInt();
    return z;
  }

}
