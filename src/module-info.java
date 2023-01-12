module workshopjavajdbc {
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;
	
	opens application to javafx.graphics, javafx.fxml;
	opens gui to javafx.fxml;
	opens gui.util to javafx.fxml;
	
	exports gui to javafx.fxml;
	exports gui.util to javafx.fxml;
	
}