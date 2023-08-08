package application;
	

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		Group root = new Group();
		Scene scene = new Scene(root, 600, 600, Color.BLACK);
		Stage stage = new Stage();
		
		Text text = new Text();
		text.setText("Hello Java FX!");
		text.setX(100);
		text.setY(100);
		text.setFont(Font.font("Consolas", 50));
		text.setFill(Color.LIME);
		
		Line line = new Line();
		line.setStartX(100);
		line.setStartY(120);
		line.setEndX(480);
		line.setEndY(120);
		line.setStroke(Color.LIME);

		Line line2 = new Line();
		line2.setStartX(0);
		line2.setStartY(600);
		line2.setEndX(600);
		line2.setEndY(400);
		line2.setStrokeWidth(5);
		line2.setStroke(Color.LIME);
		line2.setRotate(35);
		
		Rectangle rectangle = new Rectangle();
		rectangle.setX(400);
		rectangle.setY(200);
		rectangle.setWidth(100);
		rectangle.setHeight(100);
		rectangle.setFill(Color.SPRINGGREEN);
		
		// Polygon 부터 할것...
	
		root.getChildren().add(text);
		root.getChildren().add(line);
		root.getChildren().add(line2);
		root.getChildren().add(rectangle);
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
