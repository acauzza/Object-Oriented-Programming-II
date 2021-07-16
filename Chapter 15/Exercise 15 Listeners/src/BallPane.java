import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;

public class BallPane extends Pane {
	private static Circle circle = new Circle(50, 50, 50);

	// Create ball
	public BallPane() {
		circle.setFill(Color.DIMGRAY);
		circle.setStroke(Color.BLACK);
		getChildren().add(circle); 
	}
	
	
	// Move ball up
	public void up() {
		circle.setCenterY(circle.getCenterY() > circle.getRadius() ? 
			circle.getCenterY() - 10 : circle.getCenterY());
		circle.setCenterX(circle.getCenterX());
	}
	
	// Move ball down
	public void down() {
		circle.setCenterX(circle.getCenterX());
		circle.setCenterY(circle.getCenterY() < getHeight() - circle.getRadius() ? 
			circle.getCenterY() + 10 : circle.getCenterY());
	}

	// Move ball left
	public void left() { 
		circle.setCenterX(circle.getCenterX() > circle.getRadius() ? 
			circle.getCenterX() - 10 : circle.getCenterX());
		circle.setCenterY(circle.getCenterY());
	}

	// Move ball right
	public void right() {
		circle.setCenterX(circle.getCenterX() < getWidth() - circle.getRadius() ? 
			circle.getCenterX() + 10 : circle.getCenterX());
		circle.setCenterY(circle.getCenterY());
	}

}