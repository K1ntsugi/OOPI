package uebung_08;

public class Tintendrucker extends Drucker {

    public Tintendrucker(boolean color) {
        super();
    }

    @Override
    public void print(String text) {
        System.out.println(text);
    }
}
