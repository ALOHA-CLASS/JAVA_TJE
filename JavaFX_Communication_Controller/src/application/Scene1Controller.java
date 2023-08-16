package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Scene1Controller {

	@FXML
	private TextField nameTextField;
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	
	public void login(ActionEvent event) throws IOException {
		
		String username = nameTextField.getText();
		
		// Scene2.fxml 읽어오기
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene2.fxml"));
		root = loader.load();
		
		// Scene2.fxml 에 연결된 Scene2Controller 가져오기
		Scene2Controller scene2Controller = loader.getController();
		scene2Controller.displayName(username);		// Scene2Controller 를 통해서 S1 의 TextFiled에서 입력한 이름 넘기기
		
		// root = FXMLLoader.load(getClass().getResource("Scene2.fxml"));
		stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

}









