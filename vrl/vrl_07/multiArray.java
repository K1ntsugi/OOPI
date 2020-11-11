public class multiArray
{
  public static void main (String[] args)
  {
    int [] [] a = {{1}, {2, 3}, {4, 5, 6}, {7, 8, 9, 0}};
    for (int spalten = 0; spalten < a.length; ++spalten )
    {
      for (int zeilen = 0; zeilen < a[spalten].length; ++zeilen)
      {
        System.out.println(a[spalten][zeilen] + " ");
      }
      System.out.println();
    }
  }
}
