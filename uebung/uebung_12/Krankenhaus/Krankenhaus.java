package Krankenhaus;

public class Krankenhaus {
    public static void main(String[] args) {
        Krankenhaus hospital = new Krankenhaus();
        try {
            Mitarbeiter frederike = new Krankenpfleger("Mueller");
            Mitarbeiter karla = new Arzt("Lauterbach");
            Mitarbeiter christiane = new Arzt("Drosten");
            //fügen Sie alle Mitarbeiter in ein Array
            Mitarbeiter[] objArr = new Mitarbeiter[3];
            objArr[0] = frederike;
            objArr[1] = karla;
            objArr[2] = christiane;
            //Durchlaufen Sie das Array und übergeben Sie jeden Mitarbeiter an die Funktion
            /*Ausgabe:
             * Krankenpflegerin Mueller sagt hallo
             * Stationsärztin Lauterbach sagt hallo
             * Stationsärztin Drosten sagt hallo
             */
            for (Mitarbeiter k : objArr) {
                hospital.vorstellung_starten(k);
            }

        } catch (Exception e) {
            e.getStackTrace();
            //System.out.println(e.getMessage());
        }
    }

    public void vorstellung_starten(Mitarbeiter m) {
        m.vorstellen();
    }
}