package uk.ac.aston.oop.acint.shapes;

import uk.ac.aston.oop.acint.util.GraphicsContextWrapper;

public interface Drawable {
	
	public abstract void draw(GraphicsContextWrapper gc);
	public double move(GraphicsContextWrapper gc, double dx, double dy);

}
