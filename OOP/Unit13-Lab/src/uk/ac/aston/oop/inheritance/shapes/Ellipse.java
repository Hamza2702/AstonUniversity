package uk.ac.aston.oop.inheritance.shapes;

import uk.ac.aston.oop.inheritance.util.GraphicsContextWrapper;

/** 
 * 
 * Ellipse subclass that inherits the shape class.
 * Requires upper left corner X and Y, width and height of the ellipse.
 * Imported GraphicsContextWrapper to draw the shape.
 * 
 */

public class Ellipse extends Shape{
	
	/**
	 * Creates a new ellipse instance derived from Shape.
	 *
	 * @param upperLeftX X coordinate of the upper left corner of the ellipse.
	 * @param upperLeftY Y coordinate of the upper left corner of the ellipse.
	 * @param width width of the ellipse.
	 * @param height height of the ellipse.
	 */
	public Ellipse(double upperLeftX, double upperLeftY, double width, double height) {
		super(upperLeftX, upperLeftY, width, height);
	}
	/**
	 * Draws the ellipse.
	 *
	 * @param gc Uses GraphicsContextWrapper to draw the shape.
	 */
	@Override
	public void draw(GraphicsContextWrapper gc) {
		gc.oval(getX(), getY(), getWidth(), getHeight());
	}
	
}
