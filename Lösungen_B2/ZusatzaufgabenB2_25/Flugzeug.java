package ZusatzaufgabenB2_25;

public class Flugzeug
{
	private String name;
	private boolean captain;
	private int passagiere;
	private static int count = 0; //optional, nicht gefordert

	public Flugzeug()
	{
		name = "Standard";
		captain = false;
		passagiere = 0;
		System.out.println("Neues Flugzeug namens " + name);
		count++;
	}
	public Flugzeug(String name, int passagiere)
	{
		this.name = name;
		this.passagiere = passagiere;
		System.out.println("Neues Flugzeug namens " + name);
		count++;
	}
	public Flugzeug(String name, boolean captain, int passagiere)
	{
		this.name = name;
		this.captain = captain;
		this.passagiere = passagiere;
		System.out.println("Neues Flugzeug namens " + name);
		count++;
	}

	public void captainZusteigen()
	{
		this.captain = true;
		System.out.println("Der Captain ist zugestiegen!");
	}
	public void captainAussteigen()
	{
		this.captain = false;
		System.out.println("Der Captain ist ausgestiegen, bitte nicht fliegen!");
	}

	public void fliegen() throws Exception
	{
		if(!this.captain)
		{
			throw new Exception("Der Captain ist nicht an Bord!!\n");
		}
		else
		{
			System.out.println("Das Flugzeug hebt ab. Guten Flug!\n");
		}
	}

	public String toString()
	{
		return ("Flugzeugname: " + this.name + ", Captain an Bord: " + captain + ", Passagiere: " + passagiere);
	}


	//optional, nicht gefordert
	public static void anzahlFlugzeuge()
	{
		System.out.println("Es gibt aktuell " + count + " Flugzeuge");
	}
}
