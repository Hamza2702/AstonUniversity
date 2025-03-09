package uk.ac.aston.oop.inheritance.shapes;

import javafx.scene.paint.Color;
import uk.ac.aston.oop.inheritance.util.GraphicsContextWrapper;

/** 
 * 
 * Similar to rectangle
 * FilledRectangle subclass that inherits the shape class.
 * Requires a colour, upper left corner X and Y, width and height of the rectangle.
 * Imported colour to fill in the shape.
 * Imported GraphicsContextWrapper to draw the shape.
 * 
 */

public class FilledRectangle extends Rectangle{
	private Color fill;
	
	/**
     * Creates a new filled in rectangle.
     * 
     * @param colour Colour of the rectangle.
     * @param x X Coordinate of the upper left corner of the rectangle.
     * @param y Y Coordinate of the upper left corner of the rectangle.
     * @param width Width of the rectangle.
     * @param height Height of the rectangle.
     */
	public FilledRectangle(Color c,double ulX, double ulY, double w, double h){
		super(ulX, ulY, w, h);
		fill = c;
	}
	
	/**
	 * Returns the fill colour for the rectangle
	 * 
	 * @return fill colour
	 */
	public Color getFill() {
		return fill;
	}
	/**
	 * Overrides the Shape draw method
	 * Draws a filled in rectangle
	 * 
	 * @param gc Uses GraphicsContextWrapper to draw the shape.
	 */
	@Override
	public void draw(GraphicsContextWrapper gc) {
		super.draw(gc);
		gc.fill(fill);
		gc.fillRect(getX(), getY(), getWidth(), getHeight());
	}
}
