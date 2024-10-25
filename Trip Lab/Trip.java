// Samuel J. Brannon, Ph.D.
// APCSA
// 20221014
// Server class for Trip objects in E-ZPass Lab

public class Trip {

   private Record onRecord;
   private Record offRecord;

   // Determines whether r1 or r2 is first
   // Assigns onRecord and offRecord accordingly
   public Trip(Record r1, Record r2) {
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
      if (r1TotalSeconds <= r2TotalSeconds) {
        onRecord = r1;
        offRecord = r2;
      } else {
        onRecord = r2;
        offRecord = r1;
      }
   }

   public Record getOnRecord() {
      return onRecord;
   }

   public Record getOffRecord() {
      return offRecord;
   }

   // Uses exit numbers: travel going east (true) or west (false)
   public boolean goingEast() {
      return offRecord.getExit() < onRecord.getExit();
   }

   // Uses exit numbers
   public double getDistance() {
      // To be corrected in lab
      return Math.abs(offRecord.getExit() - onRecord.getExit());
   }

   // Uses timestamps to calculate time between on/off in seconds
   public double getTripTime() {
      String r1Time = onRecord.getTimeStamp();
      String r2Time = offRecord.getTimeStamp();
      int r1Hour = Integer.parseInt(r1Time.substring(8, 10));
      int r1Minute = Integer.parseInt(r1Time.substring(10, 12));
      int r1Second = Integer.parseInt(r1Time.substring(12, 14));
      int r2Hour = Integer.parseInt(r2Time.substring(8, 10));
      int r2Minute = Integer.parseInt(r2Time.substring(10, 12));
      int r2Second = Integer.parseInt(r2Time.substring(12, 14));
      int r1TotalSeconds = r1Hour * 3600 + r1Minute * 60 + r1Second;
      int r2TotalSeconds = r2Hour * 3600 + r2Minute * 60 + r2Second;
      int secondsPassed = r2TotalSeconds - r1TotalSeconds;
      return secondsPassed;
   }

   // Returns speed in MPH
   public double getSpeed() {
      // To be corrected in lab
      // Find distance between onRecord and offRecord
      // Find time between onRecord and offRecord
      double distance = getDistance();
      double timeInSeconds = getTripTime();
      double timeInHours = timeInSeconds / 3600.0;
      return distance / timeInHours;
   }

   // Returns toll based on distance between onRecord and offRecord
   // $0.04 per mile, rounded to nearest penny
   public double getToll() {
      // To be corrected in lab
      double tollCost = 0.04;
      double distance = getDistance();
      double toll = distance * tollCost;
      return toll;
   }
}
