// Alexander Szeremeta
// 20241022
// APCSA
// Cat Client Class

public class CatDriver {
   
   public static void main(String[] args) {
      
      Cat c = new Cat("Smokie");
      while (true) {
         c.digest();
         if (c.isHungry()) {
            System.out.println(c.speak());
            c.feed();
         }
      }
   }
}