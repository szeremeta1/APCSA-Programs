// Alexander Szeremeta
// 20241120
// APCSA
// List Demo

import java.util.ArrayList;

public class ListDemo1 {
   public static void main(String[] args) {
      ArrayList<String> authors = new ArrayList<String>();
      authors.add("Isaac Asimov");
      authors.add("Carl Sagan");
      authors.add("Albert Einstein");
      authors.add("Neil deGrasse Tyson");
      authors.remove(2);
      authors.add(2, "Arthur C. Clarke");
      authors.set(3, "Ray Bradbury");
      String name = authors.get(1);
      System.out.println(name);
      System.out.println(authors);
   }
}