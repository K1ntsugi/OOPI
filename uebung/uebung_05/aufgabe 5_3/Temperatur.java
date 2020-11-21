import java.util.Scanner;

public class Temperatur {
    public static void main(String[] args) {
        int maximum = 0;
        int arithMittel = 0;
        int[] week = new int[7];
        Scanner read = new Scanner(System.in);

        for (int i = 0; i < week.length; i++) {
            System.out.println("Bitte Temperatur von Tag " + (i + 1) + " einlesen");
            week[i] = read.nextInt();
        }

        for (int i = 0; i < week.length; i++) {
            arithMittel += week[i];
        }

        for (int i = 0; i < week.length; i++) {
            if (week[i] > maximum) {
                maximum = week[i];
            }
        }

        arithMittel /= week.length;

        System.out.print("\033[H\033[2J"); // ANSI escape code
        System.out.flush();

        for (int k : week) {
            System.out.println(k);
        }

        System.out.println("Arithmetisches Mittel: " + arithMittel);
        System.out.println("Höchster Wochenwert: " + maximum);

        read.close();
    }
}