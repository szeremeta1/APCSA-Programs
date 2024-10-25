// Alexander Szeremeta
// 20241018
// APCSA
// Person Server Class

public class Person {
   private String fName;
   private String lName;
   private String email;
   private String phone;
   
   public Person(String fN, String lN, String email, String phone) {
      this.fName = fN;
      this.lName = lN;
      this.email = email;
      this.phone = phone;
   }
   
   public Person (String fN, String lN) {
      this.fName = fN;
      this.lName = lN;
      this.email = "none";
      this.phone = "555-555-5555";
   
   }

   public Person() {
      this.fName = "John";
      this.lName = "Doe";
      this.email = "none";
      this.phone = "555-555-5555";
   
   }
   
   public String getFName() {
      return fName;
   }
   
   public String getLName() {
      return lName;
   }
   
   public String getFullName() {
      return lName + "," + fName;
   }
   
   public String getEmail() {
      return email;
   }
   
   public String getPhoneNumber() {
      return phone;
   }
   
   public String getAreaCode() {
      return phone.substring(0, 3);
   }
   
   public void setFName(String name) {
      this.fName = name;
   }
   
   public void setLName(String name) {
      this.lName = name;
   }
   
   public void setFullName(String name) {
      int lNameIndex = name.indexOf(", ");
      this.lName = name.substring(0, lNameIndex);
      this.fName = name.substring(lNameIndex + 1);
   }
   
   public void setEmail(String newEmail) {
      this.email = newEmail;
   }
   
   public void setPhoneNumber(String newNumber) {
      this.phone = newNumber;
   }
   
   public String toString() {
      return String.format("{\n\tFirst Name: %s\n\tLast Name: %s\n\tEmail: %s\n\tPhone Number: %s\n}", fName, lName, email, phone);
   }

}