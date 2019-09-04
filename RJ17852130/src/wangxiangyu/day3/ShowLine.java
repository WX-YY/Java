package wangxiangyu.day3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class ShowLine extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		// TODO Auto©\generated method stub
		Scene scene = new Scene(new LinePane(), 200, 200);
		primaryStage.setTitle("showLine");
		primaryStage.setScene(scene);
		primaryStage.show();
		}
		
		class LinePane extends Pane{
		public LinePane() {
		Line line1 = new Line(10, 10, 10, 10);
		line1.endXProperty().bind(widthProperty().subtract(10));
		line1.endYProperty().bind(heightProperty().subtract(10));
		line1.setStrokeWidth(5);
		line1.setStroke(Color.GREEN);
		getChildren().add(line1);
		Line line2 = new Line(10, 10, 10, 10);
		line2.startXProperty().bind(widthProperty().subtract(10));
		line2.endYProperty().bind(heightProperty().subtract(10));
		line2.setStrokeWidth(5);
		line2.setStroke(Color.BLUE);
		getChildren().add(line2);
		}

		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Application.launch(args);
	}

}
