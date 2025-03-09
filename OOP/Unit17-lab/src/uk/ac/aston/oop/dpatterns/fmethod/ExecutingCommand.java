package uk.ac.aston.oop.dpatterns.fmethod;

public class ExecutingCommand implements Runnable {

	private ExecutingCommandReader reader;
	private int dx, dy;
	
	public ExecutingCommand(ExecutingCommandReader reader, int dx, int dy) {
		this.reader = reader;
		this.dx = dx;
		this.dy = dy;
	}
	
	@Override
	public void run() {
		int newX = reader.getX() + dx;
		int newY = reader.getY() + dy;
				
		reader.setX(newX);
		reader.setY(newY);
		
		System.out.println("New Position = " + newX + ", " + newY);
	}
}
