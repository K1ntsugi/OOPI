/*
c) Schreiben sie eine Klasse Hochschule in einer eigenen Datei mit einer Main
Funktion, in der Sie verschiedene Studenten anlegen. Verwenden Sie die
verschiedenen Konstruktoren.
d) Sammeln Sie alle Studenten in einem Array und lassen Sie alle Studenten
nacheinander studieren, essen, studieren und schlafen indem Sie das Array
durchlaufen.
*/
public class Hochschule
{
  public static void main (String [] args)
  {
    Student [] studierende = new Student[5];
    studierende[0] = new Student("Max");
    studierende[1] = new Student("Anna", 1994);
    studierende[2] = new Student("Hannes", 1995, 34823904);
    studierende[3] = new Student("Karla", 1996, 87981731);
    studierende[4] = new Student("Tom", 1997, 93131331);

    for (int i = 0; i < studierende.length; i++)
    {
      studierende[i].studieren();
      studierende[i].essen();
      studierende[i].studieren();
      studierende[i].schlafen();
    }

    // Ich wollte eine for-each Schleife nehmen, klappt aber nicht ;(
    /*for (String k: studierende)
    {
      k.studieren();
      k.essen();
      k.studieren();
      k.schlafen();
    }*/
  }
}
