package wangxiangyu.day4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MouseEventDemo extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Pane pane = new Pane();
		Text text = new Text(20, 20, "Programming is fun"); 
		pane.getChildren().addAll(text);
		text.setOnMouseDragged(e -> {
		text.setX(e.getX());
		text.setY(e.getY());
		});
		text.setOnMousePressed(e ->{
			System.out.println("press text");
		});
		text.setOnMouseReleased((e) ->{
			System.out.println("Release text");
		});
		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 300, 100);
		primaryStage.setTitle("MouseEventDemo");
		primaryStage.setScene(scene);
		primaryStage.show();
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
Application.launch(args);
	}

}
