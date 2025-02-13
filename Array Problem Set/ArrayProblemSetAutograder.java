import java.util.Arrays;

public class ArrayProblemSetAutograder {

   public static void main(String[] args) {
      System.out.println("Now grading your Unit 6 Problem Set...");
      
      
      double[] vals = new double[50];
      for (int i = 0; i < vals.length; i++) {
         vals[i] = Math.random() * 100 - 50;
      }
      System.out.println(Arrays.toString(vals));
      vals[13] = 51.17463295753545;
      vals[21] = -50.326076254760985;
      
      double q1 = ArrayProblemSet.max(vals);
      System.out.println("Question 1: " + q1);
      //--> 51.17463295753545
      
      int q2 = ArrayProblemSet.maxIndex(vals);
      System.out.println("Question 2: " + q2);
      //--> 13
      
      double q3 = ArrayProblemSet.min(vals);
      System.out.println("Question 3: " + q3);
      //--> -50.326076254760985
      
      int q4 = ArrayProblemSet.minIndex(vals);
      System.out.println("Question 4: " + q4);
      //--> 21
      
      String[] dict = {"a", "ability", "able", "about", "above", "accept", "according"};
      boolean q5a = ArrayProblemSet.findWord(dict, "able");
      System.out.println("Question 5a: " + q5a);
      //--> true
      
      
      boolean q5b = ArrayProblemSet.findWord(dict, "abel");
      System.out.println("Question 5b: " + q5b);
      //--> false
      
      
      int q6a = ArrayProblemSet.indexOfWord(dict, "accept");
      System.out.println("Question 6a: " + q6a);
      //--> 5
      int q6b = ArrayProblemSet.indexOfWord(dict, "accetp");
      System.out.println("Question 6b: " + q6b);
      //--> -1
      
      
      
      String[] names = {"Hippolytos", "Arcadius", "Achilleus", "Pyrrhos",
                        "Arcadius", "Nicanor", "Linus", "Theodora", 
                        "Pancratius", "Sophron", "Hermogenes", "Achilleus",
                        "Cleopatra", "Zenais", "Cleopatra", "Theodora",
                        "Athanasia", "Nicanor", "Euclides", "Nicanor",
                        "Sophron", "Arcadius", "Linus", "Theodora",
                        "Pancratius", "Pyrrhos", "Arcadius", "Demetrius"};
      int q7a = ArrayProblemSet.countOccurrences(names, "Nicanor");
      int q7b = ArrayProblemSet.countOccurrences(names, "Narcissa");
      System.out.println("Question 7a: " + q7a);
      //--> 3
      System.out.println("Question 7b: " + q7b);
      //--> 0
      
      
      
      boolean[] sample = new boolean[100];
      for (int i = 0; i < sample.length; i++) {
         sample[i] = Math.random() < 0.5;
      }
      //System.out.println(Arrays.toString(sample));
      int[] q8 = ArrayProblemSet.booleanSort(sample);
      System.out.println("Question 8: " + Arrays.toString(q8));
      //--> An array of 2 ints, both approx. 50
      // Run a few times to make sure
      
      
      
      int[] q9 = ArrayProblemSet.randIntArray(20, 1, 10);
      System.out.println("Question 9: " + Arrays.toString(q9));
      //--> An array of 20 ints between 1 and 10
      // Run enough times to confirm both 1 and 10 are present
      // Verify nothing lower than 1 and higher than 10
   }
}
