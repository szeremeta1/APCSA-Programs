// Alexander Szeremeta
// 20241118
// APCSA
// Array Problem Set

import java.util.Random;

public class ArrayProblemSet {
   public static double max(double[] numbers) {
      double max = numbers[0];
      for (double number : numbers) {
         if(number > max)
            max = number;
      }
      return max;
   }
   
   public static int maxIndex(double[] numbers) {
      int maxIndex = 0;
      for (int i = 1; i < numbers.length; i++) {
         if (numbers[i] > numbers[maxIndex]) {
            maxIndex = i;
         }
      }
      return maxIndex;
   }
   
   public static double min(double[] numbers) {
      double min = numbers[numbers.length - 1];
      int i = numbers.length - 2;
      while (i >= 0) {
         if (numbers[i] < min)
            min = numbers[i];
         i--;
      }
      return min;
   }
   
   public static int minIndex(double[] numbers) {
      int minIndex = 0;
      for (int i = 1; i < numbers.length; i++) {
         if (numbers[i] < numbers[minIndex]) {
            minIndex = i;
         }
      }
      return minIndex;
   }
   
   public static boolean findWord(String[] dictionary, String word) {
      for (String term : dictionary) {
         if(term.equals(word))
            return true;
      }
      return false;
   }
   
   public static int indexOfWord(String[] dictionary, String word) {
      for (int i = 0; i < dictionary.length; i++) {
         String term = dictionary[i];
         if (term.equals(word))
            return i;
      }
      return -1;
   }
   
   public static int countOccurrences(String[] arr, String str) {
      int count = 0;
      for (String element : arr) {
         if (element.equals(str))
            count++;
      }
      return count;
   }
   
   public static int[] booleanSort(boolean[] vals) {
      int countTrue = 0;
      for (boolean val : vals) {
         if (val)
            countTrue++;
      }
      int countFalse = vals.length - countTrue;
      return new int[] {countTrue, countFalse};
   }
   
   public static int[] randIntArray(int length, int minValue, int maxValue) {
      int[] result = new int[length];
      for (int i = 0; i < length; i++) {
         int rand = (int) (Math.random() * maxValue - minValue + 1) + minValue;
         result[i] = rand;
      }    
      return result;
   }

}