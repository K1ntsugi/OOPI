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
        System.out.println("Jahreszins (z.B. 0.1 fuer 10 Prozent: )");
        zinssatz = read.nextDouble();
        System.out.println("Laufzeit in Jahren: ");
        zinsperiode = read.nextInt();

        for (int i = 1; i <= zinsperiode; i++)
        {
            output = zinseszins(kapital, zinssatz, zinsperiode);
            System.out.println("Wert nach " + zinsperiode + " Jahren: " + output);
            kapital += output;
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
        Z = (K) * potenz((1 + (p / 100)),(t));
        return Z;
    }



}
