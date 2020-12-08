package uebung_08;

public class TestDruck {
    public static void main(String[] args) {
        String s = "Der Nikolaus war da!";
        Drucker[] druckerParade = new Drucker[5];
        druckerParade[0] = new Laserdrucker(true);
        druckerParade[1] = new Tintendrucker(true);
        druckerParade[2] = new Laserdrucker(true);
        druckerParade[3] = new Tintendrucker(true);
        druckerParade[4] = new Laserdrucker(true);
        for (Drucker drucker : druckerParade) {
            System.out.println("----------------");
            drucker.print(s);

        }
    }
}
