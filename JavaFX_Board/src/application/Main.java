package application;
	
import application.util.SceneUtil;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage stage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);
			
			// 스테이지 설정
			Image icon = new Image("icon.png");
			stage.getIcons().add(icon);
			stage.setTitle("게시판");
			stage.setResizable(false);
			stage.show();
			
			// 닫기 요청 이벤트 처리
			stage.setOnCloseRequest(event -> {
				event.consume();			// 기존 이벤트(프로그램 종료)를 제거. consume "소멸시키다"
				SceneUtil.getInstance().close(stage);
			});
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

