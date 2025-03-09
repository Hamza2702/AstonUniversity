package uk.ac.aston.oop.uml.media;

public abstract class Item {
	private String title;
	private int playMinutes;
	private String comment = "";
	private boolean owned = false;
	
	public Item(String title, int playMinutes) {
		this.title = title;
		this.playMinutes = playMinutes;
	}
	
	public String getComment() {
		return this.comment;
	}
	
	public void setComment(String c) {
		this.comment = c;
	}
	
	public boolean isOwned() {
		return owned;
	}
	
	public void setOwned(Boolean o) {
		this.owned = o;
	}
	
	public int getPlayMinutes() {
		return playMinutes;
	}

	public String toString() {
		if (isOwned()) {
			return "*" + title + ": " +  playMinutes + " - " + comment + ".";
		}
		return title + ": " +  playMinutes + " - " + comment + ".";
	}
}
