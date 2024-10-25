// Alexander Szeremeta
// 20241024
// APCSA
// Cookie Jar Driver Class

public class CookieJarDriver {
   public static void main(String[] args) {
      CookieJar j1 = new CookieJar("m", "Chocolate Chip");
      System.out.println(j1);
      System.out.println();
      
      // Removes 5 cookies, then adds 3
      j1.removeCookies(5);
      System.out.println(j1);
      j1.addCookies(3);
      System.out.println(j1);
      System.out.println();
      
      System.out.println("Is the jar empty: " + j1.isEmpty());
      System.out.println("Jar Capacity: " + j1.getCapacity());
      System.out.println("Cookies Remaining: " + j1.getAmount());
   }
}