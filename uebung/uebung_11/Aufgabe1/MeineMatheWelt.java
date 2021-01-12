package Aufgabe1;

public class MeineMatheWelt {
    public static void main(String[] args) {
        try {
            System.out.println(Mathe.div(2.5, 7.0));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
