module JavaFX_Scene {
	requires javafx.controls;
	
	opens application to javafx.graphics, javafx.fxml;
}
