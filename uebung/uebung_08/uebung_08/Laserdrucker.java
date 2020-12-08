package uebung_08;

public class Laserdrucker extends Drucker {

    public Laserdrucker(boolean color) {
        super(color);
    }

    public void print(String text) {
        System.out.println(text);
    }
}
