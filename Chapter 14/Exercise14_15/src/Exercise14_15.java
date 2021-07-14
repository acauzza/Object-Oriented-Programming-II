import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.text.*;
import javafx.stage.Stage;

public class Exercise14_15 extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {   
		
		StackPane pane = new StackPane();
		
		//create a polygon
	    Polygon polygon = new Polygon();
	    pane.getChildren().add(polygon); 
	    polygon.setFill(Color.RED);
	    polygon.setRotate(22.5);
	    ObservableList<Double> list = polygon.getPoints();
	    
	    final double WIDTH = 400, HEIGHT = 400;
		double centerX = WIDTH / 2, centerY = HEIGHT / 2;
		double radius = Math.min(WIDTH, HEIGHT) * 0.4;
		

	    // Add points to the polygon list
		int s = 8;
		
	    for (int i = 0; i < s; i++) {
	    	list.add(centerX + radius * Math.cos(2 * i * Math.PI / 8)); 
	    	list.add(centerY - radius * Math.sin(2 * i * Math.PI / 8));
	    }     

//		Text text = new Text("STOP");
//		text.setFont(Font.font("Times New Roman", FontWeight.BOLD, 90));
//		text.setFill(Color.WHITE);
//		pane.getChildren().add(text);
	    
	    
	    Label label = new Label("STOP");
	    label.setFont(Font.font("Times New Roman", 
	      FontWeight.BOLD, 90));
		label.setTextFill(Color.WHITE);
	    pane.getChildren().addAll(polygon, label);

		
		// Create a scene and place it in the stage
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Exercise14_15"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
	

}