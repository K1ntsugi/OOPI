package Klausurvorbereitung;

public class CountToFive {
    public static void main(String[] args) {
        int reihe = 256754;
        System.out.println("In der Zahlenfolge " + reihe + " kommt die Zahl 5: " + count5iter(reihe) + " vor (iterative Lösung).");
        System.out.println("In der Zahlenfolge " + reihe + " kommt die Zahl 5: " + count5rec(reihe) + " vor (rekursive Lösung).");
    }

    public static int count5iter(int zahl) {
        int counter = 0;
        for (int i = zahl; i > 0; i = i / 10) {
            if (i % 10 == 5) {
                counter++;
            }
        }
        return counter;
    }

    public static int count5rec(int zahl) {
        int counter = 0;
        if (zahl > 0) {
            if (zahl % 10 == 5) {
                counter++;
            }
            zahl /= 10;
            if (zahl != 0) {
                counter = counter + count5rec(zahl);
            }
        }
        return counter;
    }
}
