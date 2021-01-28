public class ZusatzaufgabenB2_22
{
	public static void main(String[] args)
	{
		System.out.print("ggt von 420 und 680 ist: ");
		euklidAlgorithm(680,420);
	}
	
	public static int euklidAlgorithm(int a, int b)
	{
		int ret = 0;
		
		if(a==b)
		{
			//return a;
			//ret = a;
			System.out.println(a);
		}
		else if(a>b)
		{
			euklidAlgorithm(a-b, b);
		}
		else
		{
			euklidAlgorithm(a, b-a);
		}
		
		return 0;
	}
}