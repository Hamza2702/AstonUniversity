package uk.ac.aston.oop.inheritance.shapes;

import uk.ac.aston.oop.inheritance.util.GraphicsContextWrapper;

/** 
 * 
 * Shape superclass that defines a shape with multiple get methods as well as a based draw method
 * Imported GraphicsContextWrapper to draw the shape.
 * 
 */

public class Shape {
	private double upperLeftX;
	private double upperLeftY;
	private double width;
	private double height;
	
	/**
	 * Creates a new instance.
	 *
	 * @param ulX X coordinate of the upper left corner.
	 * @param ulY Y coordinate of the upper left corner.
	 * @param w Width of the shape.
	 * @param h Height of the shape.
	 */
	public Shape(double ulX, double ulY, double w, double h){
		upperLeftX = ulX;
		upperLeftY = ulY;
		width = w;
		height = h;
	}
	
	/**
	 * Returns the X coordinate of the upper left corner of the shape.
	 *
	 * @return upperLeftX X coordinate of upper left corner of the shape.
	 */
	public double getX() {
		return upperLeftX;
	}
	
	/**
	 * Returns the Y coordinate of the upper left corner of the shape.
	 *
	 * @return upperLeftY Y coordinate of upper left corner of the shape.
	 */
	public double getY() {
		return upperLeftY;
	}
	
	/**
	 * Returns the width number of the shape.
	 *
	 * @return width Width of the shape.
	 */
	public double getWidth() {
		return width;
	}
	
	/**
	 * Returns the height number of the shape.
	 *
	 * @return height Height of the shape.
	 */
	public double getHeight() {
		return height;
	}
	
	/**
	 * Prints out a standard message
	 *
	 * @param gc Uses GraphicsContextWrapper to print out a message.
	 */
	public void draw(GraphicsContextWrapper gc) {
		System.out.println("Can't really draw a shape.");
	}

}
