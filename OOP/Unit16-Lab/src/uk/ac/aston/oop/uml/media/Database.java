package uk.ac.aston.oop.uml.media;

import java.util.ArrayList;

public class Database {
	private ArrayList<Item> items;
	public Database() {
		this.items = new ArrayList<>();
	}
	
	public void addItem(Item i) {
		items.add(i);
	}
	public void print() {
        for (Item item : items) {
            System.out.println(item.toString());
        }
    }
	
	public static void main(String[] args) {
		Database db = new Database();
		
		CD deathconsciousness = new CD("Deathconsciousness", "Have a Nice Life", 13, 85);
		db.addItem(deathconsciousness);
		deathconsciousness.setOwned(true);
		deathconsciousness.setComment("An amazing album, with many great songs, that starts off with an excellent track.");
		
		Video whiplash = new Video("Whiplash", "Damien Chazelle", 107);
		db.addItem(whiplash);
		whiplash.setOwned(true);
		whiplash.setComment("A wonderful movie.");
		
		db.print();
	}
}
