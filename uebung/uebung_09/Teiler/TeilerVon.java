/*
Aufgabe 2 – Teiler
Schreiben Sie eine Funktion void teilerVon(int zahl), die die ganzzahligen Teiler
von zahl auf der Kommandozeile ausgibt.

Aufgabe 3 – Teiler erweitert
Erweitern Sie Ihr Programm aus Aufgabe 2 so, dass die gefundenen Teiler in einem Array
gesammelt werden. Gehen Sie dabei so vor, dass Sie zu jedem Zeitpunkt mit i gefundenen
Teilern ein Array der Länge i halten. Wird ein weiterer Teiler gefunden, soll das Array um ein
Element „erweitert“ werden und der neue Teiler eingefügt werden.
*/

package Teiler;

import java.util.Scanner;

public class TeilerVon {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Ganzzahlige Teiler herausfinden. Zahl eingeben: ");
        int n = read.nextInt();
        teilerVon(n);

    }

    public static void teilerVon(int zahl) {
        for (int i = 1; i < zahl; i++) {
            if (zahl % i == 0)
            {
                System.out.println(i);
            }
        }
    }
}
