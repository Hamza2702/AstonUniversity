import java.util.ArrayList;
import java.util.Scanner;

ArrayList<Contact> contacts;
Scanner file;
Button previous;
Button next;
int indexCount = 1;
float mX;
float mY;

void setup() { // Construct
  size(600, 400);
  previous = new Button(100, 300, 100, 50, "Previous");
  next = new Button(400, 300, 100, 50, "Next");
  contacts = new ArrayList<Contact>();
  String filename = sketchPath() + "/Contacts.csv";
  file = InputReader.getScanner(filename);
  readAllContacts(); // Get file
}

void draw() { // Display
  background(255);
  textAlign(CENTER);
  fill(0);
  Contact contact = contacts.get(indexCount);
  textSize(20);
  text("Contact Information", 300, 50);
  textSize(16);
  text(contact.toString(), 300, 100);
  previous.display();
  next.display();
}

void readAllContacts() { // Read contacts
  while (file.hasNext()) {
    String line = file.nextLine();
    String[] parts = line.split(","); // Split
    Contact contact = new Contact(parts[0], parts[1]); // Construct
    contact.setEmail(parts[2]); // Set email
    contact.setNumber(parts[3]); // Set num
    contacts.add(contact); // Add
  }
}

void mousePressed() {
  mX = mouseX; // Get mouse X
  mY = mouseY; // Get mouse Y

  if (previous.isInside(mX, mY) && indexCount != 1) { // Out of bounds check
    indexCount -= 1; // Decrease Index
  }

  if (next.isInside(mX, mY) && indexCount != contacts.size() - 1) { // Out of bounds check
    indexCount += 1; // Increase index
  }
}
