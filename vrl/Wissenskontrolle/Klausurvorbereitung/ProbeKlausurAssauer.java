package Klausurvorbereitung;

public class ProbeKlausurAssauer {
    public static void main(String[] args) {
        int[] array = {2, 0, 5, 0, 1};
        boolean getArray = isSym(array);
        if (getArray) {
            System.out.println("Array ist symmetrisch");
        } else {
            System.out.println("Array ist nicht symmetrisch");
        }
        System.out.println();

        int [] aufgabe5b;
        aufgabe5b = createArray(10);
        for (int k : aufgabe5b)
        {
            System.out.print(k + " ");
        }
    }

    public static boolean isSym(int[] arr) {
        for (int i = 0; i < (arr.length/2); i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] createArray(int n)
    {
        int[] arr = new int [n];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = i+1;
        }
        return arr;
    }
}
