import java.util.ArrayList;
import java.util.Collections;

public class PhoneList {
  private ArrayList<Phone> phones;

  public PhoneList() {
    phones = new ArrayList<Phone>();
  }

  public Phone findByName(String brand, String model) {
    for (int i = 0; i < phones.size(); i++) {
      Phone thisPhone = phones.get(i);
      if (thisPhone.getBrand().equals(brand) && thisPhone.getModel().equals(model)) {
        return thisPhone;
      }
    }
    return null;
  }

  public PhoneList findByMinPrice(int price) {
    PhoneList list = new PhoneList();
    for (Phone thisPhone : phones) { 
      if (thisPhone.getApprox_price_EUR() > price) {
        list.addPhoneData(thisPhone);
      }
    }
    return list;
  }

  // Method

  public PhoneList findPhonesInPriceRange(int lowerPriceBound, int upperPriceBound) {
    PhoneList phoneInRange = new PhoneList();
    for (Phone phone : phones) {
        if (phone.getApprox_price_EUR() >= lowerPriceBound && phone.getApprox_price_EUR() <= upperPriceBound) {
            phoneInRange.addPhoneData(phone);
        }
    }
    return phoneInRange;
  }

  public void addPhoneData(Phone phone) {
    phones.add(phone);
  }

  public int getPhoneSize() {
    return phones.size();
  }

  public void sort() {
    Collections.sort(phones);
  }

  public String toString() {
    String result = "";
    for (int index = 0; index < phones.size(); index++) {
      Phone phone = phones.get(index);
      result = result + phone.toString();
      result = result + "\n";
    }
    return result;
  }
}