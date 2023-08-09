module TestFX {
	requires javafx.controls;
	requires javafx.fxml;			// javafx.fxml - import 에러 시 추가
	
	opens application to javafx.graphics, javafx.fxml;
}
