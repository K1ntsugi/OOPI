package Lotto;

import java.util.Random;

public class LottoSpiel {

    private int[] super6 = new int[6];
    private int int_random;
    //private int upperbound = 50;

    private int ziehZahl() {
        Random rng = new Random();
        //rng.setSeed(49);
        int_random = rng.nextInt(49) + 1;
        return int_random;
    }

    public void samstagsziehung() {
        int temp = 0;
        boolean exist;
        for (int i = 0; i < super6.length; i++) {
            do {
                temp = ziehZahl();
                exist = pruefeArrayAufZahl(temp);
            } while (exist);
            super6[i] = temp;
        }

        for (int k : super6) {
            System.out.print(k + " ");
        }
    }

    private boolean pruefeArrayAufZahl(int zahl) {
        for (int j : super6) {
            if (j == zahl) {
                return true;
            }
        }
        return false;
    }
}
