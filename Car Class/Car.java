// Alexander Szeremeta
// 20241030
// APCSA
// Car Driver Class

public class Car {
   private int odometer;
   private double gasTank;
   private double mpg;
   private double gasTankCapacity;
   
   public Car(double gasTankCapacity, double mpg) {
      this.odometer = 0;
      this.gasTank = gasTankCapacity;
      this.gasTankCapacity = gasTankCapacity;
      this.mpg = mpg;
   }
   
   public void drive(int distance) {
      double fuelNeeded = distance / mpg;
      if (fuelNeeded <= gasTank) {
         odometer += distance;
         gasTank -= fuelNeeded;
         System.out.println("Drove " + distance + " miles.");
      } else {
         System.out.println("Not enough gas to drive " + distance + " miles.");
      }
   }
   
   public void refuel() {
      this.gasTank = this.gasTankCapacity; // Figure out how to set min and max values for instance var gasTank
   }
   
   public int getOdometer() {
      return this.odometer;
   }
   
   public double getTankCapacity() {
      return this.gasTankCapacity;
   }
   
   public double getMpg() {
      return this.mpg;
   }
   
   public double getGasTank() {
      return this.gasTank;
   }
   
   public String toString() {
      return String.format("{\n\tOdometer Reading (mi): %s\n\tFuel Remaining (gal): %s\n\tFuel Efficiency (mpg): %s\n}", odometer, gasTank, mpg);
   }
   
}