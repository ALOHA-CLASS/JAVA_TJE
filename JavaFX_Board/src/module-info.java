module JavaFX_Board {
	requires javafx.base;
	requires javafx.controls;
	requires javafx.fxml;
	requires java.sql;
	
	opens application to javafx.base, javafx.graphics, javafx.fxml;
	opens application.controller to javafx.fxml;
	opens application.DTO to javafx.base;
	
}


