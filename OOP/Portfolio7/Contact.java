class Contact{
  
  private String firstName;
  private String lastName;
  private String emailAddress;
  private String phoneNumber;
  
  public Contact(String firstn, String lastn){
   firstName = firstn;
   lastName = lastn;
  }
  
  public void setEmail(String mail){
   emailAddress = mail; 
  }
  
  public void setNumber(String num){
   phoneNumber = num; 
  }
  
  public String toString(){
   return "First Name: " + firstName + "\nLast Name: " + lastName + "\nEmail Address: " + emailAddress + "\nPhone Number: " + phoneNumber;
  }
  
}
