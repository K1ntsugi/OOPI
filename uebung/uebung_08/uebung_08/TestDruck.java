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

        MuFuDru mufu = new MuFuDru(true);

        Scannen[] scanner = new Scannen[5];
        scanner[0] = mufu; // ok

        Drucker[] drucker = new Drucker[5];
        drucker[0] = mufu; // ok

        Tintendrucker[] tintis = new Tintendrucker[5];
        tintis[0] = mufu; // Geht nicht


    }
}
