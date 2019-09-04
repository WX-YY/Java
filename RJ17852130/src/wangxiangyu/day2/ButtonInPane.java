package wangxiangyu.day2;



import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class ButtonInPane extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		StackPane pane = new StackPane();
		pane.getChildren().add(new Button("OK"));
		Scene scene = new Scene(pane,200,50);
		arg0.setTitle("Button in a pane");
		arg0.setScene(scene);
		arg0.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

}
