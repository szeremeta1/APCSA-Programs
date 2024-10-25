// Dr. Brannon
// APCSA
// 20211007
// Utility class for creating and analyzing triangles

public class Triangle
{
   
   // Instance variables
   private double a, b, c;

   // Constructor methods
   public Triangle()
   {
      this.a = 1.0;
      this.b = 1.0;
      this.c = 1.0;
   }
   
   public Triangle(double a, double b, double c)
   {
      this.a = a;
      this.b = b;
      this.c = c;
   }
   
   // Object methods
   public boolean isEquilateral()
   {
      return a == b && b == c;
   }
   
   public boolean isIsosceles()
   {
      return (a == b && b != c && a != c) ||
             (a != b && b == c && a != c) ||
             (a != b && b != c && a == c);
   }
   
   public boolean isScalene()
   {
      return !this.isEquilateral() && !this.isIsosceles();
   }
   
   public boolean isSimilar(Triangle otherTriangle)
   {
      double x = otherTriangle.getA();
      double y = otherTriangle.getB();
      double z = otherTriangle.getC();
      return (x / a == y / b && y / b == z / c) ||
             (x / a == y / c && y / c == z / b) ||
             (x / b == y / a && y / a == z / c) ||
             (x / b == y / c && y / c == z / a) ||
             (x / c == y / a && y / a == z / b) ||
             (x / c == y / b && y / b == z / a);
   }
   
   // Each side must be less than the sum of the other two
   // Otherwise, it would collapse into a single line
   public boolean isValid()
   {
      return a + b > c &&
             b + c > a &&
             c + a > b;
   }
   
   // Uses Heron's Formula
   public double getArea()
   {
      double s = (a + b + c) / 2.0;
      return Math.sqrt(s * (s - a) * (s - b) * (s - c));
   }
   
   public double getA()
   {
      return a;
   }
   
   public double getB()
   {
      return b;
   }
   
   public double getC()
   {
      return c;
   }
   
   public void setA(double newA)
   {
      a = newA;
   }
   
   public void setB(double newB)
   {
      b = newB;
   }
   
   public void setC(double newC)
   {
      c = newC;
   }
   
   public String toString()
   {
      return "{" +
             "\n\ta = " + a +
             "\n\tb = " + b +
             "\n\tc = " + c +
             "\n}";
   }

}