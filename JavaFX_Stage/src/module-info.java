module JavaFX_Stage {
	requires javafx.controls;
	
	opens application to javafx.graphics, javafx.fxml;
}
