package wangxiangyu.day4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class KeyEventDemo extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		Pane pane = new Pane();
		Text text = new Text(20, 20, "A");
		pane.getChildren().add(text);
		// Create a scene and place the pane in the stage
		Scene scene = new Scene(pane);
		arg0.setTitle("KeyEventDemo"); // Set the stage title
		arg0.setScene(scene); // Place the scene in the stage
		arg0.show(); // Display the stage
		
		/*text.setOnKeyPressed(e -> {
		switch (e.getCode()) {
		case DOWN: text.setY(text.getY() + 10); break;
		case UP: text.setY(text.getY() -10); break;
		case LEFT: text.setX(text.getX() -10); break;
		case RIGHT: text.setX(text.getX() + 10); break;
		default:
		if (e.getText().length() > 0)
		text.setText(e.getText());
		}
		});*/
		text.setOnKeyPressed((e) ->{
			switch(e.getCode()){
			case UP:text.setY(text.getY()-10);break;
			case DOWN:text.setY(text.getY()+10);break;
			case LEFT:text.setX(text.getX()-10);break;
			case RIGHT:text.setX(text.getX()+10);break;
			default:
				if(e.getText().length()>0)
					text.setText(e.getText());
			}
			});
		text.requestFocus(); // text is focused to receive key input
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Application.launch(args);
	}

}
