/**
 * Representation of a star
 * 
 * Created by alex .
 */
import java.awt.*;

public class Star extends Circle {
	public Star(Point center, int radius) {
		super(center, radius);
	}
	public void paint(Graphics brush, Color color) {
		brush.setColor(Color.CYAN);
		brush.fillOval((int) center.x, (int) center.y, radius, radius);
	}

	public void move() {

	}
}
