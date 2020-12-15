package OberUndUnter;

public class VererbungTest {

    public static void main(String[] args) {
        Ober o = new Ober();
        o.oberfunktion();;

        Unter u = new Unter();
        u.unterfunktion();
        o.oberfunktion();

        Ober  o2 = new Unter();
        o2.oberfunktion();
        // o2.unterfunktion(); -> nicht ansprechbar
        Ober [] oberArray = new Ober[3];

        oberArray[0] = new Ober();
        oberArray[1] = new Ober();
        oberArray[2] = new Ober();

        for (int i = 0; i < oberArray.length; i++)
        {
            oberArray[i].oberfunktion();
            // oberArray[i].unterfunktion(); -> Keine Typsicherheit mehr
        }
    }
}
