// Alexander Szeremeta
// 20241122
// APCSA
// List Demo 2

import java.util.ArrayList;

public class ListDemo2 {
   public static void main(String[] args) {
      ArrayList<Integer> values = new ArrayList<Integer>();
      for (int i = 0; i < 10; i++) {
         int newValue = (int) (Math.random() * 11);
         values.add(newValue);
      }
      System.out.println("Array Values p1: " + values);
      
      int drawnNumber = values.remove(5);
      int oldValue = values.set(2, 7);
      
      System.out.println("Drawn Number: " + drawnNumber);
      System.out.println("Old Number: " + oldValue);
      System.out.println("Array Values p2: " + values);
   }
}