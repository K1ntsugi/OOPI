package Weihnachtsbaum;

import java.util.Scanner;

public class Musterlösung {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Bitte Hoehe eingeben: ");
        int n = read.nextInt();
        drawTree(n);
    }

    public static void drawTree(int n) {
        String zeile;
        for (int i = 0; i < n; i++) {
            zeile = makeChars(n - i - 1, ' ') + makeChars(2 * i + 1, '*');
            System.out.println(zeile);
        }
        zeile = makeChars(n - 1, ' ') + '#';
        System.out.println(zeile);
    }

    public static String makeChars(int n, char c) {
        String ausgabe = new String();
        for (int i = 0; i < n; i++) {
            ausgabe += c;
        }
        return ausgabe;
    }
}