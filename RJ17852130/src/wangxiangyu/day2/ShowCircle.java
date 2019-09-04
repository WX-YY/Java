package wangxiangyu.day2;


import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class ShowCircle extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		Circle circle = new Circle();//����Բ
		circle.setCenterX(100);//Բ��x
		circle.setCenterY(100);//Բ��y
		circle.setRadius(50);//�뾶
		circle.setStroke(Color.RED);//��Ե��
		circle.setFill(Color.BLUE);//�ڲ�ʵ��
		Pane pane = new Pane();//����
		pane.getChildren().add(circle);
			Scene scene = new Scene(pane, 200,200);
		arg0.setTitle("show circle");
		arg0.setScene(scene);
		arg0.show();		
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}
}
