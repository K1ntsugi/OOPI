public class arrays01
{
  public static void main (String [] args)
  {
    //Deklaration
    // Standardwert: null
    float [] temp;
    //Wertzuweisung
    temp = new float [365];
    /*
    Kompakt: float [] temp = new float [365];
    Sonderfall Array-Initiialisierung: boolean [] ex = {true, false, true};
    */
    //Zugriff
    temp[0] = 3.2F;
    temp[1] = 1.3F;
    temp[364] = 2.6F;
    /*
    Feldindex beginnt bei 0; letztes Element = Array-Größe - 1
    */
    //Durchlaufen
    float sum = 0;
    for(int i = 0; i < temp.length; i++)
    {
      sum += temp[i];
    }
    System.out.println("Jahresdurchschnittstemperatur: " + (sum/365));
    System.out.println("Jahresdurchschnittstemperatur: " + sum);
  }
}
