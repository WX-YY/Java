package wangxiangyu.day2;

import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;



import javafx.application.Application;
import javafx.scene.Scene;

import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.control.Label;

public class ShowFlowPane extends Application {
	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method 
		FlowPane pane = new FlowPane();
		pane.setPadding(new Insets(11,12,13,14));
		pane.setHgap(5);
		pane.setVgap(5);
		pane.getChildren().addAll(new Label("First Name:"),new
		TextField(),new Label("MI"));
		TextField tfMi = new TextField();
		tfMi.setPrefColumnCount(1);
		pane.getChildren().addAll(tfMi,new Label("Last Name:"),new
		TextField());
		Scene scene = new Scene(pane,400,100); 
		arg0.setTitle("ShowF lowPane");
		arg0.setScene(scene);
		arg0.show();


	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Application.launch(args);
	}

}
