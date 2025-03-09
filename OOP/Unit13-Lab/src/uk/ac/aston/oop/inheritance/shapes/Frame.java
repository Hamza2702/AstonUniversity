package uk.ac.aston.oop.inheritance.shapes;

import uk.ac.aston.oop.inheritance.util.GraphicsContextWrapper;

/** 
 * 
 * Frame subclass that derives from the shape class
 * Requires upper left corner X and Y, width and height of the shape.
 * Creates two rectangles and utilises the FRAME_THICKNESS variable to draw the shapes
 * Imported GraphicsContextWrapper to draw the shape.
 * 
 */
public class Frame extends Shape{
	/**
	 * Protected outerRectangle object
	 */
	protected Rectangle outerRectangle;
	/**
	 * Protected innerRectangle object
	 */
	protected Rectangle innerRectangle;
	
	private static final int FRAME_THICKNESS = 10;
	
	/**
	 * Creates two new rectangle instance derived from Shape.
	 * Utilises the FRAME_THICKNESS variable to create an inner rectangle.
	 *
	 * @param ulX X coordinate of the upper left corner.
	 * @param ulY Y coordinate of the upper left corner.
	 * @param w width of the filled rectangle.
	 * @param h height of the filled rectangle.
	 */
	public Frame(double ulX, double ulY, double w, double h) {
		super(ulX, ulY, w, h);
		outerRectangle = new Rectangle(ulX, ulY, w, h);
		innerRectangle = new Rectangle(ulX + FRAME_THICKNESS, ulY + FRAME_THICKNESS, w - FRAME_THICKNESS * 2, h - FRAME_THICKNESS * 2);
	}
	/**
	 * Overrides the Shape draw method
	 * Draws two frames.
	 * 
	 * @param gc Uses GraphicsContextWrapper to draw the shape.
	 */
	@Override
	public void draw(GraphicsContextWrapper gc) {
		outerRectangle.draw(gc);
		innerRectangle.draw(gc);
	}
}
