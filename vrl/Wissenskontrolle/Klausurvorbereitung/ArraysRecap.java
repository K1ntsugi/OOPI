package Klausurvorbereitung;

public class ArraysRecap {
    public static void main(String[] args) {
        int count = 0;
        int[] arr = new int[10];

        arr[0] = 6;
        arr[1] = 8;
        arr[2] = 9;
        arr[7] = 3;
        arr[8] = 5;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                count++;
            }
        }

        System.out.println();
        //1000001 = 5 -> 5 => 00000
        int i = 0;
        int[] arrNeu = new int[count];
        for (int k : arr) {
            if (k > 0) {
                arrNeu[i] = k;
                i++;
            }
        }

        int boundsNewArr = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > 0) {
                arrNeu[boundsNewArr] = arr[j];
                boundsNewArr++;
            }
        }

        for (int l : arrNeu) {
            System.out.println(l);
        }
    }
}
