// Dr. Brannon
// APCSA
// 20221204
// Autograder for List Problem Set

import java.util.*;

public class ArrayListProblemSetAutograder {

   public static void main(String[] args) {
      System.out.println("Now grading your Unit 7 Problem Set...");
      
      
      // Problem 1
      int[] n1 = {2, 8, 3};
      ArrayList<Integer> sumPairs = ArrayListProblemSet.findSumPairs(n1);
      System.out.println(sumPairs);
      // [10, 5, 11]
      int[] n2 = {1, 4, 7, 9};
      sumPairs = ArrayListProblemSet.findSumPairs(n2);
      System.out.println(sumPairs);
      // [5, 8, 10, 11, 13, 16]
      
      // Problem 2
      ArrayList<String> w1 = new ArrayList<String>();
      w1.add("a"); w1.add("frog"); w1.add("is");
      System.out.println(ArrayListProblemSet.totalLetters(w1));
      // 7
      w1.add("an"); w1.add("amphibious"); w1.add("animal");
      System.out.println(ArrayListProblemSet.totalLetters(w1));
      // 25
      
      // Problem 3
      ArrayList<String> w2 = new ArrayList<String>();
      w2.add("a"); w2.add("frog"); w2.add("is");
      System.out.println(ArrayListProblemSet.lettersPerWord(w2));
      // [1, 4, 2]
      System.out.println(ArrayListProblemSet.lettersPerWord(w1));
      // [1, 4, 2, 2, 10, 6]
      
      // Problem 4
      System.out.println(ArrayListProblemSet.findFactors(60));
      // [1, 2, 3, 4, 5, 6, 10, 12, 15, 20, 30, 60]
      System.out.println(ArrayListProblemSet.findFactors(17));
      // [1, 17]
      
      // Problem 5
      System.out.println(ArrayListProblemSet.isPrime(60));
      // false
      System.out.println(ArrayListProblemSet.isPrime(17));
      // true
      
      // Problem 6
      int[] nums = {51, 9, 20, 37, 59, 11, 36, 21, 92, 25, 
                    27, 3, 73, 49, 86, 41, 61, 45, 41, 62, 
                    91, 47, 67, 32, 24, 92, 26, 31, 82, 5, 
                    21, 99, 69, 21, 41, 77, 43, 97, 94, 89, 
                    40, 85, 13, 95, 6, 63, 6, 46, 77, 71};
      System.out.println(ArrayListProblemSet.filterMultiples(nums, 5));
      // [20, 25, 45, 5, 40, 85, 95]
      System.out.println(ArrayListProblemSet.filterMultiples(nums, 7));
      //  [21, 49, 91, 21, 21, 77, 63, 77]
      // Problem 7
      System.out.println(ArrayListProblemSet.wordToList("APCSA"));
      // [A, P, C, S, A]
      System.out.println(ArrayListProblemSet.wordToList("Ranney School"));
      // [R, a, n, n, e, y,  , S, c, h, o, o, l]
      
      // Problem 8
      String[] dict = {"accident", "accompany", "bastion",  
                       "bastardize", "dull", "disk", 
                       "palace", "panda", "pasta", 
                       "relevance", "snail", "span", 
                       "station", "tank", "writer"};
      System.out.println(ArrayListProblemSet.wordFinder(dict, "pan"));
      // [accompany, panda, span]
      System.out.println(ArrayListProblemSet.wordFinder(dict, "sta"));
      // [bastardize, pasta, station]
      // Problem 9
      ArrayList<String> d1 = new ArrayList<String>();
      // d1 is delimiter sequence for (2 + 3) * (5+ (1 / 6))
      d1.add("("); d1.add(")"); d1.add("("); 
      d1.add("("); d1.add(")"); d1.add(")"); 
      System.out.println(ArrayListProblemSet.isBalanced("(", ")", d1));
      // true; matched opens and closes at end of traversal
      // d2 is delimter sequence for {1 {3}
      ArrayList<String> d2 = new ArrayList<String>();
      d2.add("{"); d2.add("{"); d2.add("}");
      System.out.println(ArrayListProblemSet.isBalanced("{", "}", d2));
      // false; unmatched opens and closes at end of traversal
      // d3 is delimter sequence for <a> >a<
      ArrayList<String> d3 = new ArrayList<String>();
      d3.add("<"); d3.add(">"); d3.add(">"); d3.add("<");
      System.out.println(ArrayListProblemSet.isBalanced("<", ">", d3));
      // false; 3rd delimiter closes unopened delimiter mid-traversal
   }

}