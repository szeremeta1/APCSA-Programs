// Alexander Szeremeta
// 20241126
// APCSA
// ArrayListProblemSet
import java.util.ArrayList;

public class ArrayListProblemSet {
   public static ArrayList<Integer> findSumPairs(int[] numbers) {
      ArrayList<Integer> sums = new ArrayList<Integer>();
      for (int i = 0; i < numbers.length; i++) {
         for (int j = i + 1; j < numbers.length; j++) {
            sums.add(numbers[i] + numbers[j]);
         }
      }
      return sums;
   }
   
   public static int totalLetters(ArrayList<String> words) {
      int total = 0;
      for (String word : words) {
         total += word.length();
      }
      return total;
   }
   
   public static ArrayList<Integer> lettersPerWord(ArrayList<String> words) {
      ArrayList<Integer> lengths = new ArrayList<Integer>();
      for (String word : words) {
         lengths.add(word.length());
      }
      return lengths;
   }
   
   public static ArrayList<Integer> findFactors(int n) {
      ArrayList<Integer> factors = new ArrayList<Integer>();
      for (int i = 1; i <= n; i++) {
         if (n % i == 0) 
            factors.add(i); 
      }
      return factors;
   }
   
   public static boolean isPrime(int n) {
      return findFactors(n).size() == 2;
   }
   
   public static ArrayList<Integer> filterMultiples(int[] numbers, int factor) {
      ArrayList<Integer> multiples = new ArrayList<Integer>();
      for (int number : numbers) {
         if (number % factor == 0)
         multiples.add(number);
      }
      return multiples;
   }
   
   public static ArrayList<String> wordToList(String word) {
      ArrayList<String> letters = new ArrayList<String>();
      for (int i = 0; i < word.length(); i++) {
         letters.add(String.valueOf(word.charAt(i)));
      }
      return letters;
   }
   
   public static ArrayList<String> wordFinder(String[] dictionary, String word) {
      ArrayList<String> foundWords = new ArrayList<String>();
      for (String dictWord : dictionary) {
         if (dictWord.contains(word))
            foundWords.add(dictWord);
      }
      return foundWords;
   }
   
   public static boolean isBalanced(String openDelimiter, String closeDelimiter, ArrayList<String> delimiters) {
      int balanceCount = 0;
      for (String delimiter : delimiters) {
         if (delimiter.equals(openDelimiter)) {
            balanceCount++;
         } else if (delimiter.equals(closeDelimiter)) {
            balanceCount--;
         }
         if (balanceCount < 0)
            return false;
      }
      return balanceCount == 0;
   }
}