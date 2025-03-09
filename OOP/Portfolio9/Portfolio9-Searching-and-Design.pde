import java.util.Scanner;

private String filename;
private PhoneList allPhoneData;
private PhoneMap allPhoneData2; // HashMap
private Scanner in;

void setup() {
  filename = sketchPath() + "/phoneData.csv";
  allPhoneData = new PhoneList();
  allPhoneData2 = new PhoneMap();
  in = InputReader.getScanner(filename);
  readData();
}

void readData() {
  String header = in.nextLine();
  //println(header);
  while (in.hasNext()) {
    String csv = in.nextLine();
    String[] data = csv.split(",");
    Phone phone = new Phone(data[0]);
    phone.setModel(data[1]);
    phone.setAnnounced(data[8]);
    float phoneWeight = Float.parseFloat(data[11]);
    phone.setWeight_g(phoneWeight);
    phone.setInternal_memory(data[21]);
    int phonePrice = Integer.parseInt(data[36]);
    phone.setApprox_price_EUR(phonePrice);
    allPhoneData.addPhoneData(phone);
    allPhoneData2.addPhone(phone);
  }
  allPhoneData.sort();
  println("-----------------------");
  println("Total number of phones is " + allPhoneData.getPhoneSize());
  println("\nThe details of all the phones in the Arraylist: ");
  println("\n" + allPhoneData.toString());
  
 
  Phone iphone = allPhoneData.findByName("Apple", "iPhone 7 Plus");
  println("\nThe details of the iPhone: ");
  print(iphone + "\n");
  
  PhoneList phonelist = allPhoneData.findByMinPrice(600);
  println("\nPhones in descending order over 600 euros");
  println(phonelist + "\n");
  
  // HashMap
  
  println("-----------------------");
  println("Total number of phones is " + allPhoneData.getPhoneSize());
  println("\nThe details of all the phones in the HashMap: ");
  println("\n" + allPhoneData2.toString());
  
 
  Phone iphone2 = allPhoneData2.search("Apple", "iPhone 7 Plus");
  println("\nThe details of the iPhone: ");
  print(iphone2);
  
  PhoneList phonelist2 = allPhoneData.findByMinPrice(600);
  println("\nPhones in descending order over 600 euros");
  println(phonelist2);
  
}

/*
the brand name (index 0). This is needed to construct a Phone object.
 the model name (index 1)
 the announced date (index 8)
 the weight in grams (index 11)
 the internal memory (index 21)
 the approximate price in Euros (index 36)
 */
