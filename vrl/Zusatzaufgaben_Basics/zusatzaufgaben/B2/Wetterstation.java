package zusatzaufgaben.B2;

//import java.util.Scanner;

public class Wetterstation {

    private static double[] Messung = {1, 2, 3, 10, 4};

    public static void main(String[] args) {
        Wetterstation polarstern = new Wetterstation();
        //polarstern.input();
        double wert = groessterTemperaturSprung(Messung);
        System.out.println("Der größte Temperaturunterschied beträgt: " + groessterTemperaturSprung(Messung));
    }

    public static double groessterTemperaturSprung(double[] array) {
        double maxDiv = array[1] - array[0];
        double posiDiv = Math.abs(maxDiv);
        int arrSize = array.length;
        for (int i = 0; i < arrSize; i++) {
            for (int j = i + 1; j < arrSize; j++) {
                if (array[j] - array[i] > posiDiv) {
                    posiDiv = array[j] - array[i];
                    posiDiv = Math.abs(posiDiv);
                }
            }
        }
        return posiDiv;
    }
}
