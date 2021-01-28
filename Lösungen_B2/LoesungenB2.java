
import java.util.Scanner;

public class LoesungenB2 {
    public static final double Pi = 3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679;
    private int[] array = {3, 5, 7, 9, 11};

    public static void main(String[] args) throws Exception {
        int a3 = 20;
        int a6 = 101;
        boolean a6_1;
        boolean a6_2;

        System.out.println("Aufgabe 1: ");
        aufgabe1();

        System.out.println("Aufgabe 2: ");
        aufgabe2();

        System.out.println("\n" + "Aufgabe 3: ");
        aufgabe3(a3);

        System.out.println("\n" + "Aufgabe 4: ");
        aufgabe4();

        System.out.print("\n" + "Aufgabe 5: ");
        System.out.println(aufgabe5(a3));

        System.out.print("\n" + "Aufgabe 6: ");
        a6_1 = aufgabe6(a3);
        a6_2 = aufgabe6(a6);
        System.out.print("Ergebnis Aufgabe 6: " + a6_1 + " und " + a6_2);

        System.out.print("\n" + "Aufgabe 7: ");
        a6_1 = aufgabe7(333);
        a6_2 = aufgabe7(120);
        System.out.print("Ergebnis Aufgabe 7: " + a6_1 + " und " + a6_2);


        System.out.print("\n" + "Aufgabe 8: ");
        try {
          System.out.println(aufgabe8(-1, 2));
        } catch(Exception e) {
          System.out.println(e.toString());
        }

        System.out.print("\n" + "Aufgabe 9: ");
        aufgabe9(1, 2, 3);

        System.out.println("Oder für float: ");
        aufgabe9(1.2f, 3.4f, 5.6f);

        System.out.print("\n" + "Aufgabe 10: ");
        aufgabe10(40);

        System.out.print("\n" + "Aufgabe 11: ");
        aufgabe11();

        System.out.print("\n" + "Aufgabe 12: ");
        try {
          double a12 = aufgabe12(4);
          System.out.print("Kreisradius -> " + a12);
        } catch(Exception e) {
          e.printStackTrace();
        }

        System.out.print("\n" + "Aufgabe 13: ");
        int[] arr13 = {1, 2, 3, 4, 5};
        System.out.println("Ursprüngliches Array: ");
        outputArr(arr13);
        arr13 = aufgabe13(arr13);
        System.out.println("\nNeues Array:");
        outputArr(arr13);

        System.out.print("\n" + "Aufgabe 14: ");
        int[] arr14 = {9, 9, 9, 9, 9};
        System.out.println("Ursprüngliches Array: ");
        outputArr(arr14);
        arr14 = aufgabe14(arr14, 1);
        System.out.println("\nNeues Array:");
        outputArr(arr14);

        System.out.print("\n" + "Aufgabe 15: ");
        int[] arr15 = {2, 4, 6, 8, 10};
        System.out.println("Ursprüngliches Array: ");
        outputArr(arr15);
        arr15 = aufgabe15(arr15, 4);
        System.out.println("\nNeues Array (multipliziert mit n):");
        outputArr(arr15);
        System.out.println("GGT: "  + ggt(40,20));


    }

    public static void outputArr(int[] arr) {
        for (int k : arr) {
            System.out.print(k + " ");
        }
    }

    public static void outputArr(double[] arr) {
        for (double k : arr) {
            System.out.print(k + " ");
        }
    }

    public static void aufgabe1() {
        System.out.println("voll automatisch!");
    }

    public static void aufgabe2() {
        char A = 'A';
        for (int i = 0; i < 10; i++) {
            System.out.print(A + " ");
        }
    }

    public static void aufgabe3(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("A" + " ");
        }
    }

    public static void aufgabe4() {

        System.out.println("Reihe a (for): ");
        for (int i = 0; i < 7; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\nReihe a (while): ");
        int a = 0;
        while (a < 7) {
            System.out.print(a + " ");
            a++;
        }
        System.out.println("\nReihe b (for): ");
        for (int i = 1; i < 7; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\nReihe b (while): ");
        int b = 1;
        while (b < 7) {
            System.out.print(b + " ");
            b++;
        }
        System.out.println("\nReihe c (for): ");
        // c. 1,3,5,7,9,11
        for (int i = 1; i < 12; i = i + 2) {
            System.out.print(i + " ");
        }
        System.out.println("\nReihe c (while): ");
        int c = 1;
        while (c < 12) {
            System.out.print(c + " ");
            c += 2;
        }
        //d. 1,3,6,10,15,21,28,36 (+2,+3,+4,...)
        System.out.println("\nReihe d (for): ");
        int j = 2;
        for (int i = 1; i < 37; i = i + j - 1) {
            System.out.print(i + " ");
            j++;
        }
        //Alternative:
        int cnt1 = 0;
    		int cnt2 = 1;
    		int sum = 0;
    		while(cnt1<=8)
    		{
    			sum = sum + cnt2;
    			System.out.print(sum + ",");
    			cnt1++;
    			cnt2++;
    		}
    		System.out.println();
        //Alternative:
        int diff = 1;
        int wert = 0;
        while(wert <=36)
        {
          wert = wert + diff;
          diff++;
          System.out.print(wert + " ");
        }


        System.out.println("\nReihe d (while): ");
        int d1 = 1;
        int d2 = 2;
        while (d1 < 37) {
            System.out.print(d1 + " ");
            d1 = d1 + d2;
            d2++;
        }
        System.out.println("\nReihe e (for): ");
        for (int i = 10; i > 3; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\nReihe e (while): ");
        int e = 10;
        while (e > 3) {
            System.out.print(e + " ");
            e--;
        }
        System.out.println("\nReihe f (for): ");
        for (int i = 10; i >= 0; i = i - 2) {
            System.out.print(i + " ");
        }
        System.out.println("\nReihe f (while): ");
        int f = 10;
        while (f >= 0) {
            System.out.print(f + " ");
            f -= 2;
        }
    }

    public static int aufgabe5(int n) {
        return (2*n);
    }

    public static boolean aufgabe6(int n) {
      if(n > 0 && n < 100)
      {
        return true;
      }
      else
      {
        return false;
      }
    }

    public static boolean aufgabe7(int n) {
      if(n > 0 && n < 100 || (n % 20 == 0) )
      {
        return true;
      }
      else
      {
        return false;
      }
    }

    public static int aufgabe8(int a, int b) throws Exception {
        if (a > 0 && b > 0) {
            return(a * b);
        } else
        {
            throw new Exception("aufgabe 8 negativer wert");
        }
    }

    public static int aufgabe9(int z1, int z2)
  	{
  		return z1+z2;
  	}
  	public static int aufgabe9(int z1, int z2, int z3)
  	{
  		return z1+z2+z3;
  	}
  	public static float aufgabe9(float z1, float z2)
  	{
  		return z1+z2;
  	}
    public static float aufgabe9(float z1, float z2, float z3)
    {
      return z1+z2+z3;
    }

    public static boolean aufgabe10(int n) {
        if (n % 2 == 0) {
            System.out.print(n + " ist eine gerade Zahl");
            return true;
        } else {
            System.out.print(n + " ist eine ungerade Zahl");
            return false;
        }
    }

    public static void aufgabe11() {
      Scanner s = new Scanner(System.in);

      //11
      int eingabe = s.nextInt();
      int summe = 0;
      while(eingabe != 0)
      {
        summe = summe + eingabe;
        eingabe = s.nextInt();
      }
      System.out.println("Summe aller eingegebenen Zahlen: " + summe);
    }

    public static double aufgabe12(int r) throws Exception {
        //Kreisfläche: 2*r*Pi
        double A = 0;

        if (r > 0) {
            A = 2 * r * Pi;
        } else {
            throw new Exception("Aufgabe 12 r negativ");
        }
        return A;
    }

    public static int[] aufgabe13(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + i+1;
        }
        return arr;
    }

    public static int[] aufgabe14(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = n;
        }
        return arr;
    }

    public static int[] aufgabe15(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * n;
        }
        return arr;
    }

    //Aufgabe 16
    public int getValue(int[] array, int index) {
        System.out.println(array[index]);
        return array[index];
    }

    //Aufgabe 17
    public int[] serValue(int[] array, int index, int value) {
        array[index] = value;
        return array;
    }

    // Aufgabe 18
    public static int getMinIndex(int[] array) {
        int minIndex = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }


    //Aufgabe 19
    public static void einkaufen()
  	{
  		Scanner s = new Scanner(System.in);
  		int cnt = 1;
  		double summe = 0.0;
  		double preis = 0.0;
  		String ende = "";
  		System.out.println("Willkommen beim Einkaufen! Geben Sie nacheinander die Preise der Artikel ein (max. 10):");

  		do
  		{
  			System.out.print("Preis " + cnt + ":");
  			preis = s.nextDouble();
  			summe += preis;
  			System.out.println("Wollen Sie noch einen Preis eingeben?:");
  			ende = s.next();
  			//ende = s.nextLine();  geht nicht, Fehler inputmismatchexception
  			//System.out.println(ende);
  			cnt++;
  		} while(!(ende.equals("nein")) && !(ende.equals("Nein")) && !(ende.equals("NEIN")) && cnt<=10);	//(ende != "nein" || ende != "Nein" || ende != "NEIN" || cnt == 10);  ||  || cnt<=10

  		if(cnt>10)
  		{
  			System.out.println("Sie haben die maximale Anzahl an Preisen erreicht!\n");
  		}

  		System.out.println("Fertig mit Preisen eingeben.\n");

  		System.out.println("Die Summe ihres Einkaufs betraegt: " + summe);
  		System.out.println("Ihr Einkauf entaehlt " + summe/116*16 + "Euro Mehrwertsteuer");
  	}

  //Aufgabe 20 & 21 separate Datei



    public static int ggt(int a, int b)
    {
      if(a==b)
      {
        return a;
      }
      else if(a>b)
      {
        return ggt(a-b,b);
      }
      else
      {
        return ggt(a,b-a);
      }
    }

//Aufgaben 23 & 24 separate Datei










}
