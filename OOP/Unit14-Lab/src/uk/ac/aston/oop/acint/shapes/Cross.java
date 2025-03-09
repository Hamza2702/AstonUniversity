package uk.ac.aston.oop.acint.shapes;

import uk.ac.aston.oop.acint.util.GraphicsContextWrapper;

public class Cross implements Drawable {
	
	public double centerX, centerY;
	protected static final int SIZE = 20;
	
	public Cross(double centerX,double centerY) {
		this.centerX = centerX;
		this.centerY = centerY;
	}
	
	@Override
	public void draw(GraphicsContextWrapper gc) {
		gc.line(centerX - SIZE/2, centerY - SIZE/2, centerX + SIZE/2, centerY + SIZE/2);
		gc.line(centerX + SIZE/2, centerY - SIZE/2, centerX - SIZE/2, centerY + SIZE/2);
	}

	@Override
	public double move(GraphicsContextWrapper gc, double dx, double dy) {
		centerX += dx;
		centerY += dy;
		if (centerX + SIZE/2 > gc.width()) {
			centerX = gc.width() - SIZE/2;
		}
		if (centerY + SIZE/2 > gc.height()) {
			centerY = gc.height() - SIZE/2;
		}
		return dy;
	}
	
	
}
