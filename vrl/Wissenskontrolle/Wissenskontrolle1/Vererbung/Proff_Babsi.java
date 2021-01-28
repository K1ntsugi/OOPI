package Wissenskontrolle1.Vererbung;

public class Proff_Babsi extends Professor {

    public Proff_Babsi(String name, int alter, int IQ) {
        super(name, alter, IQ);
    }

    public String getName() {
        return name;
    }

    public void setName(String neuerName) {
        name = neuerName;
    }

    public void belehren() {
        System.out.println("Ist doch TRIVIAL!!!");
    }

}
