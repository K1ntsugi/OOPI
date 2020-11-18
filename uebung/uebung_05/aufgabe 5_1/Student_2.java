public class Student_2
{
  // Attribute
  int Matrikelnummer = -1;
  int Geburtsjahr = -1;
  String Name = "undefined";
  String Fach = "undefined";
  // Geschützte Attribute
  private genderType gender;
  // Statische Attribute
  private static int countStudenten = 0;
  // Konstruktoren 
  public Student_2 (String Name)
  {
    this(Name, -1, -1, "unbekannt");
  }

  public Student_2 (String Name, int Geburtsjahr)
  {
   this(Name, Geburtsjahr, -1, "unbekannt"); 
  }

  public Student_2 (String Name, int Geburtsjahr, int Matrikelnummer)
  {
    this(Name, Geburtsjahr, Matrikelnummer, "unbekannt");
  }
// Neu: Aufgabe 5.1 a)
  public Student_2 (String Name, int Geburtsjahr, int Matrikelnummer, String Fach)
  {
    this.Name = Name;
    this.Geburtsjahr = Geburtsjahr;
    this.Matrikelnummer = Matrikelnummer;
    this.Fach = Fach;
    getAnzahl();
  }

  public void studieren ()
  {
    System.out.println(Name + " studiert gerade");
  }

  public void essen ()
  {
    System.out.println(Name + " isst gerade");
  }

  public void schlafen ()
  {
    System.out.println(Name + " schläft gerade");
  }

  public void Count ()
  {
    System.out.println(countStudenten);
  }

// Neu: Aufgabe 5.2 b)
  public static int getAnzahl()
  {
    return countStudenten++;
  }
// Neu Aufgabe 5.3. c)
  public genderType getType()
  {
    return gender;
  }

  public void setgenderType (genderType gender)
  {
    this.gender = gender;
  }
// Neu Aufgabe 5.4 d)
  public void isValid()
  {
    int [] ziffern = new int [10];
    int matrikelNR = Matrikelnummer;
    int i = 9;
    int quersum = 0;
    while (matrikelNR > 0)
    {
      ziffern[i] = matrikelNR % 10;
      quersum += matrikelNR % 10;
      matrikelNR = matrikelNR / 10;
      i--;
    }
    if (quersum % 2 == 0)
    {
      System.out.print("valide.\n");
    }
    else
    {
      System.out.print("nicht valide.");
    }
  }
}