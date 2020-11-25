public class polyMain {
    public static void main(String[] args) {
        Polynom p = new Polynom(0.0, 0.0, 0.0, 0.5, -13.0, 2.0);
        double[] y = new double[201];
        for (int x = -100; x <= 100; x++) {
            y[x+100] = p.f((double) x);
        }

        for (int i = -100; i <= 100; i++)
        {
            System.out.println(i + ": " + p.getKoeff(0) + "*" + i + "*" + i
                                        + p.getKoeff(1) + "*" + i
                                        + p.getKoeff(2) + " = " + y[i+100]
            );
        }
    }
}