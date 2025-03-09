import java.util.HashMap;

public class PhoneMap {
  private HashMap<String, Phone> phoneMap;

  public PhoneMap() {
    phoneMap = new HashMap<String, Phone>();
  }

  public void addPhone(Phone phone) {
    String key = phone.getBrand() + phone.getModel();
    phoneMap.put(key, phone);
  }

  public Phone getPhone(String brand, String model) {
    String key = brand + model;
    return phoneMap.get(key);
  }

  public int getNumOfPhones() {
    return phoneMap.size();
  }

  public String toString() {
    String result = "";
    for (String key : phoneMap.keySet()) {
      Phone thisPhone = phoneMap.get(key);
      result = result + thisPhone.toString();
      result = result + "\n";
    }
    return result;
  }
  
  public Phone search(String brand, String model){
   String key = brand + model;
   return phoneMap.get(key);
  }
}
