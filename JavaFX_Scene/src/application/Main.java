package application;
	

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
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
		rectangle.setX(380);
		rectangle.setY(150);
		rectangle.setWidth(100);
		rectangle.setHeight(100);
		rectangle.setFill(Color.SPRINGGREEN);
		
		Polygon triangle = new Polygon();
		triangle.getPoints()
				.setAll(100.0, 150.0,
						200.0, 250.0,
						100.0, 250.0);
		triangle.setFill(Color.YELLOW);

		Circle circle = new Circle();
		circle.setCenterX(280);
		circle.setCenterY(200);
		circle.setRadius(50);
		circle.setFill(Color.ORANGE);
		
		Image image = new Image("icon.png");
		ImageView imageView = new ImageView(image);
		imageView.setFitWidth(240);
		imageView.setFitHeight(240);
		imageView.setX(320);
		imageView.setY(280);
	
		root.getChildren().add(text);
		root.getChildren().add(line);
		root.getChildren().add(line2);
		root.getChildren().add(rectangle);
		root.getChildren().add(triangle);
		root.getChildren().add(circle);
		root.getChildren().add(imageView);
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
