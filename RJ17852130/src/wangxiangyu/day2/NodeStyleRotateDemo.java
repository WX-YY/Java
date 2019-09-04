package wangxiangyu.day2;

import javafx.application.Application;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


import javafx.scene.Scene;
import javafx.scene.control.Button;

public class NodeStyleRotateDemo extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		StackPane pane = new StackPane();
		Button btOK = new Button("OK");
		btOK.setStyle("©\fx©\border©\color:blue;");
		pane.getChildren().add(btOK);
		pane.setRotate(45);//Ðý×ª½Ç¶È
		pane.setStyle("©\fx©\border©\color:red;©\fx©\background©\color:lightgray;");
		Scene scene = new Scene(pane, 200, 250);
		arg0.setTitle("NodeStyleRotateDemo");
		arg0.setScene(scene);
		arg0.show();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

}
