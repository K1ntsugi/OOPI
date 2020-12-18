/*
Erzeugen Sie ein Programm das einen String einliest und ein zufälliges Stück
aus diesem String in einen neuen String speichert. Dieses Teilstück soll
ausgegeben werden.
*/
package aufgabenVRL17;

import java.util.Random;
import java.util.Scanner;

public class IO_String {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String s = read.next();
        Random r = new Random();

        int start = r.nextInt(s.length());
        int ende = r.nextInt(s.length() - start);

        String sub = s.substring(start, start + ende);
        System.out.println(sub);
    }
}
