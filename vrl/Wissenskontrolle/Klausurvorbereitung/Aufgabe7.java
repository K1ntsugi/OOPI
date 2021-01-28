package Klausurvorbereitung;

public class Aufgabe7 {
    public static void main(String[] args) {
        try {
            Bruch a1 = new Bruch(10, 2);
            //Bruch a2 = new Bruch(2,0);
            Bruch a3 = new Bruch(23, 46);
            Bruch a4 = Bruch.add(a1,a3);
            System.out.println(a4.toString());


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
