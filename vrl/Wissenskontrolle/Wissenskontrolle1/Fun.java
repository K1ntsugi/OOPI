package Wissenskontrolle1;

public class Fun {

    static int counter;

    public static void main(String[] args) {
        int z = 9;
        boolean res = ternaerY(z);
        if (res) {
            System.out.println("Der Wert ist kleiner 10 und größer 0");
        } else {
            System.out.println("Der Wert ist out of bounds");
        }

        boolean y = ternaerY(20);
        boolean e = ternaerY(2);

        System.out.println("Augabe 29: \n");
        System.out.println("a:");
        int a = 0;
        while (a < 10) {
            System.out.print(a + " ");
            a++;
        }
        System.out.println("\nc:");
        int c = 10;
        while (c < 10) {
            System.out.println(c);
            c--;
        }
        System.out.println(counter);

        double data = (5.0/3);
        //System.out.printf("%1,56%n", 15678);
        System.out.printf("%.3f%n" , data);
        System.out.printf("%100s%n", "Rechtsbündig");
        System.out.printf("%100s%n", "Rechts!");

    }

    public static boolean ternaerY(int y) {
        counter++;
        boolean x;
        x = (y > 0 && y < 10) ? true : false;
        return x;
    }
}
