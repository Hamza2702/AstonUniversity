package uk.ac.aston.oop.acint.shapes;

public class Circle extends Ellipse {

	public Circle(double centerX, double centerY, double radius) {
		super(centerX - radius, centerY - radius, radius * 2, radius * 2);
	}
	
	public void scale(double ratio) {
		width *= ratio;
		height *= ratio;
	}

    public double getRadius() { return getWidth()/2; }

}
