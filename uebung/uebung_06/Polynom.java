public class Polynom {

  // Polynom fünften Grades: ax^5 + bx^4+cx^3+dx^2+ex+f = 0
  double koeff[] = new double[5];

  public Polynom() {
    this(0, 0, 0, 0, 0, 0);
  }

  public Polynom(double a, double b, double c, double d, double e, double f) {
    koeff = new double[6];
    koeff[0] = a;
    koeff[1] = b;
    koeff[2] = c;
    koeff[3] = d;
    koeff[4] = e;
    koeff[5] = f;
  }

  public double getKoeff(int stelle) {
    return koeff[stelle];
  }

  public void setKoeff(int stelle, double wert) {
    koeff[stelle] = wert;
  }

  public String nullstellen() {
    String retString = "";
    double diskriminante = 0.0F;
    double x1 = 0.0F;
    double x2 = 0.0F;
    double a = koeff[3];
    double b = koeff[4];
    double c = koeff[5];

    retString = "";
    if (koeff[0] == 0 && koeff[1] == 0 && koeff[2] == 0) {
      // nullstellenberechnung
      diskriminante = ((b * b) - (4.0 * a * c));

      if (diskriminante < 0) {
        System.out.println("Für diese Gleichung existieren keine reelen Lösungen");
      } else {
        if (diskriminante == 0) {
          x1 = ((-1 * b) / (2 * a));
          System.out.println("Die Nullstelle lautet: " + x1);
        } else {
          x1 = ((-1 * b) + (Math.sqrt(diskriminante)) / (2 * a));
          x2 = ((-1 * b) - (Math.sqrt(diskriminante)) / (2 * a));

          System.out.println("Die Nullstellen lauten: " + x1 + " ," + x2);
        }
      }
    } else {
      retString = "zu komplex";
    }
    return retString;
  }

  public Polynom add(Polynom rhs) // right hand side
  {
    Polynom p = new Polynom();
    for(int i = 0; i < koeff.length; i++)
    {
      p.setKoeff(0, (koeff[i] + rhs.getKoeff(i)));
    }
    return p;
  }

  public double f (double x)
  {
    double val = koeff[0] * x*x*x*x+x
                +koeff[1] * x*x*x*x
                +koeff[2] * x*x*x
                +koeff[3] * x*x
                +koeff[4] * x;
    return val;
  }

}