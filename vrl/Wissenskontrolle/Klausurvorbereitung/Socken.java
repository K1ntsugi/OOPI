package Klausurvorbereitung;

public class Socken {
    public static void main(String[] args) {
        SockenKlasse socke1 = new SockenKlasse("weiss");
        SockenKlasse socke2 = new SockenKlasse("rot");
        SockenKlasse socke3 = socke2; // rot
        SockenKlasse socke4 = socke1; // weiss
        SockenKlasse socke5 = new SockenKlasse("gelb");
        socke3.setFarbe("gelb"); // gelb
        socke2.setFarbe("schwarz" + socke1.getFarbe()); // s2 -> schwarz-weiss
        socke1 = socke5; //gelb
        socke5 = socke4; //weiss
        System.out.println("Socke 1: " + socke1.getFarbe());
        System.out.println("Socke 2: " + socke2.getFarbe());
        System.out.println("Socke 3: " + socke3.getFarbe());
        System.out.println("Socke 4: " + socke4.getFarbe());
        System.out.println("Socke 5: " + socke5.getFarbe());
    }
}
