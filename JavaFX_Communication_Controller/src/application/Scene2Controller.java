package application;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class Scene2Controller {
	
	@FXML
	TextArea nameArea;
	
	public void displayName(String username) {
		nameArea.setText(username);
	}
	

}
