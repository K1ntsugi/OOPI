package zusatzaufgaben.B1;

public class Zusatzaufgaben {
    public static void main(String[] args) {
        int[] array = new int[10];
        MeineKlasse myA = new MeineKlasse();
        MeineKlasse myB = new MeineKlasse();
        MeineKlasse myC = new MeineKlasse();
        // 1
        System.out.println("Das sind");
        System.out.println("Zusatzaufgaben");
        // 2
        System.out.print("Das sind");
        System.out.println(" Zusatzaufgaben");
        // 3
        double a = 17.0 / 2.0;
        MeineKlasse oop = new MeineKlasse();
        oop.setSchwierigkeit("mittel");
        String s = oop.getSchwierigkeit();

        myA.fillArrayA(array);
        myB.fillArrayB(array);
        objOut(myA);
        System.out.println();
        objOut(myB);
        System.out.println();
        myC.recursiveArray(array, array.length);

    }

    public static void objOut(MeineKlasse obj) {
        int[] arr = obj.getArray();
        for (int k : arr) {
            System.out.print(k + " ");
        }
    }
}
