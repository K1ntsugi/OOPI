package Weihnachtsbaum;

import java.util.Scanner;

public class Weihnachtsbaum {
    public static void main(String[] args) {
        Scanner xmas = new Scanner(System.in);
        System.out.print("Weihnachtsbaum bitte Hoehe eingeben: ");
        int i_hoehe = xmas.nextInt();

        for (int column = 0; column < i_hoehe; column++) {

            for (int row = 0; row < (2 * i_hoehe - 1); row++) {

                if (row >= i_hoehe - (column - 1) && row <= i_hoehe + (column - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }

        for (int trunk = 0; trunk < (2 * i_hoehe - 1); trunk++) {
            if (trunk == i_hoehe) {
                System.out.print("#");
            } else {
                System.out.print(" ");
            }
        }
    }
}
