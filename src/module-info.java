module workshopjavajdbc {
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;
	requires java.sql;
	
	opens application to javafx.graphics, javafx.fxml;
	opens gui to javafx.fxml;
	opens gui.util to javafx.fxml;
	opens model.entities to javafx.base, javafx.fxml;
	opens model.services to javafx.base, javafx.fxml;
	
	exports gui to javafx.fxml;
	exports gui.util to javafx.fxml;
	exports model.entities to javafx.fxml;
	exports model.services to javafx.fxml;
	
}