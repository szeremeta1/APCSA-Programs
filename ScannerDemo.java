// Alexander Szeremeta
// AP Computer Science A
// September 24, 2024
// Scanner in Action

import java.util.*;

public class ScannerDemo {
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      int num1, num2;
      System.out.print("Enter a number: ");
      num1 = console.nextInt();
      System.out.print("Enter a number: ");
      num2 = console.nextInt();
      System.out.println("The average is " + (num1 + num2) / 2.0);
   }
}