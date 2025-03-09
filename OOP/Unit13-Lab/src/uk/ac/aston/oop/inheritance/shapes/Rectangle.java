package uk.ac.aston.oop.inheritance.shapes;

import uk.ac.aston.oop.inheritance.util.GraphicsContextWrapper;

/** 
 * 
 * Rectangle subclass that inherits and derives from the shape class.
 * Requires upper left corner X and Y, width and height of the rectangle.
 * Imported GraphicsContextWrapper to draw the shape.
 * 
 */

public class Rectangle extends Shape{
	
	/**
	 * Creates a new rectangle instance derived from Shape.
	 *
	 * @param ulX X coordinate of the upper left corner.
	 * @param ulY Y coordinate of the upper left corner.
	 * @param width width of the rectangle.
	 * @param height height of the rectangle.
	 */
	public Rectangle(double ulX, double ulY, double width, double height) {
		super(ulX, ulY, width, height);
	}
	/**
	 * Overrides the Shape draw method
	 * Draws a rectangle with a line width of 5.
	 * 
	 * @param gc Uses GraphicsContextWrapper to draw the shape.
	 */
	@Override
	public void draw(GraphicsContextWrapper gc) {
		gc.lineWidth(5);
		gc.rect(getX(), getY(), getWidth(), getHeight());
	}

}
