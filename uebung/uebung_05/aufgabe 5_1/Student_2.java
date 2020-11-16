public class Student_2
{
  // Attribute
  int Matrikelnummer = -1;
  int Geburtsjahr = -1;
  String Name = "undefined";
  String Fach = "undefined";
  // Geschützte Attribute
  private genderType type;
  // Statische Attribute
  public static int countStudenten = 0;
  // Konstruktoren 
  public Student_2 (String Name)
  {
    this.Name = Name;
  }

  public Student_2 (String Name, int Geburtsjahr)
  {
    this(Name);
    this.Geburtsjahr = Geburtsjahr;
  }

  public Student_2 (String Name, int Geburtsjahr, int Matrikelnummer)
  {
    this(Name, Geburtsjahr);
    // Statt der Zeile 47 hatte ich ursprünglich:
    // this(Name);
    // this(Geburtsjahr);
    // Das müsste doch eigentlich das gleiche wie meine obige Zeile 47 abdecken, funktioniert aber nicht. Verstehe noch nicht warum.
    this.Matrikelnummer = Matrikelnummer;
  }
// Neu: Aufgabe 5.1 a)
  public Student_2 (String Name, int Geburtsjahr, int Matrikelnummer, String Fach)
  {
    this(Name, Geburtsjahr, Matrikelnummer);
    this.Fach = Fach;
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

// Neu: Aufgabe 5.2 b)
  public static int getAnzahl()
  {
    return countStudenten++;
  }
// Neu Aufgabe 5.3. c)
  public genderType getType()
  {
    return type;
  }
}