// Samuel J. Brannon, Ph.D.
// APCSA
// 20221014
// Server class for Record objects in E-ZPass Lab

public class Record {

   private int exit; // Valid exit number in New Detroit
   private String timeStamp; // Format "yyyymmddhhmmss"
   private String plate; // Format "aaa-####" (3 lowercase letters, dash, and 4 numbers)

   public Record(int exit, String timeStamp, String plate) {
      this.exit = exit;
      this.timeStamp = timeStamp;
      this.plate = plate;
   }

   public int getExit() {
      return exit;
   }

   public String getTimeStamp() {
      return timeStamp;
   }

   public String getPlate() {
      return plate;
   }
   
   public String toString() {
      return Integer.toString(exit);
   }
}