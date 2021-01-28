package Wissenskontrolle1.Vererbung;

public class TestKlasse {
    public static void main(String[] args) {
        try {
            Proff_Babsi babsi1 = new Proff_Babsi("babsi", 58, 140);
            Proff_Babsi babsi2 = new Proff_Babsi("babsi-Schwester", 58, 40);
            Adamsky DER_EINE = new Adamsky("Flori", 35, 110, HAW.HAW);
            Professor[] metameta = new Professor[3];

            metameta[0] = babsi1;
            metameta[1] = babsi2;
            metameta[2] = DER_EINE;

            for (Professor k : metameta) {
                k.belehren();
            }

            System.out.println(DER_EINE.getName());
            babsi1.setName("ANNA");
            System.out.println(babsi1.getName());

            Professor prof = new Adamsky("adam", 22, 111, HAW.HAW);
            prof.belehren();

            babsi1.getFach();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
