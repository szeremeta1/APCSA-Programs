// Alexander Szeremeta
// 20241114
// APCSA
// Reduce Example 1

public class ReduceExample1 {
   public static String longestWord(String[] words) {
      String longestWord = "";
      for (String word : words) {
         if (word.length() > longestWord.length())
            longestWord = word;
      }
      return longestWord; 
   }
   
   public static double avgStrLength(String[] arr) {
      double totalChars = 0.0;
      for (String str : arr) {
         totalChars += str.length();
      }
      return totalChars / arr.length;
   }
   
   public static void main(String[] args) {
      String[] roster = {"Ayan", "Evan", "Felipe", "Owen", "Phillip", "Teresa", "Tessa", "Thomas"};
      System.out.println("The person with the longest name is " + longestWord(roster));
      System.out.println("The average name length is " + avgStrLength(roster));
   }
}