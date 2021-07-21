
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;

public class Exercise16_21 extends Application {
	  TextField countDown = new TextField();
	  Media media = new Media("https://liveexample.pearsoncmg.com/common/audio/anthem/anthem0.mp3");
	  MediaPlayer mediaPlayer = new MediaPlayer(media);
	  Timeline stopWatch;

  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
	  mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
	  StackPane pane = new StackPane(countDown);

	  // Create animation for stopwatch
	  stopWatch = new Timeline(
			  new KeyFrame(Duration.millis(1000), e -> run()));
	  stopWatch.setCycleCount(Timeline.INDEFINITE);

	  countDown.setOnKeyPressed(e -> {
		  if (e.getCode() == KeyCode.ENTER) {
			  stopWatch.play();
		}
	});
	  
    // Create a scene and place it in the stage
    Scene scene = new Scene(pane, 350, 200);
    primaryStage.setTitle("Exercise16_21"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage  
  }
  
    void run() {
    if (Integer.parseInt(countDown.getText()) != 0) {
		mediaPlayer.pause();
		mediaPlayer.seek(Duration.seconds(1));
		countDown.setText(String.valueOf(
				Integer.parseInt(countDown.getText()) - 1));
		
		

	if (countDown.getText().equals("0")) {
		stopWatch.pause();
		mediaPlayer.play();
	}
  }
}

  
/**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
}