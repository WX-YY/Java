package wangxiangyu.day3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ShowImage extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Pane pane = new HBox(10);
		pane.setPadding(new Insets(5, 5, 5, 5));
		Image image = new Image("image/timg.jpg");//此处url自己定义图片
		pane.getChildren().add(new ImageView(image));
		ImageView imageView2 = new ImageView(image);
		imageView2.setFitHeight(100);
		imageView2.setFitWidth(100); 
		pane.getChildren().add(imageView2);
		ImageView imageView3 = new ImageView(image);
		imageView3.setRotate(90);
		pane.getChildren().add(imageView3);
		Scene scene = new Scene(pane);
		primaryStage.setTitle("ShowImage"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
		}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Application.launch(args);
	}

}
