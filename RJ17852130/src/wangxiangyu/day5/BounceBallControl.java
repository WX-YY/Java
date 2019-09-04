package wangxiangyu.day5;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class BounceBallControl extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		BallPane ballPane = new BallPane(); // Create a ball pane
		// Pause and resume animation
		ballPane.setOnMousePressed(e -> ballPane.pause());
		ballPane.setOnMouseReleased(e -> ballPane.play());
		// Increase and decrease animation
		ballPane.setOnKeyPressed(e-> {
		if (e.getCode() == KeyCode.UP) {
		ballPane.increaseSpeed();
		}
		else if (e.getCode() == KeyCode.DOWN) {
		ballPane.decreaseSpeed();
		}
		}); 
		// Create a scene and place it in the stage
		Scene scene = new Scene(ballPane, 250, 150);
		arg0.setTitle("BounceBallControl"); // Set the stage title
		arg0.setScene(scene); // Place the scene in the stage
		arg0.show(); // Display the stage
		// Must request focus after the primary stage is displayed
		ballPane.requestFocus();
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}
		}
		class BallPane extends Pane {
		public final double radius = 20;
		private double x = radius, y = radius;
		private double dx = 1, dy = 1;
		private Circle circle = new Circle(x, y, radius);
		private Timeline animation;
		public BallPane() {
		circle.setFill(Color.GREEN); // Set ball color
		getChildren().add(circle); // Place a ball into this pane
		// Create an animation for moving the ball
		animation = new Timeline(
		new KeyFrame(Duration.millis(50), e -> moveBall()));
		animation.setCycleCount(Timeline.INDEFINITE);
		animation.play(); // Start animation
		}
		public void play() {
		animation.play();
		}
		public void pause() {
		animation.pause();
		}
		public void increaseSpeed() {
		animation.setRate(animation.getRate() + 10);
		}
		public void decreaseSpeed() {
		animation.setRate(
		animation.getRate() > 0 ? animation.getRate() - 10: 0);
		}
		public DoubleProperty rateProperty() {
		return animation.rateProperty();
		} 
		protected void moveBall() {
		// Check boundaries
		if (x < radius || x > getWidth() -radius) {
		dx *= -1; // Change ball move direction
		}
		if (y < radius || y > getHeight() -radius) {
		dy *= -1; // Change ball move direction
		}
		// Adjust ball position
		x += dx;
		y += dy;
		circle.setCenterX(x);
		circle.setCenterY(y);

	}

}
