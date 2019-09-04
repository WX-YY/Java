package wangxiangyu.day2;



import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
public class ShowCircleCentered extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		Pane pane = new Pane();//����
		Circle circle = new Circle();//�½�Բ
		circle.centerXProperty().bind(pane.widthProperty().divide(2));
		circle.centerYProperty().bind(pane.heightProperty().divide(2));
		circle.setRadius(50);//�뾶
		circle.setStroke(Color.BLACK);//�ⲿ��ɫ
		circle.setFill(Color.GRAY);//�ڲ���ɫ
		pane.getChildren().add(circle);//�����������Բ
		Scene scene = new Scene(pane, 200, 200);//�����С
		arg0.setTitle("ShowCircleCentered");//������
		arg0.setScene(scene);
		arg0.show();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

}
