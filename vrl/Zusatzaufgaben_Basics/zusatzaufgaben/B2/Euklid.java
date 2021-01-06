package zusatzaufgaben.B2;

public class Euklid {

    private int div;
    private int mod;
    private int x, y;

    public Euklid(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getDiv() {
        return div;
    }

    public int getMod() {
        return mod;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void printEuklid(Euklid obj) {
        int ggT = euklidAlgo(x, y);
        System.out.println("Der ggT für " + x + " und " + y + " lautet: " + ggT);
    }

    private int euklidAlgo(int a, int b) {
        if (a == b) {
            return a;
        } else if (a > b) {
            return euklidAlgo(a - b, b);
        } else {
            return euklidAlgo(a, b - a);
        }
    }
}
