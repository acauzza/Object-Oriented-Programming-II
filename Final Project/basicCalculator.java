import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class basicCalculator extends Application {
	@Override
	public void start(Stage primaryStage) {

		//add grid pane to build GUI
		GridPane codePane = new GridPane();
		codePane.setPadding(new Insets(15));
		codePane.setHgap(5);
		codePane.setVgap(5);
		codePane.setAlignment(Pos.CENTER);

		//add scene
		Scene myScene = new Scene(codePane, 400, 200);

		//create label for code and add to grid
		codePane.add(new Label("Enter a Value:"), 0, 0);
		TextField firstInt = new TextField();
		codePane.add(firstInt, 1, 0);
		
		
		//add field to shift code --ideally would like to eventually be a combo box instead of text field
		codePane.add(new Label("Enter a Value:"), 0, 1);
		TextField secondInt = new TextField();
		codePane.add(secondInt, 1, 1);
		

		//add buttons for calculation to pane
		Button add = new Button(" + ");
		codePane.add(add, 1, 2);
		GridPane.setHalignment(add, HPos.LEFT);
		
		Button subtract = new Button(" - ");
		codePane.add(subtract, 1, 2);
		GridPane.setHalignment(subtract, HPos.RIGHT);
		
		Button divide = new Button(" / ");
		codePane.add(divide, 3, 2);
		GridPane.setHalignment(divide, HPos.LEFT);
		
		Button multiply = new Button(" x ");
		codePane.add(multiply, 1, 2);
		GridPane.setHalignment(multiply, HPos.CENTER);
		
		//add text field to display final result
		TextField result = new TextField();
		result.setEditable(false);
		codePane.add(result, 1, 3);
		




		//set up action for button press
		add.setOnAction(e -> {
			int firstValue = Integer.valueOf(firstInt.getText());
			int secondValue = Integer.valueOf(secondInt.getText());
			Integer r = firstValue + secondValue;
			result.setText(r.toString());
		});
		
		subtract.setOnAction(e -> {
			int firstValue = Integer.valueOf(firstInt.getText());
			int secondValue = Integer.valueOf(secondInt.getText());
			Integer r = firstValue - secondValue;
			result.setText(r.toString());
		});
		
		multiply.setOnAction(e -> {
			int firstValue = Integer.valueOf(firstInt.getText());
			int secondValue = Integer.valueOf(secondInt.getText());
			Integer r = firstValue * secondValue;
			result.setText(r.toString());
		});
		
		divide.setOnAction(e -> {
			int firstValue = Integer.valueOf(firstInt.getText());
			int secondValue = Integer.valueOf(secondInt.getText());
			Integer r = firstValue / secondValue;
			result.setText(r.toString());
		});
		

		primaryStage.setScene(myScene);
		primaryStage.setTitle("Caesar Cypher");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}