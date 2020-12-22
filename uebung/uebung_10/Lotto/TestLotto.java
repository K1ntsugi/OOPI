/*
Erstellen Sie eine Klasse Lottoziehung. Erstellen Sie die Methode zieheZahl(), die eine
Zufallszahl zwischen 1 und 49 (einschließlich) zurückgibt.
Erstellen Sie eine Methode samstagsZiehung(), die ein Array mit sechs Zufallszahlen (1-49)
ermittelt und als Attribut Ihrer Klasse speichert. Verwenden Sie zur Umsetzung auch ihre
Methode zieheZahl(). Achten Sie darauf, dass keine Zahl im Array doppelt vorkommt. Sie
benötigen dazu wahrscheinlich eine weitere Methode boolean pruefeArrayAufZahl(int zahl).
Erstellen Sie ein Objekt Ihrer Klasse und geben Sie die Zahlen der Samstagsziehung aus.
*/

package Lotto;

public class TestLotto {

    public static void main(String[] args) {
        LottoSpiel heute = new LottoSpiel();
        System.out.println("Ziehung der Lottozahlen: ");
        heute.samstagsziehung();
    }
}
