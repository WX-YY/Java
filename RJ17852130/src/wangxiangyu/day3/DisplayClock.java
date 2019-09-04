package wangxiangyu.day3;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class DisplayClock extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		ClockPane clock = new ClockPane();
		String timeString = clock.getHour() + ":" + clock.getMinute()
		+ ":" + clock.getSecond();
		Label lblCurrentTime = new Label(timeString);
		BorderPane pane = new BorderPane();
		pane.setCenter(clock);
		pane.setBottom(lblCurrentTime);
		BorderPane.setAlignment(lblCurrentTime, Pos.TOP_CENTER);

		pane.widthProperty().addListener(ov ->
		clock.setMaxWidth(pane.getWidth())
		);
		pane.heightProperty().addListener(ov ->
		clock.setMaxHeight(pane.getHeight())
		);
		Scene scene = new Scene(pane, 250, 250);
		primaryStage.setTitle("DisplayClock");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Application.launch(args);
	}

}
