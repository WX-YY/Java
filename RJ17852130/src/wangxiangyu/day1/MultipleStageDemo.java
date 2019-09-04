package wangxiangyu.day1;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.stage.Stage;

public class MultipleStageDemo extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub

Scene scene = new Scene(new Button("OK"),200,250);
arg0.setTitle("MyJavaFX");
arg0.setScene(scene);
arg0.show();
Stage stage = new Stage();
stage.setTitle("Second stage");
stage.setScene(new Scene(new Button("New Stage"),100,100));
stage.show();
stage.setResizable(false);
	}
	public static void main(String[] args){
		Application.launch(args);
		
	}
}

