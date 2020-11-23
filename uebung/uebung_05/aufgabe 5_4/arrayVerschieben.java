public class arrayVerschieben {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        shuffle(array);
    }

    public static void shuffle(int[] x) {
        int container = 0;

        container = x[x.length - 1];
        for (int i = 1; i < x.length; i++) {
            x[x.length-i] = x[x.length-i-1];
        }
        x[0] = container;

        for (int k : x) {
            System.out.print(k);
        }
    }
}
