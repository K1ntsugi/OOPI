/*
Erzeugen Sie ein Schachbrett der folgenden Form auf der Kommandozeile
1 2 3 4 5 6
2 3 4 5 6 7
3 4 5 6 7 8
4 5 6 7 8 9
*/
public class Schachbrett {
    public static void main(String[] args) {

        int[][] schachbrett = new int[4][6];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; i++) {
                schachbrett[0][j] = j + 1;
                schachbrett[1][j] = j + 2;
                schachbrett[2][j] = j + 3;
                schachbrett[3][j] = j + 4;
            }
        }
        // Ausgabe
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; i++) {
                System.out.print(schachbrett[i][j]);
            }
            System.out.println();
        }
    }
}
