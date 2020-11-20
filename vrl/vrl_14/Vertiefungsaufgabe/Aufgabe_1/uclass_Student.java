public class uclass_Student extends Mensch {

    public uclass_Student() {
        super();
        // System.out.println("Standardkonstruktor Student");
    }

    public uclass_Student(float Gewicht) {
        super(Gewicht);
        // System.out.println("Konstruktor Student");
    }

    public uclass_Student(float Gewicht, float Größe, int Intelligenz) {
        super(Gewicht, Größe, Intelligenz);
        System.out.println("Konstruktor Student");
    }

    public void Laufen() {
        System.out.println(" lauft nicht, weil er/sie studiert");
        ;
    }

    public void Schlafen() {
        // System.out.println("Studenten schlafen nicht");;
        super.Schlafen();
    }

    public void Jagen() {
        System.out.println("Studenten jagen nicht");
        ;
    }

    public void studieren() {
        System.out.println("Student studiert...");
    }

}
