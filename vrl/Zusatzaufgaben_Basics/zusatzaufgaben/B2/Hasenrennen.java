package zusatzaufgaben.B2;

public class Hasenrennen {
    public static void main(String[] args) {
        float schrittl_Igel = 5.3f;
        float schrittl_Hase = 10.8f;
        float abstand = 270f;
        float start_Igel = 270f;
        float start_Hase = 0f;
        int win = 0;

        for (float i = abstand; i > start_Hase; i = start_Igel-start_Hase) {
            System.out.println("Nach " + win + " Schritten: Hase " + start_Hase + " cm, Igel " + start_Igel + " cm");
            start_Igel += schrittl_Igel;
            start_Hase += schrittl_Hase;
            win++;
        }

        System.out.println("Der Hase hat nach " + win + " Schritten gewonnen.");

    }
}
