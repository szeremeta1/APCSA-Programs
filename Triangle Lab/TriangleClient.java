// Alexander Szeremeta
// APCSA
// September 26, 2024
// Triangle Lab

public class TriangleClient {
   public static void main (String[] args) {
      Triangle t1 = new Triangle(3, 4, 5);
      Triangle t2 = new Triangle(4, 13, 15);
      Triangle t3 = new Triangle(5, 5, 10);
      Triangle t4 = new Triangle();
      Triangle t5 = new Triangle(6, 8, 10);
      
      System.out.println("Area of t1: " + t1.getArea());
      
      System.out.print("Sides of t2: ");
      System.out.print(t2.getA() + ", ");
      System.out.print(t2.getB() + ", ");
      System.out.println(t2.getC());
      System.out.println();
      
      System.out.println("t2 validity: " + t2.isValid());
      
      System.out.println("Sum of sides of t4: " + (int) t4.getA() + (int) t4.getB() + (int) t4.getC());
      
      System.out.println("Is t1 equilateral: " + t1.isEquilateral());
      
      System.out.println("Is t2 scalene: " + t2.isScalene());
      
      System.out.println("Is t4 isosceles: " + t4.isIsosceles());
      
      System.out.println("t3 validity: " + t3.isValid());
      t3.setC(5);
      System.out.println("t3 validity after side change: " + t3.isValid());
      
      System.out.println("Is t5 similar to t1: " + t5.isSimilar(t1)); // refer to lines 8 and 12
      System.out.println();
      
      // There are two constructor methods in Triangle.java -- one creates a 'default' Triangle
      // with previously set parameters, while the other takes requires three double values to create the object.
      
      System.out.println(t1);  // When this argument is passed, each side of the triangle will be printed on a new line.
                               // this is because of the toString() method in Triangle.java
      
      // Within Triangle.java, isScalene() works by passing the object to isEquilateral() and isIsosceles.
      // If BOTH of these methods return false, then isScalene() will return true. 
      
      // Within Triangle.java, isSimilar() works by retrieving the side lengths of whatever triangle it is given
      // in its parameters, and then checks various combinations of ratios between the sides of the two triangles 
      // to determine if they are proportional.
      
      // All six boolean expressions are necessary as they account for the fact that the order in which the sides 
      // are compared might differ but still result in a similar triangle.
      
   }
}