// Alexander Szeremeta
// 20250114
// APCSA
// Unit 8 Problem Set

public class Unit8ProblemSet {
   public static int arraySum(int[][] arr) {
      int sum = 0;
      for (int[] row : arr) {
         for (int val : row) {
            sum += val;
         }
      }
      return sum;
   }
   
   public static int rowSum(int[][] arr, int row) { 
      int sum = 0;
      for (int val : arr[row]) {
         sum += val;
      }
      return sum;
   }
   
   public static int colSum(int[][] arr, int col) {
      int sum = 0;
      for (int[] row : arr) {
         sum += row[col];
      }
      return sum;
   }
   
   public static boolean search(int[][] arr, int value) {
      for (int[] row : arr) {
         for (int val : row) {
            if (val == value)
               return true;
         }
      }
      return false;
   }
   
   public static int count(int[][] arr, int value) {
      int count = 0;
      for (int[] row : arr) {
         for (int val : row) {
            if (val == value)
               count++;
         }
      }
      return count;
   }
   
   public static void main(String[] args) {
      int[][] arr1 = {{1,2,3},{1,1,1},{2,4,6}};
      System.out.println("Array Sum: " + arraySum(arr1));
      System.out.println("Row Sum: " + rowSum(arr1, 2));
      System.out.println("Column Sum: " + colSum(arr1, 1));
      System.out.println("Search for 4: " + search(arr1, 4));
      System.out.print("Count of 1: " + count(arr1, 1));
   }
}  