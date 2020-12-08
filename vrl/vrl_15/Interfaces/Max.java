package Interfaces;

public class Max {
    public static int getMax(Groesse[] array)
    {
        int max = 0;
        for (int i=0; i < array.length; i++)
        {
            if (array[i].getGroesse() > array[max].getGroesse())
            {
                max = i;
            }
        }
        return max;
    }
}
