package wangxiangyu.day4;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HandleEvent extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		HBox pane = new HBox(10);
		pane.setAlignment(Pos.CENTER);
		Button btOK = new Button("OK");
		Button btCancel = new Button("Cancel");
		OKHandlerClass handler1 = new OKHandlerClass();
		btOK.setOnAction(handler1);
		CancelHandlerClass handler2 = new CancelHandlerClass();
		btCancel.setOnAction(handler2);
		pane.getChildren().addAll(btOK,btCancel);
		Scene scene = new Scene(pane);
		arg0.setTitle("HandlerEvent");
		arg0.setScene(scene);
		arg0.show();
	}
	class OKHandlerClass implements EventHandler<ActionEvent>{
		public void handle(ActionEvent e){
			System.out.println("OK button clicked");
	}
}
	class CancelHandlerClass implements EventHandler<ActionEvent>{
		public void handle(ActionEvent e){
			System.out.println("Cancel button clicked");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

}
