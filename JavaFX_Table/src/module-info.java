module JavaFX_Table {
	requires javafx.base;
	requires javafx.controls;
	requires javafx.fxml;
	
	opens application to javafx.base, javafx.graphics, javafx.fxml;
}
