package wangxiangyu.day5;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.util.Duration;
import wangxiangyu.day3.ClockPane;


public class DisplayResizableClock extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		ClockPane clock = new ClockPane();
		String timeString = clock.getHour() + ":" + clock.getMinute()
		+ ":" + clock.getSecond();
		Label lblCurrentTime = new Label(timeString);
		
		// Place clock and label in border pane
		BorderPane pane = new BorderPane();
		pane.setCenter(clock);
		pane.setBottom(lblCurrentTime);
		BorderPane.setAlignment(lblCurrentTime, Pos.TOP_CENTER);
		EventHandler<ActionEvent>eventHandler = e->{
			clock.setCurrentTime(); // Set a new clock time
		};
		Timeline animation = new Timeline(
				new KeyFrame(Duration.millis(1000), eventHandler));
				animation.setCycleCount(Timeline.INDEFINITE);
				animation.play(); 
		// Create a scene and place the pane in the stage
		Scene scene = new Scene(pane, 250, 250);
		primaryStage.setTitle("DisplayClock");
		primaryStage.setScene(scene);
		primaryStage.show();
		//以下为面板监听器
		pane.widthProperty().addListener(ov ->
		clock.setW(pane.getWidth())
		); 
		pane.heightProperty().addListener(ov ->
		clock.setH(pane.getHeight())
		);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

}
