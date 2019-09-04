package wangxiangyu.day5;

import javafx.application.Application;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.stage.Stage;

public class ObservablePropertyDemo extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
DoubleProperty balance = new SimpleDoubleProperty();
balance.addListener(new InvalidationListener() {
	
	@Override
	public void invalidated(Observable observable) {
		// TODO Auto-generated method stub
		System.out.println("The new value is "+balance.doubleValue());
	}
});
balance.set(4.5);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Application.launch(args);
	}

}
