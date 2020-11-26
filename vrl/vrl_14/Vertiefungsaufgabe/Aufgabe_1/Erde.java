public class Erde {
    public static void main(String[] args) {
        Mensch Max = new Mensch();
        Mensch Mike = new Mensch(85, 190, 110);
        uclass_Student Alice = new uclass_Student();
        Informatikstudent Tobi = new Informatikstudent();
        System.out.print("Alice ");
        Alice.Laufen();
        lauf(Max);
        lauf(Mike);
        lauf(Alice);
        lauf(Tobi);
    }

    public static void lauf(Mensch x)
    {
        x.Laufen();
    }

}
