// Alexander Szeremeta
// 20250211
// APCSA
// Student Class (Inheritance Practice)

public class Student {
   private int idNum;
   private String name;
   
   public Student(int idNum, String name) {
      this.idNum = idNum;
      this.name = name;
   }
   
   public void setIdNum(int idNum) {
      this.idNum = idNum;
   }
   
   public void setName(String name) {
      this.name = name;
   }
   
   public int getIdNum() {
      return this.idNum;
   }
   
   public String getName() {
      return this.name;
   }
   
   public void printWelcome() {
      System.out.println("Welcome, " + this.name);
   }
}