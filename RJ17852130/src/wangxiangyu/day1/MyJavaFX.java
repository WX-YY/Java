package wangxiangyu.day1;


import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.stage.Stage;

public class MyJavaFX extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
Button btOK = new Button("OK");
Scene scene = new Scene(btOK,200,250);
arg0.setTitle("MyJavaFX");
arg0.setScene(scene);
arg0.show();
	}
public static void main(String[] args){
	Application.launch(args);
}
}
