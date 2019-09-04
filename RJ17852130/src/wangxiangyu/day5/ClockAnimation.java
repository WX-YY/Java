package wangxiangyu.day5;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Duration;
import wangxiangyu.day3.ClockPane;

public class ClockAnimation extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		ClockPane clock = new ClockPane(); // Create a clock
		// Create a handler for animation
		EventHandler<ActionEvent> eventHandler = e -> {
		clock.setCurrentTime(); // Set a new clock time
		};
		// Create an animation for a running clock
		Timeline animation = new Timeline(
		new KeyFrame(Duration.millis(1000), eventHandler));
		animation.setCycleCount(Timeline.INDEFINITE);
		animation.play(); // Start animation
		// Create a scene and place it in the stage
		Scene scene = new Scene(clock, 250, 250);
		primaryStage.setTitle("ClockAnimation"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

}
