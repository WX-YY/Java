package wangxiangyu.day4;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class LoanCalculator extends Application {
	private TextField tfAnnualInterestRate = new TextField();
	private TextField tfNumberOfYears = new TextField();
	private TextField tfLoanAmount = new TextField();
	private TextField tfMonthlyPayment = new TextField();
	private TextField tfTotalPayment = new TextField();
	private Button btCalculate = new Button("Calculate"); 

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		GridPane gridPane = new GridPane();
		gridPane.setHgap(5);
		gridPane.setVgap(5);
		gridPane.add(new Label("年利率:"), 0, 0);
		gridPane.add(tfAnnualInterestRate, 1, 0);
		gridPane.add(new Label("年数:"), 0, 1);
		gridPane.add(tfNumberOfYears, 1, 1);
		gridPane.add(new Label("贷款金额:"), 0, 2);
		gridPane.add(tfLoanAmount, 1, 2);
		gridPane.add(new Label("每月支付:"), 0, 3);
		gridPane.add(tfMonthlyPayment, 1, 3);
		gridPane.add(new Label("总付款:"), 0, 4);
		gridPane.add(tfTotalPayment, 1, 4);
		gridPane.add(btCalculate, 1, 5);
		// Set properties for UI
		gridPane.setAlignment(Pos.CENTER);
		tfAnnualInterestRate.setAlignment(Pos.BOTTOM_RIGHT);
		tfNumberOfYears.setAlignment(Pos.BOTTOM_RIGHT);
		tfLoanAmount.setAlignment(Pos.BOTTOM_RIGHT);
		tfMonthlyPayment.setAlignment(Pos.BOTTOM_RIGHT);
		tfTotalPayment.setAlignment(Pos.BOTTOM_RIGHT);
		tfMonthlyPayment.setEditable(false);
		tfTotalPayment.setEditable(false);
		GridPane.setHalignment(btCalculate, HPos.RIGHT);
		// Process events
		btCalculate.setOnAction(e -> calculateLoanPayment());
		// Create a scene and place it in the stage
		Scene scene = new Scene(gridPane, 400, 250);
		primaryStage.setTitle("LoanCalculator");
		primaryStage.setScene(scene);
		primaryStage.show();
		}
	private void calculateLoanPayment() { 
		// Get values from text fields
		double interest = Double.parseDouble(tfAnnualInterestRate.getText());
		int year = Integer.parseInt(tfNumberOfYears.getText());
		double loanAmount = Double.parseDouble(tfLoanAmount.getText());
		// Create a loan object. Loan defined in Listing 10.2
		Loan loan = new Loan(interest, year, loanAmount);
		// Display monthly payment and total payment
		tfMonthlyPayment.setText(String.format("￥%.2f",loan.getMonthlyPayment()));
		tfTotalPayment.setText(String.format("￥%.2f",loan.getTotalPayment()));
		}

	
class Loan {
	private double inter;
	private int year;
	private double loan;

	public Loan(double inter, int year, double loan) {
		
		this.inter = inter;
		this.year = year;
		this.loan = loan;
	}
	public double getMonthlyPayment(){
		return loan*(1+inter)/12;
	}
	public double getTotalPayment(){
		return loan*(1+inter)*year;
	}

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Application.launch(args);
	}

}
