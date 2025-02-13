// Alexander Szeremeta
// APCSA
// 20241013
// EZ-Pass Lab

public class EZPass1 {
   public static void main(String[] args) {
      // Exercise A
      Record r1 = new Record(157, "20111223085557", "JPL-1945"); // Question 1
      Record r2 = new Record(169, "20111223090702", "JPL-1945"); // Question 2
      
      // Question 3
      System.out.println("Record r1: Exit " + r1.getExit() + " Timestamp: " + r1.getTimeStamp() + " License Plate: " + r1.getPlate());
      System.out.println("Record r2: Exit " + r2.getExit() + " Timestamp: " + r2.getTimeStamp() + " License Plate: " + r2.getPlate());
      
      // Question 4
      System.out.println("Distance between two exits: " + (r2.getExit() - r1.getExit()));
      
      // Question 5
      String r1Time = r1.getTimeStamp();
      String r2Time = r2.getTimeStamp();
      int r1Hour = Integer.parseInt(r1Time.substring(8, 10));
      int r1Minute = Integer.parseInt(r1Time.substring(10, 12));
      int r1Second = Integer.parseInt(r1Time.substring(12, 14));
      int r2Hour = Integer.parseInt(r2Time.substring(8, 10));
      int r2Minute = Integer.parseInt(r2Time.substring(10, 12));
      int r2Second = Integer.parseInt(r2Time.substring(12, 14));
      int r1TotalSeconds = r1Hour * 3600 + r1Minute * 60 + r1Second;
      int r2TotalSeconds = r2Hour * 3600 + r2Minute * 60 + r2Second;
      int secondsPassed = r2TotalSeconds - r1TotalSeconds;
      System.out.println("Time elapsed between exits: " + secondsPassed + " seconds");
      
      // Question 6
      int milesBetween = r2.getExit() - r1.getExit();
      double hoursPassed = secondsPassed / 3600.0;
      double milesPerHour = milesBetween / hoursPassed;
      System.out.println("Approx. Speed: " + milesPerHour + "mph");
   
      // Exercise B
      System.out.println();
      Trip t = new Trip(r1, r2);
      System.out.println("On exit: " + t.getOnRecord());
      System.out.println("Off exit: " + t.getOffRecord());
      System.out.println("Going east: " + t.goingEast());
      System.out.println("Distance: " + t.getDistance());
      System.out.println("Trip time: " + t.getTripTime());
      System.out.println("Speed: " + t.getSpeed());
      System.out.println("Toll Cost: " + t.getToll());
      System.out.println();
      
      Record r3 = new Record(157, "20241013010023", "LMB-3211");
      Record r4 = new Record(189, "20241013014655", "LMB-3211");
      Trip nightDrive = new Trip(r3, r4);
      System.out.println("On exit: " + nightDrive.getOnRecord());
      System.out.println("Off exit: " + nightDrive.getOffRecord());
      System.out.println("Going east: " + nightDrive.goingEast());
      System.out.println("Distance: " + nightDrive.getDistance());
      System.out.println("Trip time: " + nightDrive.getTripTime());
      System.out.println("Speed: " + nightDrive.getSpeed());
      System.out.print("Toll Cost: " + nightDrive.getToll());

   }



}