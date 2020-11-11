import java.util.Scanner;

public class fakultaet
{
  public static void main (String[] args)
  {
    Scanner read = new Scanner(System.in);
    long a = 1;
    long result = 0;

    System.out.println("Bitte eine ganze Zahl eingeben: ");
    a = read.nextLong();
    result = fkt(a);
    System.out.println("Das Ergebnis lautet: " + result);
  }

  public static long fkt (long fakult)
  {
    long temp = 1;
    for (int i = 1; i <= fakult; i++)
    {
      temp *= i;
    }
    return temp;
  }
}
