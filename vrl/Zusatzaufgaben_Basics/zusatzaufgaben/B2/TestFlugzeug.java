package zusatzaufgaben.B2;

public class TestFlugzeug {
    public static void main(String[] args) throws Exception {
        FlugzeugB2 boing747 = new FlugzeugB2("Tango", 300);
        //boing747.Captainzusteigen();
        //boing747.fliegen();
        System.out.println(boing747.getName());
        System.out.println(boing747.getPassagiere());
        System.out.println(boing747.isCaptain());
        System.out.println(boing747);
        /*
        Merke:
        Alle Klassen erben in Java letztlich die in java.lang.Object implementierten Methoden.
        Dies führt u.a. dazu, dass ein Objekt als Parameter einer der PrintStream-Methoden print() oder println() ausgegeben werden kann,
        da bei Übergabe die Methode toString() implizit aufgerufen wird.

        In der Praxis:
        System.out.print(obj);
        Objekt rein ---> String raus
         */


    }
}
