package uebung_08;


class Aufgabe4_1 {
    public String getInfo() {
        return "4_1";
    }
}

class Aufgabe4_2 extends Aufgabe4_1 {
    public String getInfo() {
        return "4_2";
    }
}

class Aufgabe4_3 extends Aufgabe4_2 {
    public String getInfo() {
        return "4_3";
    }
}

public class Aufgabe_04 {
    static String getInfo(Aufgabe4_1 o) {
        return o.getInfo();
    }

    public static void main(String[] args) {
        Aufgabe4_1 a1 = new Aufgabe4_3();
        Aufgabe4_1 a2 = new Aufgabe4_2();
        Aufgabe4_1 a3 = new Aufgabe4_1();
        System.out.println(a3.getInfo());
        System.out.println(getInfo(a3));
        System.out.println(getInfo(a1));
        System.out.println(a2.getInfo());
    }
}

