/*
 * (Animation: rectangle on a pentagon) You will write a program that animates a 
 * rectangle moving along the outline of a pentagon. Enable the user to resume/pause 
 * the animation with a click on the left/right mouse button. 
 * The rectangle's opacity should change as it moves around the pentagon.
 */


import javafx.animation.FadeTransition;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Animation extends Application {
@Override // Override the start method in the Application class 
    public void start(Stage primaryStage) {
      // Create a pane
      Pane pane = new Pane();
      
      // Create a rectangle
      Rectangle rectangle = new Rectangle (0, 0, 25, 50);
      rectangle.setFill(Color.ORANGE);
      
      // Create a pentagon
      Polygon polygon = new Polygon(); 
	    polygon.setFill(Color.WHITE);
	    polygon.setStroke(Color.BLACK);
	    polygon.setRotate(55);
	    ObservableList<Double> list = polygon.getPoints();
	    
	    final double WIDTH = 200, HEIGHT = 200;
		double centerX = WIDTH / 2, centerY = HEIGHT / 2;
		double radius = Math.min(WIDTH, HEIGHT) * 0.4;
		

	    // Add points to the polygon list
		int s = 5;
		
	    for (int i = 0; i < s; i++) {
	    	list.add(centerX + radius * Math.cos(2 * i * Math.PI / 5)); 
	    	list.add(centerY - radius * Math.sin(2 * i * Math.PI / 5));
	    }     

      
      // Add circle and rectangle to the pane
      pane.getChildren().add(polygon);
      pane.getChildren().add(rectangle);
     
     FadeTransition ft =
        new FadeTransition(Duration.millis(3000), rectangle);
      ft.setFromValue(1.0);
      ft.setToValue(0.1);
      ft.setCycleCount(Timeline.INDEFINITE);
      ft.setAutoReverse(true);
      ft.play(); // Start animation
     
      // Create a path transition
      PathTransition pt = new PathTransition();
      pt.setDuration(Duration.millis(4000));
      pt.setPath(polygon);
      pt.setNode(rectangle);
      pt.setOrientation(
      PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
      pt.setCycleCount(Timeline.INDEFINITE);
      pt.setAutoReverse(true);
      pt.play(); // Start animation
      polygon.setOnMousePressed(e -> pt.pause());
      polygon.setOnMouseReleased(e -> pt.play());
      
     // Create a scene and place it in the stage
     Scene scene = new Scene(pane, 250, 200);
      primaryStage.setTitle("PathTransitionDemo"); // Set the stage title
      primaryStage.setScene(scene); // Place the scene in the stage
      primaryStage.show(); // Display the stage
    }

public static void main(String[] args) {
    launch(args);
  }
}

