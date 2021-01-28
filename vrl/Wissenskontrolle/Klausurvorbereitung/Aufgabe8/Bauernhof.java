package Klausurvorbereitung.Aufgabe8;

public class Bauernhof {
    public static void main (String[] args)
    {
        Tier kater = new Katze("Felix");
        Tier katze = new Katze("Molly");
        //Tier wachhund = new Hund("Bello");
        kater.verstaendigen(); // Ausgabe: "Felix macht Miau"
        katze.verstaendigen(); // Ausgabe: "Molly macht Miau"
        //wachhund.verstaendigen(); // Ausgabe: "Bello macht Wau"
    }
}
