// Alexander Szeremeta
// 20241030
// APCSA
// Locker Client Class

public class LockerClient {
   public static void main(String[] args) {
      // Creates new locker l1 and prints
      Locker l1 = new Locker("Du Marier, Bedelia", "12-34-56", 01);
      System.out.println(l1);
      
      // Rekeys locker and prints
      l1.reKeyLock();
      System.out.println();
      System.out.println(l1);
      System.out.println();
      
      // Reassigns locker and prints
      l1.reAssignLocker("Bloom, Alana");
      System.out.println();
      System.out.println(l1);
      System.out.println();
      
      // Creates new locker, re-keys, gets indiv. instance vars
      Locker l2 = new Locker("Katz, Beverly", "00-00-00", 02);
      l2.reKeyLock();
      System.out.println("Locker Owner: " + l2.getLockerOwner());
      System.out.println("Locker Combination: " + l2.getCombination());
      System.out.println("Locker Number: " + l2.getLockerNumber());
      System.out.println("Door Open State: " + l2.getOpenState());
      System.out.println();
      
      // Locks l2, attempts to open with wrong combination, then uses correct combination
      l2.closeLocker();
      System.out.println(l2.getOpenState());
      l2.openLocker("12-34-56");
      System.out.println(l2.getOpenState());
      l2.openLocker(l2.getCombination());
      System.out.println(l2.getOpenState());
      System.out.println();
      
      // Creates new locker l3, re-keys it, locks it, then attemps to re-key while locked
      Locker l3 = new Locker("Lounds, Freddie", "00-00-00",  03);
      System.out.println(l3);
      l3.reKeyLock();
      System.out.println("New Combination: " + l3.getCombination());
      l3.closeLocker();
      l3.reKeyLock();
   }
}