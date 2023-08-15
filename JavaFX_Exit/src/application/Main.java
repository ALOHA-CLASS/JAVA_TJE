package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage stage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Scene.fxml"));
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
			
			// 닫기 요청(X 버튼클릭) 시, logout 메소드 호출 되도록 지정
			stage.setOnCloseRequest(event -> {
				event.consume();			// 기존 이벤트(프로그램 종료)를 제거. consume "소멸시키다"
				logout(stage);
			});
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void logout(Stage stage) {
		System.out.println("click logout...");
		
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Logout");
		alert.setHeaderText("You're about to logout!");
		alert.setContentText("Do you want to save before exiting?");
		
		if( alert.showAndWait().get() == ButtonType.OK ) {
			System.out.println("You successfully logged out!");
			stage.close();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
