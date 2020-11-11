public class functionBasics
{
  // fu muss unter Main stehen
  public static void main (String[] args)
  {
    int a = 5, b = 7;
    long ergebnis;

    ergebnis = power (a, b);

    System.out.println(a + "**" + b + "=" + ergebnis);
  }

  public static long power (int basis, int exponent)
  {
    long result = 1;
    for (int i = 0; i <= exponent; i++)
    {
      result *= basis;
    }
    return result;
  }
}
