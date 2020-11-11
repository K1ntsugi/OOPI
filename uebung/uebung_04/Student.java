/*
Aufgabe 3.1 Klassen und Objekte
a) Schreiben Sie eine Klasse Student mit den Attributen
- Matrikelnummer
- Geburtsjahr
- Name
Und den Methoden
- studieren
- essen
- schlafen
die jeweils nur eine Ausgabe haben in der Form
<<Name>> studiert/schläft/isst gerade.
b) Schreiben Sie drei Konstruktoren für die Klasse Student. Die übergebenen
Parameter sollen sein
- Name
- Name, Geburtsjahr
- Name, Geburtsjahr, Matrikelnummer
Sofern kein Geburtsjahr und keine Matrikelnummer angegeben werden, sollen
default-Werte hinterlegt werden.
c) Schreiben sie eine Klasse Hochschule in einer eigenen Datei mit einer Main
Funktion, in der Sie verschiedene Studenten anlegen. Verwenden Sie die
verschiedenen Konstruktoren.
d) Sammeln Sie alle Studenten in einem Array und lassen Sie alle Studenten
nacheinander studieren, essen, studieren und schlafen indem Sie das Array
durchlaufen.
*/

public class Student // Hier musste ich public verwenden, sonst gabe es einen access error. Warum?
{
  int Matrikelnummer = -1;
  int Geburtsjahr = -1;
  String Name = "undefined";
  // Konstruktoren (b)
  public Student (String Name)
  {
    this.Name = Name;
  }

  public Student (String Name, int Geburtsjahr)
  {
    this(Name);
    this.Geburtsjahr = Geburtsjahr;
  }

  public Student (String Name, int Geburtsjahr, int Matrikelnummer)
  {
    this(Name, Geburtsjahr);
    // Statt der Zeile 47 hatte ich ursprünglich:
    // this(Name);
    // this(Geburtsjahr);
    // Das müsste doch eigentlich das gleiche wie meine obige Zeile 47 abdecken, funktioniert aber nicht. Verstehe noch nicht warum.
    this.Matrikelnummer = Matrikelnummer;
  }

  // a
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
}
