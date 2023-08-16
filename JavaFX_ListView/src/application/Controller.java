package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

public class Controller implements Initializable {

	@FXML
	private ListView<String> myListView;
	
	@FXML
	private Label myLabel;
	
	String[] food = {"pizza", "sushi", "ramen"};
	
	String currentFood;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		myListView.getItems().addAll(food);
		
		// 더블클릭 이벤트
		myListView.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				// 더블 클릭
				if( event.getClickCount() == 2 ) {
					System.out.println("더블 클릭!!");
					currentFood = myListView.getSelectionModel().getSelectedItem();
					System.out.println("아이템 : " + currentFood);
				}
			}
		});
		
		myListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
				
				// 현재 선택한 아이템을 currentFood 로 지정
				currentFood = myListView.getSelectionModel().getSelectedItem();
				myLabel.setText(currentFood);
				
			}
			
		});
		
	}

	
	
}





