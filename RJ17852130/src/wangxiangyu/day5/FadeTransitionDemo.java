package wangxiangyu.day5;

import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;
import javafx.util.Duration;

public class FadeTransitionDemo extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		Pane pane= new Pane();
		Ellipse ellipse = new Ellipse(10,10,100,50);
		ellipse.setFill(Color.BLACK);
		ellipse.centerXProperty().bind(pane.widthProperty().divide(2));
		ellipse.centerYProperty().bind(pane.heightProperty().divide(2));
		ellipse.radiusXProperty().bind(pane.widthProperty().multiply(0.5));
		ellipse.radiusYProperty().bind(pane.heightProperty().multiply(0.5));
		pane.getChildren().add(ellipse);
		FadeTransition fade = new FadeTransition(Duration.millis(3000),ellipse);
		fade.setFromValue(1.0);
		fade.setToValue(0.1);
		fade.setCycleCount(Timeline.INDEFINITE);
		fade.play();
		ellipse.setOnMousePressed(e ->fade.pause());
		ellipse.setOnMousePressed(e ->fade.play());
		Scene scene = new Scene(pane,500,500);
		arg0.setTitle("FadeTransition");
		arg0.setScene(scene);
		arg0.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Application.launch(args);
	}

}
