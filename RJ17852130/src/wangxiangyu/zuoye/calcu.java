package wangxiangyu.zuoye;

import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
 
public class calcu extends Application {
	Text text = new Text("");
 
	public void start(Stage pr) {
		text.setFill(Color.BLACK);
		text.setFont(Font.font("黑体", 30));
		String[] number = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
		Button[] b = new Button[10];
	
		Button[] m1 = new Button[5];
		String[] operate= {"/","X","-","+","="};
		Button[] o=new Button[5];
		GridPane gdpane = new GridPane();
		
		for(int i=0;i<5;i++) {
			o[i]=new Button(operate[i]);
			o[i].setPrefSize(80, 40);
			String s=operate[i].toString();     
			o[i].setOnAction(e->add(s));
		}
		
		
		Button ce = new Button("c");
		ce.setOnAction(e->add("ce"));
		
		for (int i = 0; i < 10; i++) {
			b[i] = new Button(number[i]);
			b[i].setPrefSize(80, 40);
			b[i].setStyle("-fx-base:white");
		}
 
		ce.setPrefSize(80, 40);
		
		ce.setStyle("-fx-base: white"); 			
	
		o[0].setStyle("-fx-base:white");  
		o[1].setStyle("-fx-base: white");
		o[2].setStyle("-fx-base: white");
		o[3].setStyle("-fx-base: white");
		o[4].setStyle("-fx-base: white");
		
		BorderPane pane = new BorderPane();
		pane.setPadding(new Insets(8, 8, 8, 8));
 
		HBox hbox = new HBox();
	
		BorderPane pane1 = new BorderPane();
		pane1.setRight(text);
		pane1.setBottom(hbox);
		pane.setTop(pane1);
 
		
		
		for(int i=0;i<5;i++)
			gdpane.add(o[i], 3, i+1);
		
		for (int i = 2, count = 7; i < 5; i++, count = count - 3)
			for (int j = 0; j < 3; j++)
				gdpane.add(b[count + j], j, i);
		gdpane.add(b[0], 1, 5);
		gdpane.add(ce, 0, 5);
		
	
		pane.setCenter(gdpane);
		for (int i = 0; i < 10; i++) {
			String carriage = String.valueOf(i);
			b[i].setOnAction(e -> add(carriage));
		}
		Scene scene = new Scene(pane);
		pr.setTitle("小小计算器"); 
		pr.setScene(scene);
		pr.show();
 
	}
 
	private void add(String s) {
		String out = "";
		if (text.getText().equals("0") || text.getText().equals("....."))
			text.setText("");
 
		switch (s) {
		case "ce":
			out = "0";
			break;
		case "±":
			try {
				out = String.valueOf(Integer.parseInt(text.getText()) * (-1));
			} catch (NumberFormatException e) {
				}
		break;
		case "+":
		case "-":
		case "X":		
		case "/":
			out = text.getText() + " " + s + " ";
			break;
		case "%":
			try {
				Float getNum = Float.parseFloat(text.getText());
				double setNum = Math.pow(getNum, 2d);
				if (setNum % 1 == 0)
					out = String.valueOf((int) setNum);
				else
					out = String.valueOf(setNum);
			} catch (NumberFormatException e) {
				System.err.println("Wrong Input");
				out = text.getText();
			}
			break;
		case "=":
			out = getResult();
			break;
		default:
			out = text.getText() + s;
			break;
		}
		text.setText(out);
	}
	private String getResult() {
		try {
			String[] textbox = text.getText().split(" ");
			float result = Float.parseFloat(textbox[0]);
			for (int i = 2; i < textbox.length; i += 2) {
				float num = Float.parseFloat(textbox[i]);
				switch (textbox[i - 1]) {
				case "+":
					result += num;
					break;
				case "-":
					result -= num;
					break;
				case "/":
					result = Float.parseFloat(textbox[i - 2]) / num;
					break;
				case "X":
					result *= num;
					break;
				}
			}
			if (result % 1 == 0)
				return String.valueOf((int) result);
			else
				return String.valueOf(result);
		} catch (NumberFormatException e) {
			System.err.println("wrong input || null String");
			return ".....";
		}
	}
 
	public static void main(String[] args) {
		Application.launch(args);
	}
 
}
