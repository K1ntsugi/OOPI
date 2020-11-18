public class Hochschule_2 
{
    public static void main (String [] args)
  {
    genderType m = genderType.MÄNNLICH;
    genderType f = genderType.WEIBLICH;
    Student_2 karl = new Student_2("Karl", 1993, 24680);
    Student_2 carla = new Student_2("Carla", 1992, 13579);
    karl.setgenderType(m);
    carla.setgenderType(f);
    System.out.println("Karl ist " + karl.getType());
    System.out.println("Carla ist " + carla.getType());
    System.out.println("Die Matrikelnummer von Karl ist: ");
    karl.isValid();
    System.out.println("Die Matrikelnumer von Carla ist ");
    carla.isValid();
  }
}
