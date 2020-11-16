public class Hochschule_2 
{
    public static void main (String [] args)
  {
    Student_2 [] studierende = new Student_2[5];
    studierende[0] = new Student_2("Max");
    studierende[1] = new Student_2("Anna", 1994);
    studierende[2] = new Student_2("Hannes", 1995, 34823904);
    studierende[3] = new Student_2("Karla", 1996, 87981731);
    studierende[4] = new Student_2("Tom", 1997, 93131331);

    for (int i = 0; i < studierende.length; i++)
    {
      studierende[i].studieren();
      studierende[i].essen();
      studierende[i].studieren();
      studierende[i].schlafen();
    }
  }    
}
