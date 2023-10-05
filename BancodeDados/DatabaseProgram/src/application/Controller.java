package application;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controller implements Initializable {

    @FXML
    private Button close;

    @FXML
    private Button loginBtch;

    @FXML
    private AnchorPane main_form;

    @FXML
    private PasswordField password;

    @FXML
    private TextField username;

    private final static String sql = "SELECT * FROM admin WHERE username = ? AND password = ?";
    
    private Connection connect;
    private PreparedStatement prepare;
    private ResultSet result;
    
    public void loginAdmin() throws IOException {
    	try {
			prepare = connect.prepareStatement(sql);
			prepare.setString(1,username.getText());
			prepare.setString(2,password.getText());
			
			result = prepare.executeQuery();
			
			Alert alert;
			
			if(username.getText().isEmpty() || password.getText().isEmpty()) {
				alert = new Alert(AlertType.ERROR);
				alert.setTitle("Error Message");
				alert.setHeaderText(null);
				alert.setContentText("Please fill all blank fields");
				
			} else {
				if(result.next()) {
					alert = new Alert(AlertType.INFORMATION);
					alert.setTitle("Information Message");
					alert.setHeaderText(null);
					alert.setContentText("Sucessfull Login");
					
					loginBtch.getScene().getWindow().hide();
					Parent root = FXMLLoader.load(getClass().getResource("Teladealter.fxml"));
					Stage stage = new Stage();
					Scene scene = new Scene(root);
					stage.setScene(scene);
					stage.show();
					
				} else {
					alert = new Alert(AlertType.ERROR);
					alert.setTitle("Error Message");
					alert.setHeaderText(null);
					alert.setContentText("Wrong username/password");
				}
			}
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	
    }
    
    
    public void close() {
    	System.exit(0);
    }
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
			
		
	}
	
	
	
	
}
