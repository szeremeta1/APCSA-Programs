// Alexander Szeremeta
// 20250110
// APCSA
// Tic Tac Toe Program

import java.util.Scanner;

public class TicTacToe {

   static String[][] board = new String[3][3];
   
   public static void printBoard() {
      for (int r = 0; r < 3; r++) {
         System.out.printf(" %s | %s | %s%n", board[r][0], 
                                              board[r][1], 
                                              board[r][2]);
         if (r < 2) {
            System.out.println("---+---+---");      
         } else {
            System.out.println();
         }
      }
   }
   
   // Need to add to userMove()
   // User should not be able to select a nonempty space
   public static boolean isEmpty(int r, int c) {
      return board[r][c].equals(" ");
   }
      
   public static void userMove() {
      Scanner kybd = new Scanner(System.in);
      System.out.print("What row? ");
      int row = kybd.nextInt();
      System.out.print("What column? ");
      int col = kybd.nextInt();
      board[row][col] = "X";
      System.out.println("After X plays...");
      printBoard();
   }
   
   // Add a O to a random empty space
   public static void computerMove() {
      int randomR = (int) (Math.random() * 3);
      int randomC = (int) (Math.random() * 3);
      while (!board[randomR][randomC].equals(" ")) {
         randomR = (int) (Math.random() * 3);
         randomC = (int) (Math.random() * 3);
      }
      board[randomR][randomC] = "O";
      System.out.println("After O plays...");
      printBoard();
   }
    
   public static boolean checkWin(String player) {
      for (int r = 0; r < 3; r++) {
         if (board[r][0].equals(player) && 
             board[r][1].equals(player) && 
             board[r][2].equals(player)) {
            return true;
         }
      }
      
      for (int c = 0; c < 3; c++) {
         if (board[0][c].equals(player) && 
             board[1][c].equals(player) && 
             board[2][c].equals(player)) {
            return true;
         }
      }
      
      if (board[0][0].equals(player) && 
          board[1][1].equals(player) && 
          board[2][2].equals(player)) {
         return true;
      }
      
      if (board[0][2].equals(player) && 
          board[1][1].equals(player) && 
          board[2][0].equals(player)) {
         return true;
      }
      
      return false;
   }
   
   public static void main(String[] args) {
      // Initialize the board
      // Row-major traversal fyi
      for (int r = 0; r < 3; r++) {
         for (int c = 0; c < 3; c++) {
            board[r][c] = " ";
         }
      }
      
      // 4 rounds with both players
      for (int i = 0; i < 4; i++) {
         userMove();
         if (checkWin("X")) {
            System.out.println("X wins!");
            return;
         }   
         
         // Computer turn
         computerMove();
         if (checkWin("O")) {
            System.out.println("O wins!");
            return;
         }
      }
      
      // Final turn if game not already won
      userMove();
      if (checkWin("X")) {
         System.out.println("X wins!");
      } else if (checkWin("O")) {
         System.out.println("O wins!");
      } else {
         System.out.println("Draw!");
      }
   }

}