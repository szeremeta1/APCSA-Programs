public class Unit8ProblemSetAutograder {

   public static void main(String[] args) {
      int[][] arr1 = {{ 3, 10,  5, 5,   7},
                     { 0, -1, -3, 3,   9},
                     {-8, -3, 10, 3, -10},
                     { 8,  3, -7, 0,   4}};
      int[][] arr2 = {{53, 27, 99, 70, 12},
                      {27,  8, 39, 73, 41}, 
                      {76, 30, 70, 70, 30}};

      // arraySum()
      System.out.println(Unit8ProblemSet.arraySum(arr1));
      // 38
      System.out.println(Unit8ProblemSet.arraySum(arr2));
      // 725
      
      // rowSum()
      System.out.println(Unit8ProblemSet.rowSum(arr1, 0));
      // 30
      System.out.println(Unit8ProblemSet.rowSum(arr2, arr2.length - 1));
      // 276
      
      // colSum()
      System.out.println(Unit8ProblemSet.colSum(arr1, 0));
      // 3
      System.out.println(Unit8ProblemSet.colSum(arr2, arr2[0].length - 1));
      // 83
      
      // search()
      System.out.println(Unit8ProblemSet.search(arr1, 0));
      // true
      System.out.println(Unit8ProblemSet.search(arr1, 999));
      // false
      System.out.println(Unit8ProblemSet.search(arr2, 30));
      // true
      System.out.println(Unit8ProblemSet.search(arr2, 24));
      // false
      
      // count()
      System.out.println(Unit8ProblemSet.count(arr1, 0));
      // 2
      System.out.println(Unit8ProblemSet.count(arr1, 11));
      // 0
      System.out.println(Unit8ProblemSet.count(arr2, 70));
      // 3
      System.out.println(Unit8ProblemSet.count(arr2, 11));
      // 0
   }

}