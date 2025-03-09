package uk.ac.aston.oop.dpatterns.singleton;


public class Player {
	DiceRoller die = DiceRoller.getInstance();
	private int dieFace;
	
	public Player(int dieFaceCount) {
		// TODO Auto-generated constructor stub
		dieFace = dieFaceCount;
	}

	public int roll() {
		// TODO Auto-generated method stub
		return die.roll(dieFace);
	}

	public int getDieFaces() {
		// TODO Auto-generated method stub
		return dieFace;
	}

}
