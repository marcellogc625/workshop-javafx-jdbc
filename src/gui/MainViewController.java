package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;

public class MainViewController implements Initializable {
    
    @FXML
    private MenuItem menuItemAbout;
    
    @FXML
    private MenuItem menuItemDepartment;
    
    @FXML
    private MenuItem menuItemSeller;
    
    @FXML
    public void onMenuItemAboutAction() {
	loadView("/gui/About.fxml");
    }
    
    @FXML
    public void onMenuItemDepartmentAction() {
	
    }

    @FXML
    public void onMenuItemSellerAction() {
	
    }
    
    @Override
    public void initialize(URL uri, ResourceBundle rb) {
	
	
    }

    private void loadView(String absoluteView) {
	try {
	    FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteView));
	    VBox newVBox = loader.load();
	    
	    Scene mainScene = Main.getMainScene();
	    VBox mainVBox = (VBox) ((ScrollPane) mainScene.getRoot()).getContent();
	    
	    Node mainMenu = mainVBox.getChildren().get(0);
	    mainVBox.getChildren().clear();
	    mainVBox.getChildren().add(mainMenu);
	    mainVBox.getChildren().addAll(newVBox.getChildren());
	}
	
	catch(IOException e) {
	    Alerts.showAlert("IO Exception", "Error loading view", e.getMessage(), AlertType.ERROR);
	}
    }
    
}