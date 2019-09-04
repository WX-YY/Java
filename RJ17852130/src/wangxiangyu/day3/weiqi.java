package wangxiangyu.day3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


public class weiqi extends Application {

    public void start(Stage primaryStage) throws Exception {
        GridPane pane=new GridPane();
        for (int i=0;i<8;i++){
            for (int j=0;j<8;j++){
                Rectangle rectangle=new Rectangle();
                rectangle.setWidth(80);
                rectangle.setHeight(80);
                rectangle.setFill(Color.BLACK);
                if ((i+j)%2==1){
                    pane.add(rectangle,i,j);
                }
            }
        }
        Scene scene=new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }

     
    public static void main(String[] args)
    {
    	
        Application.launch(args);
        
    }
}