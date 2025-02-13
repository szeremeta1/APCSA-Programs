// Alexander Szeremeta
// 20250211
// APCSA
// Student Driver Class (Inheritance Practice)

public class StudentDriver {
   public static void main(String[] args) {
      Student s1 = new Student(0001, "Elizabeth");
      Student s2 = new Student(0002, "Tom");
      GradStudent s3 = new GradStudent(0003, "Harold", "topic1");
      GradStudent s4 = new GradStudent(0004, "Donald", "topic2");
      
      // Tests printWelcome
      s1.printWelcome();
      s2.printWelcome();
      s3.printWelcome();
      s4.printWelcome();
      System.out.println();
      
      // sets name then tries printWelcome again
      s2.setName("Alan");
      s2.printWelcome();
      System.out.println();
      
      // sets IdNum and name then prints and tries printWelcome again
      s3.setName("Raymond");
      s3.setIdNum(3333);
      System.out.println(s3.getIdNum());
      System.out.println(s3.getName());
      s3.printWelcome();
      System.out.println();
      
      // sets IdNum, name and dissertationTopic then tries printWelcome again
      // before printing dissertationTopic itself
      s4.setName("Glen");
      s4.setIdNum(4444);
      s4.setDissertationTopic("bowling");
      System.out.println(s4.getIdNum());
      s4.printWelcome();
      System.out.println(s4.getDissertationTopic());
      System.out.println();
   }
}