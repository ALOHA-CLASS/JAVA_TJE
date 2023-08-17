package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Controller {
	
	@FXML private AnchorPane container;
	@FXML private Pane titlePane;
    @FXML private ImageView btnMinimize, btnClose;
    @FXML private Label labelResult;

    private double x, y;
    private double num1 = 0;
    private String operator = "+";
	
	public void init(Stage stage) {
		container.setOnMousePressed(mouseEvent -> {
            x = mouseEvent.getSceneX();
            y = mouseEvent.getSceneY();
        });
        container.setOnMouseDragged(mouseEvent -> {
            stage.setX(mouseEvent.getScreenX()-x);
            stage.setY(mouseEvent.getScreenY()-y);
        });

        btnClose.setOnMouseClicked(mouseEvent -> stage.close());
        btnMinimize.setOnMouseClicked(mouseEvent -> stage.setIconified(true));
    }
	
	
	@FXML
    void onNumberClicked(MouseEvent event) {
        int value = Integer.parseInt(((Pane)event.getSource()).getId().replace("btn",""));
        labelResult.setText(Double.parseDouble(labelResult.getText())==0?String.valueOf((double)value):String.valueOf(Double.parseDouble(labelResult.getText())*10+value));
    }
	
	@FXML
	void onSymbolClicked(MouseEvent event) {
			String symbol = ((Pane)event.getSource()).getId().replace("btn","");
			System.out.println(symbol);
	        if(symbol.equals("Equals")) {
	            double num2 = Double.parseDouble(labelResult.getText());
	            switch(operator) {
	                case "+" : labelResult.setText((num1+num2) + ""); break;
	                case "-" : labelResult.setText((num1-num2) + ""); break;
	                case "*" : labelResult.setText((num1*num2) + ""); break;
	                case "/" : labelResult.setText((num1/num2) + ""); break;
	            }
	            operator = ".";
	        }
	        else if(symbol.equals("Clear")) {
	            labelResult.setText(String.valueOf(0.0));
	            operator = ".";
	        }
	        else {
	            switch (symbol) {
	                case "Plus" : operator = "+"; break;
	                case "Minus" : operator = "-"; break;
	                case "Multiply" : operator = "*"; break;
	                case "Divide" : operator = "/"; break;
	            }
	            num1 = Double.parseDouble(labelResult.getText());
	            labelResult.setText(String.valueOf(0.0));
	        }
	    }
	
}












