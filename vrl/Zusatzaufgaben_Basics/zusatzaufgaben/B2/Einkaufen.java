package zusatzaufgaben.B2;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Einkaufen {

    public static int[] priceArray = new int[10];

    public static void main(String[] args) throws Exception {
        parse();
        listPrice();
    }

    public static void parse() {
        int index = 0;
        String exit = "nein";
        String input = " ";
        String ja = "ja";
        String Ja = "Ja";
        Scanner read = new Scanner(System.in);
        try {
            do {
                System.out.println("Wollen Sie einen weiteren Preis einlesen?: ");
                input = read.next();
                if (!exit.equals(input)) {
                    price(index);
                }
                index++;
            }
            while (!exit.equals(input) && input.equals(ja));

        } catch (ArrayIndexOutOfBoundsException PreisListe) {
            System.err.print("Fancy:Leider können nur 10 Preise gespeichert werden");
            System.out.println("Leider können nur 10 Preise gespeichert werden");
        } catch (InputMismatchException i) {
            System.out.println("Keine Sonderzeichen erlaubt! Bitte antworten Sie mir ja oder nein auf die Frage.");
        }
    }

    public static void price(int index) {
        try {
            Scanner value = new Scanner(System.in);
            int appendValue;
            System.out.println("Bitte Preis einlesen:");
            appendValue = value.nextInt();
            priceArray[index] = appendValue;
        } catch (InputMismatchException Preis) {
            System.out.println("Keine Sonderzeichen erlaubt! Bitte an geben Sie eine gaze Zahl ein.");
        }
    }

    public static void listPrice() {
        float sum = 0;
        float subtotal = 0;
        for (int i = 0; i < priceArray.length; i++) {
            sum = sum + priceArray[i];
        }
        subtotal = sum;
        sum *= 1.16;
        System.out.println("Die Einzelpreise lauten: ");

        for (int k : priceArray) {
            if (k != 0) {
                System.out.println(k);
            }
        }

        System.out.println("Die Summe der einzelnen Artikel beträgt: " + subtotal + " €");
        System.out.println("Mit Mehrwertsteuer sind das: " + sum + " €");
    }
}


