// Alexander Szeremeta
// 20241022
// APCSA
// Cat Driver Class

public class Cat {
   private String name;
   private int fullness;
   public Cat(String name) {
      this.name = name;
      this.fullness = 5;
   }
   public boolean isHungry() {
      return fullness == 0;
   }
   public String speak() {
      return "Meow";
   }
   public void feed() {
      fullness = 5;
   }
   public void digest() {
      fullness--;
   }
}