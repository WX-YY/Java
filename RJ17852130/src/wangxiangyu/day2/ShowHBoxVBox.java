package wangxiangyu.day2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;


import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ShowHBoxVBox extends Application {

	@Override
	public void start(Stage arg0)  {
		// TODO Auto-generated method stub
		BorderPane pane = new BorderPane();
		pane.setTop(getHBox());
		pane.setLeft(getVBox());
		Scene scene = new Scene(pane);
		arg0.setTitle("ShowHBoxVBox");
		arg0.setScene(scene);
		arg0.show();
	}
		private HBox getHBox() {
			HBox hBox = new HBox(15);
			hBox.setPadding(new Insets(15, 15, 15, 15));
			hBox.setStyle("©\fx©\background©\color: gold");
			hBox.getChildren().add(new Button("Computer Science"));
			hBox.getChildren().add(new Button("Chemistry"));
			hBox.getChildren().add(new Button("Geography"));
			return hBox;
		}
		private VBox getVBox() {
			VBox vBox = new VBox(15);
			vBox.setPadding(new Insets(15, 5, 5, 5));
			vBox.getChildren().add(new Label("Courses"));
			Label[] courses = {new Label("CS101"), new Label("CS102"), new
			Label("CS201"), new Label("CS202")};
			for (Label course : courses) {
			vBox.setMargin(course, new Insets(0, 0, 0, 15));
			vBox.getChildren().add(course);
			}
			return vBox;
			}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Application.launch(args);
	}

}
