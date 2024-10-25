// Alexander Szeremeta
// 20241024
// APCSA
// Cookie Jar Server Class

public class CookieJar {
   private int amountInJar;
   private String cookieType;
   private String size;

   public CookieJar(String size, String type) {
      this.size = size;
      this.cookieType = type;
      if (size == "s") {
         this.amountInJar = 10;
      } else if (size == "m") {
         this.amountInJar = 20;
      } else {
         this.amountInJar = 30;
      }
   }
   
   public void removeCookies(int amtToRemove) {
      amountInJar = amountInJar - amtToRemove;
   }
   
   public void addCookies(int amtToAdd) {
      if (amtToAdd + amountInJar > getCapacity()) {
         amountInJar = getCapacity();
      } else {
         amountInJar = amountInJar + amtToAdd;
      }
   }
   
   public int getCapacity() {
      if (size == "s") {
         return 10;
      } else if (size == "m") {
         return 20;
      } else {
         return 30;
      }
   }
   
   public int getAmount() {
      return amountInJar;
   }
   
   public boolean isEmpty() {
      if (amountInJar == 0) {
         return true;
      } else {
         return false;
      }
   }
   
   public String toString() {
      return String.format("{\n\tAmount In Jar: %s\n\tCooke Type: %s\n\tCookie Size: %s\n}", amountInJar, cookieType, size);
   }
}