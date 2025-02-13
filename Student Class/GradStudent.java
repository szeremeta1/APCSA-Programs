// Alexander Szeremeta
// 20250211
// APCSA
// GradStudent Class (Inheritance Practice)

public class GradStudent extends Student {
   private String dissertationTopic;
   
   public GradStudent(int idNum, String name, String dissTop) {
      super(idNum, name);
      this.dissertationTopic = dissTop;
   }
   
   public void setDissertationTopic(String dissTop) {
      this.dissertationTopic = dissTop;
   }
   
   public String getDissertationTopic() {
      return this.dissertationTopic;
   }
   
   public void printWelcome() {
      System.out.println("Welcome, " + this.getName() + "!" + 
                         " Good luck on your dissertation on " + this.getDissertationTopic());
   }
}