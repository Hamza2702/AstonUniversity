package uk.ac.aston.oop.dpatterns.fmethod;

public class ExecutingCommandReader extends AbstractCommandReader{
	
	private int x = 0, y = 0;
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	protected Runnable createMovementCommand(int dx, int dy) {
		return new ExecutingCommand(this, dx, dy);
	}

}
