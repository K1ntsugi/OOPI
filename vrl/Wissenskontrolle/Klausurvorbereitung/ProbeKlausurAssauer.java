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
    }

    public static boolean isSym(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
