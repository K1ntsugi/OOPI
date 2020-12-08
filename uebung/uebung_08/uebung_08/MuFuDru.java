package uebung_08;

public class MuFuDru extends Drucker implements Scannen{
    public MuFuDru(boolean color) {
        super();
    }

    @Override
    public void print(String text) {
        System.out.println(text);
    }

    @Override
    public void scan() {
        System.out.println("Muss noch implementiert werden ;)");
    }
}
