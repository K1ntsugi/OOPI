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
        System.out.println(" laeuft nicht, weil er/sie studiert");
        ;
    }

    public void Schlafen() {
        
        super.Schlafen();
        System.out.println("Studenten schlaeft");
    }

    public void Jagen() {
        System.out.println("Studenten jagen nicht");
        ;
    }

    public void studieren() {
        System.out.println("Student studiert...");
    }

}
