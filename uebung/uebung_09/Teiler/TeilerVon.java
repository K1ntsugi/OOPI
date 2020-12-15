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

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class TeilerVon {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Ganzzahlige Teiler herausfinden. Zahl eingeben: ");
        int n = read.nextInt();
        teilerVon(n);
        System.out.println();
        teilerArrayVon(n);

    }

    public static void teilerVon(int zahl) {
        for (int i = 1; i < zahl; i++) {
            if (zahl % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static int @NotNull [] teilerArrayVon(int zahl) {
        int[] array = new int[0]; // bisher null Teiler
        for (int i = 1; i < zahl; i++) {
            if (zahl % i == 0) {
                System.out.print(i + " ");
            }
        }

        for (int k : array) {
            System.out.print(k + " ");
        }
        System.out.println();
        return array;
    }

    public static int[] arrayErweitern(int[] oldArray, int n) {
        int[] newArray = new int[oldArray.length + 1];
        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }
        newArray[newArray.length - 1] = n;
        return newArray;
    }
}
