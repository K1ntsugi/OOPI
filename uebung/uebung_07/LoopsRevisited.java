
/*
Aufgabe 3
Implementieren Sie den folgenden Algorithmus auf drei verschiedene Arten, indem Sie je eine while-, eine for-, und eine do-while-Schleife verwenden. 
Alle drei Varianten sollen die gleiche Ausgabe erzeugen.
1. Lies den Wert von n ein
2. Setze i auf 3
3. Solange i<2n, wiederhole
    a. Erhöhe i um 1
    b. Gib (1/2i+1) aus

*/
import java.util.Scanner;

public class LoopsRevisited {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int n = 0;
        int i = 3;
        System.out.println("Bitte n einlesen: ");
        n = read.nextInt();
        // while-Loop
        while (i < (2 * n)) {
            i++;
            System.out.println((double) (1 / (2 * i) + 1));
        }
        // for-Loop
        for (i = 3; i < (2 * n);) {
            i++;
            System.out.println((double) (1 / (2 * i) + 1));
        }
        // do-while-Loop
        do {
            if (n > 1) {
                i++;
                System.out.println((double) (1 / (2 * i) + 1));
            } 
        } while (i < (2 * n));

        read.close();

    }

}
