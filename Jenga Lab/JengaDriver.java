// Alexander Szeremeta
// 20250130
// APCSA
// Jenga Driver Class

import java.util.Scanner;

public class JengaDriver {

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      Jenga jenga = new Jenga(3);
      int turns = 0;
      boolean gameOn = true;
      while (gameOn) {
         jenga.print(); 
         System.out.print("Enter the row and column of the block to move (row col): ");
         int fromR = scanner.nextInt();
         int fromC = scanner.nextInt();
         System.out.print("Enter the column to move the block to on the top layer: ");
         int toC = scanner.nextInt();
         if (jenga.moveBlock(fromR, fromC, toC)) {
            turns++;
            if (!jenga.isStable()) {
               System.out.println("The tower is not stable! Game over.");
               gameOn = false;
            }
         } else {
         System.out.println("Invalid move. Try again.");
         }
      }
      System.out.println("Your score: " + turns);
      scanner.close();
   }
}