package wangxiangyu.day3;





import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class ShowPolygon extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		Pane pane = new Pane();
		Polygon polygon = new Polygon();
		pane.getChildren().add(polygon);
		polygon.setFill(Color.WHITE);
		polygon.setStroke(Color.BLACK);
		ObservableList<Double> list = polygon.getPoints();
		final double WIDTH = 200, HEIGHT = 200; 
		double centerX = WIDTH /2, centerY = HEIGHT / 2;
		double radius = Math.min(WIDTH, HEIGHT) * 0.4;
		for (int i = 0; i < 6; i++) {
		list.add(centerX + radius * Math.cos(2*i*Math.PI/6));
		list.add(centerY - radius * Math.sin(2*i*Math.PI/6));
		}
		Scene scene = new Scene(pane, WIDTH, HEIGHT);
		arg0.setTitle("ShowPolygon");
		arg0.setScene(scene);
		arg0.show();
		}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Application.launch(args);
	}

}
