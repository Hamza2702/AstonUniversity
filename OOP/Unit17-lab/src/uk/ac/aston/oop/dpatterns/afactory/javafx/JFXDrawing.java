package uk.ac.aston.oop.dpatterns.afactory.javafx;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import uk.ac.aston.oop.dpatterns.afactory.Drawing;

public class JFXDrawing implements Drawing {
	
	private Rectangle rectangle = new Rectangle();
	
	public JFXDrawing(Group container, int width, int height) {
		rectangle.setWidth(width);
		rectangle.setHeight(height);
		container.getChildren().add(rectangle);	
	}
	
	public void setFill(int r, int g, int b) {
		rectangle.setFill(Color.rgb(r, g, b));
	}
}
