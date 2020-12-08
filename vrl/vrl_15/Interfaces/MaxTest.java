package Interfaces;

public class MaxTest {
    public static void main(String[] args) {
        Kfz [] kfz = new Kfz[5];
        kfz[0] = new Kfz("HO-X 123", 5);
        kfz[1] = new Kfz("M-AB 111", 2);
        kfz[2] = new Kfz("BT-A 321", 5);
        kfz[3] = new Kfz("HH-H 222", 7);
        kfz[4] = new Kfz("HO-Z 999", 5);
        System.out.println("Groesstes: " + kfz[Max.getMax(kfz)]);
    }
}
