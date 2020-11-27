public class arrayVerschieben {
    public static void main(String[] args) {
        //int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] array = { 3, 6, -6, 2, 1, 5, 8, 20, -9, 4 }; // -9, -6, 1, 2, 3, 4, 5, 6, 8, 20
        shuffle(array);
    }

    public static void shuffle(int[] x) {

        int container = x[x.length - 1];
        /*
         * for (int i = 1; i < x.length; i++) { if (x[i-1] < x[i]) { x[x.length-i] =
         * x[x.length-i-1]; }
         * 
         * }
         */

        for (int i = x.length - 1; i > 0; i--) {
            x[i] = x[i - 1];
        }

        x[0] = container;

        for (int k : x) {
            System.out.print(k);
        }
    }
}
