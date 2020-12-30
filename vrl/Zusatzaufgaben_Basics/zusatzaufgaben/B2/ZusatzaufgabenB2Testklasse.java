//Enthält Aufgaben 1-18
package zusatzaufgaben.B2;

import java.util.Scanner;

public class ZusatzaufgabenB2Testklasse {
    public static final double Pi = 3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679;
    private int[] array = {3, 5, 7, 9, 11};

    public void getValue(int[] array, int index) {
        System.out.println(array[index]);
    }

    public int[] serValue(int[] array, int index, int value) {
        array[index] = value;
        return array;
    }

    public static void main(String[] args) throws Exception {
        int a3 = 20;
        int a6 = 101;
        boolean a6_1;
        boolean a6_2;
        System.out.println("Aufgabe 1: ");
        aufgabe1();
        System.out.println("Aufgabe 2: ");
        aufgabe2();
        System.out.println("\n" + "Aufgabe 3: ");
        aufgabe3(a3);
        System.out.println("\n" + "Aufgabe 4: ");
        aufgabe4();
        System.out.print("\n" + "Aufgabe 5: ");
        aufgabe5(a3);
        System.out.print("\n" + "Aufgabe 6: ");
        a6_1 = aufgabe6(a3);
        a6_2 = aufgabe6(a6);
        System.out.print("Ergebnis Aufgabe 6: " + a6_1 + " und " + a6_2);
        System.out.print("\n" + "Aufgabe 7: ");
        a6_1 = aufgabe7(333);
        a6_2 = aufgabe7(120);
        System.out.print("Ergebnis Aufgabe 7: " + a6_1 + " und " + a6_2);
        System.out.print("\n" + "Aufgabe 8: ");
        aufgabe8(-1, 2);
        System.out.print("\n" + "Aufgabe 9: ");
        aufgabe9(1, 2, 3);
        System.out.println("Oder für float: ");
        aufgabe9(1.2f, 3.4f, 5.6f);
        System.out.print("\n" + "Aufgabe 10: ");
        aufgabe10(40);
        System.out.print("\n" + "Aufgabe 11: ");
        aufgabe11();
        System.out.print("\n" + "Aufgabe 12: ");
        double a12 = aufgabe12(4);
        System.out.print("Kreisradius -> " + a12);
        System.out.print("\n" + "Aufgabe 13: ");
        int[] arr13 = {1, 2, 3, 4, 5};
        System.out.println("Ursprüngliches Array: ");
        outputArr(arr13);
        arr13 = aufgabe13(arr13);
        System.out.println("\nNeues Array:");
        outputArr(arr13);
        System.out.print("\n" + "Aufgabe 14: ");
        int[] arr14 = {9, 9, 9, 9, 9};
        System.out.println("Ursprüngliches Array: ");
        outputArr(arr14);
        arr14 = aufgabe14(arr14, 1);
        System.out.println("\nNeues Array:");
        outputArr(arr14);
        System.out.print("\n" + "Aufgabe 15: ");
        int[] arr15 = {2, 4, 6, 8, 10};
        System.out.println("Ursprüngliches Array: ");
        outputArr(arr15);
        arr15 = aufgabe15(arr15, 4);
        System.out.println("\nNeues Array (multipliziert mit n):");
        outputArr(arr15);
        // ToDo: Test Aufgabe  16 - 18
        System.out.print("\n" + "Aufgabe 18: ");
        ReverseArray arrObj = new ReverseArray();
        arrObj.aufgabe20();

    }

    public static void outputArr(int[] arr) {
        for (int k : arr) {
            System.out.print(k + " ");
        }
    }

    public static void outputArr(double[] arr) {
        for (double k : arr) {
            System.out.print(k + " ");
        }
    }

    public static void aufgabe1() {
        System.out.println("voll automatisch!");
    }

    public static void aufgabe2() {
        char A = 'A';
        for (int i = 0; i < 10; i++) {
            System.out.print(A + " ");
        }
    }

    public static void aufgabe3(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("A" + " ");
        }
    }

    public static void aufgabe4() {

        System.out.println("Reihe a (for): ");
        for (int i = 0; i < 7; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\nReihe a (while): ");
        int a = 0;
        while (a < 7) {
            System.out.print(a + " ");
            a++;
        }
        System.out.println("\nReihe b (for): ");
        for (int i = 1; i < 7; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\nReihe b (while): ");
        int b = 1;
        while (b < 7) {
            System.out.print(b + " ");
            b++;
        }
        System.out.println("\nReihe c (for): ");
        // c. 1,3,5,7,9,11
        for (int i = 1; i < 12; i = i + 2) {
            System.out.print(i + " ");
        }
        System.out.println("\nReihe c (while): ");
        int c = 1;
        while (c < 12) {
            System.out.print(c + " ");
            c += 2;
        }
        //d. 1,3,6,10,15,21,28,36 (+2,+3,+4,...)
        System.out.println("\nReihe d (for): ");
        int j = 2;
        for (int i = 1; i < 37; i = i + j - 1) {
            System.out.print(i + " ");
            j++;
        }
        System.out.println("\nReihe d (while): ");
        int d1 = 1;
        int d2 = 2;
        while (d1 < 37) {
            System.out.print(d1 + " ");
            d1 = d1 + d2;
            d2++;
        }
        System.out.println("\nReihe e (for): ");
        for (int i = 10; i > 3; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\nReihe e (while): ");
        int e = 10;
        while (e > 3) {
            System.out.print(e + " ");
            e--;
        }
        System.out.println("\nReihe f (for): ");
        for (int i = 10; i >= 0; i = i - 2) {
            System.out.print(i + " ");
        }
        System.out.println("\nReihe f (while): ");
        int f = 10;
        while (f >= 0) {
            System.out.print(f + " ");
            f -= 2;
        }
    }

    public static void aufgabe5(int n) {
        System.out.print(2 * n);
    }

    public static boolean aufgabe6(int n) {
        return n > 0 && n < 100;
    }

    public static boolean aufgabe7(int n) {
        return n > 0 && n < 100 || n % 20 == 0;
    }

    public static void aufgabe8(int a, int b) throws Exception {
        try {
            if (a > 0 && b > 0) {
                System.out.print(a * b);
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.print("Failed to call Method: Negative Parameter");
        }
    }

    public static void aufgabe9(int a, int b, int c) {
        System.out.print(a + b + c);
    }

    public static void aufgabe9(float a, float b, float c) {
        System.out.print(a + b + c);
    }

    public static void aufgabe10(int n) {
        if (n % 2 == 0) {
            System.out.print(n + " ist eine gerade Zahl");
        } else {
            System.out.print(n + " ist eine ungerade Zahl");
        }
    }

    public static void aufgabe11() {
        Scanner read = new Scanner(System.in);
        int scan = 1;
        while (scan != 0) {
            System.out.print("Bitte geben Sie eine Zahl ein (0 soll die Ausgabe abbrechen): ");
            scan = read.nextInt();
        }
    }

    public static double aufgabe12(int r) throws Exception {
        //Kreisfläche: 2*r*Pi
        double A = 0;
        try {
            if (r > 0) {
                A = 2 * r * Pi;
            } else {
                throw new Exception();
            }
        } catch (Exception Radius) {
            System.out.print("Radius muss größer 0 sein!");
        }
        return A;
    }

    public static int[] aufgabe13(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 1;
        }
        return arr;
    }

    public static int[] aufgabe14(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = n;
        }
        return arr;
        //Einfacher aber vermutlich nicht gewollt: Arrays.fill(arr, n);
    }

    public static int[] aufgabe15(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * n;
        }
        return arr;
    }

    // Aufgabe 16 & 17 als Getter/Setter über der Main

    // Aufgabe 18
    public static int getMinIndex(int[] array) {
        int minIndex = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minIndex) {
                minIndex = array[i];
            }
        }
        return minIndex;
    }
}
