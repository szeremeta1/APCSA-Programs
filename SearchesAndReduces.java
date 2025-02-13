// Alexander Szeremeta
// 20241114
// APCSA
// Searches and Reduces

public class SearchesAndReduces {
   public static int whereIsIt(double[] a, double target) {
      for (int i = 0; i < a.length; i++) {
         if (a[i] == target)
            return i;
      }
      return - 1;
   }
   
   public static double sum(double[] b) {
      double total = 0.0;
      for (double value : b)
         total += value;
      return total;
   }
   
   public static void main(String[] args) {
      double[] first = {3.5, 1.6, 7.6};
      double[] second = {5.3, 6.1, 6.7};
      System.out.println(whereIsIt(first, 7.6));
      System.out.println(whereIsIt(second, 1.6));
      System.out.println();
      System.out.println(sum(second));
   }  
}