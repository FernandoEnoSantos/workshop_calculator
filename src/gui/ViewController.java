package gui;

import java.net.URL;
import java.util.ResourceBundle;

import gui.util.Calculations;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ViewController implements Initializable {

	private boolean isEqualsClicked;
	
	private Calculations calc = new Calculations();

	@FXML
	private Label screenResult;

	@FXML
	private Button bt0;

	@FXML
	private Button bt1;

	@FXML
	private Button bt2;

	@FXML
	private Button bt3;

	@FXML
	private Button bt4;

	@FXML
	private Button bt5;

	@FXML
	private Button bt6;

	@FXML
	private Button bt7;

	@FXML
	private Button bt8;

	@FXML
	private Button bt9;

	@FXML
	private Button sum;

	@FXML
	private Button sub;

	@FXML
	private Button div;

	@FXML
	private Button times;

	@FXML
	private Button equals;

	@FXML
	public void onBt0Action() {

		
		if(isEqualsClicked == true) {
			screenResult.setText("");
			isEqualsClicked = false;
		}
		
		screenResult.setText(screenResult.getText().concat("0"));
		calc.midSum = calc.numberBuilder(0.0, calc.midSum);
		System.out.println(calc.midSum);
	}

	@FXML 
	public void onBt1Action() {

		if(isEqualsClicked == true) {
			screenResult.setText("");
			isEqualsClicked = false;
		}
		
		screenResult.setText(screenResult.getText().concat("1"));
		calc.midSum = calc.numberBuilder(1.0, calc.midSum);
		System.out.println(calc.midSum);

	}

	@FXML
	public void onBt2Action() {
		if(isEqualsClicked == true) {
			screenResult.setText("");
			isEqualsClicked = false;
		}
		
		screenResult.setText(screenResult.getText().concat("2"));
		calc.midSum = calc.numberBuilder(2.0, calc.midSum);
		System.out.println(calc.midSum);

	}

	@FXML
	public void onBt3Action() {
		if(isEqualsClicked == true) {
			screenResult.setText("");
			isEqualsClicked = false;
		}
		
		screenResult.setText(screenResult.getText().concat("3"));
		calc.midSum = calc.numberBuilder(3.0, calc.midSum);
		System.out.println(calc.midSum);
	}

	@FXML
	public void onBt4Action() {
		if(isEqualsClicked == true) {
			screenResult.setText("");
			isEqualsClicked = false;
		}
		
		screenResult.setText(screenResult.getText().concat("4"));
		calc.midSum = calc.numberBuilder(4.0, calc.midSum);
		System.out.println(calc.midSum);
	}

	@FXML
	public void onBt5Action() {
		if(isEqualsClicked == true) {
			screenResult.setText("");
			isEqualsClicked = false;
		}
		
		screenResult.setText(screenResult.getText().concat("5"));
		calc.midSum = calc.numberBuilder(5.0, calc.midSum);
		System.out.println(calc.midSum);
	}

	@FXML
	public void onBt6Action() {
		if(isEqualsClicked == true) {
			screenResult.setText("");
			isEqualsClicked = false;
		}
		
		screenResult.setText(screenResult.getText().concat("6"));
		calc.midSum = calc.numberBuilder(6.0, calc.midSum);
		System.out.println(calc.midSum);
	}

	@FXML
	public void onBt7Action() {
		if(isEqualsClicked == true) {
			screenResult.setText("");
			isEqualsClicked = false;
		}
		
		screenResult.setText(screenResult.getText().concat("7"));
		calc.midSum = calc.numberBuilder(7.0, calc.midSum);
		System.out.println(calc.midSum);
	}

	@FXML
	public void onBt8Action() {
		if(isEqualsClicked == true) {
			screenResult.setText("");
			isEqualsClicked = false;
		}
		
		screenResult.setText(screenResult.getText().concat("8"));
		calc.midSum = calc.numberBuilder(8.0, calc.midSum);
		System.out.println(calc.midSum);
	}

	@FXML
	public void onBt9Action() {
		if(isEqualsClicked == true) {
			screenResult.setText("");
			isEqualsClicked = false;
		}
		
		screenResult.setText(screenResult.getText().concat("9"));
		calc.midSum = calc.numberBuilder(9.0, calc.midSum);
		System.out.println(calc.midSum);
	}

	@FXML // TODO: implementar multiplicação e a ordem prioritária de operações
	public void obBtSumAction() {
		
		screenResult.setText(screenResult.getText().concat("+"));
		calc.Equals();
		calc.booleanReset();
		calc.isSum = true;
		
		
		calc.midSum = 0.0;
		System.out.println(calc.totalSum);

	}

	@FXML
	public void obBtSubAction() {
		screenResult.setText(screenResult.getText().concat("-"));
		calc.Equals();
		calc.booleanReset();
		calc.isSub = true;
		
		
		calc.midSum = 0.0;
		System.out.println(calc.totalSum);

	}

	@FXML
	public void obBtDivAction() {
		screenResult.setText(screenResult.getText().concat("/"));
		calc.Equals();
		calc.booleanReset();
		calc.isDiv = true;
		
		
		calc.midSum = 0.0;
		System.out.println(calc.totalSum);

	}

	@FXML
	public void obBtTimesAction() {
		screenResult.setText(screenResult.getText().concat("*"));
		calc.Equals();
		calc.booleanReset();
		calc.isTimes = true;
		
		
		calc.midSum = 0.0;
		System.out.println(calc.totalSum);

	}

	@FXML
	public void onBtEqualsAction() {
		
		calc.Equals();
		calc.booleanReset();

		screenResult.setText(String.valueOf(calc.totalSum));
		System.out.println(calc.totalSum);

		calc.totalSum = 0.0;
		calc.midSum = 0.0;
		
		calc.setFirstTime();
		isEqualsClicked = true;
	}

	@Override
	public void initialize(URL uri, ResourceBundle rb) {
		// TODO Auto-generated method stub

	}

}
