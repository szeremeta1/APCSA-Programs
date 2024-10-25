// Alexander Szeremeta
// 20241018
// APCSA
// Person Client

public class PersonClient {
   public static void main(String[] args) {
      
      // Creates fully-customized person p1 and prints values
      Person p1 = new Person("Alex", "Szeremeta", "alexander@szeremeta.org", "732-369-9795");
      System.out.println("First Name: " + p1.getFName());
      System.out.println("Last Name: " + p1.getLName());
      System.out.println("Email: " + p1.getEmail());
      System.out.println("Phone: " + p1.getPhoneNumber());
      System.out.println();
      
      // Creates and prints info of default person p2
      Person p2 = new Person();
      System.out.println("First Name: " + p2.getFName());
      System.out.println("Last Name: " + p2.getLName());
      System.out.println("Email: " + p2.getEmail());
      System.out.println("Phone: " + p2.getPhoneNumber());
      System.out.println();
      
      // Gives p2 new values
      p2.setFName("Jack");
      p2.setLName("Crawford");
      p2.setEmail("jcrawford@fbi.gov");
      p2.setPhoneNumber("202-324-3000");
      
      // prints p2 vars again after modification
      System.out.println("First Name: " + p2.getFName());
      System.out.println("Last Name: " + p2.getLName());
      System.out.println("Email: " + p2.getEmail());
      System.out.println("Phone: " + p2.getPhoneNumber());
      System.out.println();
      
      // sets full name of p2 and prints it while showing other details are unchanged
      p2.setFullName("Lecter, Hannibal");
      System.out.println();
      System.out.println("New Full Name: " + p2.getFullName());
      System.out.println("First Name: " + p2.getFName());
      System.out.println("Last Name: " + p2.getLName());
      System.out.println("Email: " + p2.getEmail());
      System.out.println("Phone: " + p2.getPhoneNumber());
      System.out.println();
      
      // gets area code for both persons
      System.out.println("p1 Area Code: " + p1.getAreaCode());
      System.out.println("p2 Area Code: " + p2.getAreaCode());
      System.out.println();
      
      // tests the toString method
      System.out.println(p1);
      System.out.println();
      System.out.println(p2);
   }
}