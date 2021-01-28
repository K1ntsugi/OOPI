public class ZusatzaufgabenB2_23bis24
{
	public static void main(String[] args)
	{
		//23
		int cnt = 1;
		float stepIgel = 5.3F;
		float stepHase = 10.8F;
		float posIgel = 270.0F;
		float posHase = 0.0F;
		
		while(posIgel > posHase)
		{
			posIgel = posIgel + stepIgel;
			posHase = posHase + stepHase;
			
			System.out.printf("Nach " + cnt + " Schritten: ");
			System.out.printf("Hase %.2fcm, ", posHase);
			System.out.printf("Igel %.2fcm \n", posIgel);
			cnt++;
		}
		
		
		//24
		//double[] arr1 = new double[4];
		double[] arr1 = {-5.0, 1.7, 19.0, 16.9};
		double[] arr2 = {13.3, 12.0, 12.5};
		
		System.out.println(groessterTemperaturSprung(arr1));
		
		double sprung2 = groessterTemperaturSprung(arr2);
		System.out.println("Und groesster Temperatursprung von Array 2 war: " + sprung2);
	}
	
	public static double groessterTemperaturSprung(double[] array)
	{
		double differenz = 0.0;
		double maxDiff = 0.0;
		
		for(int i=0; i<array.length-1; i++)
		{
			differenz = array[i] - array[i+1];
			differenz = Math.abs(differenz);
			
			if(differenz > maxDiff)
			{
				maxDiff = differenz;
			}
		}
		return maxDiff;
	}
}