public class Maximum
{
  public static void main (String[] args)
  {
    int [] a = {-2, 5, 0, -7, 13, 6, 2, 2};
    int max = a[0];
    for (int i = 1; i < a.length; i++)
    {
      if (max < a[i])
      {
        max = a[i];
      }
    }
    System.out.println("Maximum: " + max);
  }
}
