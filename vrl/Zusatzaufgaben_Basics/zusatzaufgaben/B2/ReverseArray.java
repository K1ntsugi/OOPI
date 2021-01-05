package zusatzaufgaben.B2;

import java.util.Scanner;

public class ReverseArray {

    private int[] arr = new int[1];

    public void setArr() {
        int arrVal;
        String abbruch;
        Scanner read = new Scanner(System.in);
        System.out.print("Starte den Einlesevorgang. Schreiben Sie 'Abbruch', wenn Sie den Vorgang beenden wollen.");
        do {
            System.out.print("\nBitte Wert einlesen: ");
            arrVal = read.nextInt();
            arr = dynamicArrGrowth(arr, arrVal);
            System.out.print("\nWeiter einlesen? ");
            abbruch = read.next().toLowerCase();
        } while (!abbruch.equals("abbruch"));
    }

    public int[] dynamicArrGrowth(int[] arr, int n) {
        int[] biggerArr = new int[arr.length + 1];
        System.arraycopy(arr, 0, biggerArr, 0, arr.length);
        /*
        Gleichbedeutend
        for (int i = 0; i < arr.length; i++) {
            biggerArr[i] = arr[i];
        }
         */
        biggerArr[arr.length] = n;
        return biggerArr;
    }

    private void outputArrForward(int[] arr) {
        for (int k : arr) {
            System.out.print(k + " ");
        }
    }

    private void outputArrBackwards(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public void aufgabe20() {
        setArr();
        outputArrForward(arr);
        System.out.println();
        outputArrBackwards(arr);
    }
}

