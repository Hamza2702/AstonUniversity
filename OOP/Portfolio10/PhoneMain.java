import java.util.Scanner;
import java.io.File;

public class PhoneMain {
    
    private String filename;
    private PhoneList allPhoneData;
    private PhoneMap allPhoneData2; // HashMap
    private Scanner in;

    public static void main(String[] args) {
        // Run
        PhoneMain phoneMain = new PhoneMain();
        phoneMain.filename = "phoneData.csv";
        phoneMain.allPhoneData = new PhoneList();
        phoneMain.allPhoneData2 = new PhoneMap();
        phoneMain.in = InputReader.getScanner(phoneMain.filename);
        
        phoneMain.readData();

        // Create a new Scanner to read from System.in
        Scanner input = new Scanner(System.in);

        // Lower price bound from the user
        System.out.print("Enter a lower price bound: ");
        int lowerPrice = input.nextInt();

        // Upper price bound from the user
        System.out.print("Enter an upper price bound: ");
        int upperPrice = input.nextInt();

        // Sort the phones
        PhoneList phonesInRange = phoneMain.allPhoneData.findPhonesInPriceRange(lowerPrice, upperPrice);
        phonesInRange.sort();
    
        // Print
        System.out.println("List of phones in the price range:");
        System.out.println(phonesInRange);
    }
	
	public void readData() {
	  String header = in.nextLine();
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
	}
}
