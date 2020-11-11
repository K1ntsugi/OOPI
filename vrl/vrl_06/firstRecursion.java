import java.util.Scanner;

public class firstRecursion
{
  static double fakult (int n)
  {
    if (n > 0)
    {
      return (n * fakult(n - 1));
    }
    else
    {
      return 1;
    }
  }


  public static void main (String[] args)
  {
    Scanner read = new Scanner(System.in);
    System.out.println("Bitte einen Integer eingeben: ");
    int a = read.nextInt();
    System.out.println(a + "! = " + fakult(a));
  }
}
