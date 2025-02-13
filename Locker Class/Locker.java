// Alexander Szeremeta
// 20241030
// APCSA
// Locker Server Class

import java.util.Random;

public class Locker {
   private String ownerName;
   private String combination;
   private int lockerNumber;
   private boolean isOpen;
   
   public Locker(String ownerName, String combination, int lockerNumber) {
      this.ownerName = ownerName;
      this.combination = combination;
      this.lockerNumber = lockerNumber;
      this.isOpen = true;
   }
   
   public void reKeyLock() {
      if (this.isOpen == true) {
      Random random = new Random();
      String newCombination = "";
      for (int i = 0; i < 3; i++) {
         int firstDigit = random.nextInt(10);
         int secondDigit = random.nextInt(10);
         newCombination += firstDigit + "" + secondDigit;
         if (i < 2) {
            newCombination += "-";
         }
      }
      this.combination = newCombination;
      System.out.println("Locker successfully re-keyed.");
      } else {
         System.out.println("The locker must be unlocked to re-key the lock.");
      }
   }
   
   public void reAssignLocker(String name) {
      this.ownerName = name;
      this.reKeyLock();
      System.out.println("Locker successfully re-keyed and reassigned to: " + name);
   }
   
   public void openLocker(String combinationEntered) {
      if (combinationEntered.equals(this.combination)) {
         this.isOpen = true;
         System.out.println("Combination accepted. Locker opened successfully.");
      } else {
         System.out.println("Sorry, the combination you entered is incorrect. Please try again.");
      }
   }
   
   public void closeLocker() {
      this.isOpen = false;
      System.out.println("Locker closed successfully.");
   }
   
   public String getLockerOwner() {
      return this.ownerName;
   }
   
   public String getCombination() {
      return this.combination;
   }
   
   public int getLockerNumber() {
      return this.lockerNumber;
   }
   
   public boolean getOpenState() {
      return this.isOpen;
   }
   
   public String toString() {
      return String.format("{\n\tLocker Owner: %s\n\tLocker Combination: %s\n\tLocker Number: %s\n\tOpen: %s\n}", ownerName, combination, lockerNumber, isOpen); 
   }

}