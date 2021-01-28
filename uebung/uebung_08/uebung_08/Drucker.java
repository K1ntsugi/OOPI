package uebung_08;

abstract class Drucker {
    private boolean color;

    public Drucker() {
        boolean color = this.color;
    }

    abstract public void print(String text); // Merke keyword abstract für abstrakte Methoden #captainObvious

}