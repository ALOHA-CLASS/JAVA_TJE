module JavaFX_Calculator {
	requires java.base;
	requires javafx.fxml;
	requires javafx.controls;

	opens application to javafx.graphics, javafx.fxml, de.jensd.fx.glyphs;
}
