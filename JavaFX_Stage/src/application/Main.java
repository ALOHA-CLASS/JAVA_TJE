package application;
	
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Main extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		
		// Stage stage = new Stage();
		Group root = new Group();
		Scene scene = new Scene(root, Color.BLACK);

		Image icon = new Image("icon.png");
		stage.getIcons().add(icon);
		stage.setTitle("프로그램 제목");		// 윈도우의 제목
		stage.setWidth(420);
		stage.setHeight(420);
		stage.setResizable(false);
		// stage.setX(50);
		// stage.setY(50);
		stage.setFullScreen(true);
		stage.setFullScreenExitHint("전체 화면 종료 (Q)");
		stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("Q"));
		stage.setScene(scene);
		stage.show();
	}
	
}





