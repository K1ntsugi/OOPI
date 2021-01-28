package ZusatzaufgabenB2_25;

public class Main
{
	public static void main(String[] args)
	{
		Flugzeug boeing1 = new Flugzeug("Boeing1", 40);
		
		try
		{
			boeing1.fliegen();
		}
		catch(Exception e)
		{
			System.out.println("Jetzt kommt die Exception: ");
			System.out.println(e.getMessage());
		}
		
		boeing1.captainZusteigen();
		try
		{
			boeing1.fliegen();
		}
		catch(Exception e)
		{
		}
		
		Flugzeug emirates1 = new Flugzeug("Emirates1", true, 120);
		emirates1.captainAussteigen();
		try
		{
			emirates1.fliegen();
		}
		catch(Exception e)
		{
			System.out.println("Jetzt kommt die Exception: ");
			System.out.println(e.getMessage());
			System.out.println("Der Captain kommt gleich, einen Moment bitte!");
			emirates1.captainZusteigen();
			try
			{
				emirates1.fliegen();
			}
			catch (Exception e2)
			{
				System.out.println("Oje, jetzt gibt es eine Dauerschleife!!!");
			}
		}
		
		//System.out.println("\n\ntoString()-Ausgabe:\n" + boeing1.toString());
		//System.out.println("toString()-Ausgabe:\n" + emirates1.toString());
		
		System.out.println("\n\nneu gebaute toString()-Ausgabe:\n" + boeing1.toString());
		System.out.println("neu gebaute toString()-Ausgabe:\n" + emirates1.toString());
		
		System.out.println("\n\nNun wird static in der Flugzeugklasse getestet:");
		Flugzeug.anzahlFlugzeuge();
		//boeing1.anzahlFlugzeuge(); geht auch
	}
}