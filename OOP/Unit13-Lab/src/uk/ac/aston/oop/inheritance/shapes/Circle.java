package uk.ac.aston.oop.inheritance.shapes;

/** 
 * 
 * Circle subclass that inherits the shape class.
 * Requires centerX, centerY and radius of the circle.
 * 
 */

public class Circle extends Ellipse{
	
	/**
	 * Creates a new Circle instance derived from Ellipse.
	 *
	 * @param centerX X coordinate of the circle
	 * @param centerY Y coordinate of the circle
	 * @param radius Radius of the circle
	 */
	public Circle(double centerX, double centerY, double radius) {
		super(centerX - radius, centerY - radius, radius * 2, radius * 2);
	}
	
	/**
	 * Uses the getWidth method and returns the radius of the circle.
	 * 
	 * @return Radius Gets the radius dividing a method by 2.
	 */
	public double getRadius() { return getWidth() / 2; }
	
}
