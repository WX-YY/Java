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
		Pane pane = new Pane();//容器
		Circle circle = new Circle();//新建圆
		circle.centerXProperty().bind(pane.widthProperty().divide(2));
		circle.centerYProperty().bind(pane.heightProperty().divide(2));
		circle.setRadius(50);//半径
		circle.setStroke(Color.BLACK);//外部颜色
		circle.setFill(Color.GRAY);//内部颜色
		pane.getChildren().add(circle);//往容器中添加圆
		Scene scene = new Scene(pane, 200, 200);//画板大小
		arg0.setTitle("ShowCircleCentered");//窗口名
		arg0.setScene(scene);
		arg0.show();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

}
