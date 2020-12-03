class Kontofuehrung5
{
    public static void main (String[] args)
    {
        Konto5[] konto = new Konto5[4];
        konto[0] = new Girokonto5(1111111, 1234);
        konto[1] = new Sparkonto5(2222222, 5.0F);
        konto[2] = new Girokonto5(3333333, 5678);
        konto[3] = new Sparkonto5(4444444, 5.5F);
        System.out.println("Folgende Konten exisitieren:");
        for (int i = 0; i < konto.length; i++)
        {
            System.out.println("---------");
            System.out.println(konto[i].kennung());
            System.out.println("---------");
            System.out.println(konto[i]);
        }
    }
}