package uk.ac.aston.oop.uml.media;

public class CD extends Item{
	private String artist;
	private int nTracks;
	
	public CD(String title, String artist, int nTracks, int playMinutes) {
		super(title, playMinutes);
		this.artist = artist;
		this.nTracks = nTracks;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public int getNumberOfTracks() {
		return nTracks;
	}
	
	@Override
	public String toString() {
		return "Artist: " + artist + ". Number of tracks: " + nTracks + ".\n" + super.toString();
	}
}
