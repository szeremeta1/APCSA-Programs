// Alexander Szeremeta
// 20241030
// APCSA
// Car Client Class

public class CarClient {
   public static void main(String[] args) {
      // Creates new car object bmw750Li
      Car bmw750Li = new Car(20.6, 18.9);
      System.out.println(bmw750Li);
      System.out.println();
      
      // Drives 100 miles and gets odometer, mpg, and fuel remaining
      bmw750Li.drive(100);
      System.out.println("Odo Reading: " + bmw750Li.getOdometer());
      System.out.println("MPG: " + bmw750Li.getMpg());
      System.out.println("Fuel Remaining: " + bmw750Li.getGasTank());
      System.out.println();
      
      // Attempts to drive 600 miles, then drives only 200.
      bmw750Li.drive(600);
      bmw750Li.drive(200);
      System.out.println();
      System.out.println(bmw750Li);
   }
}