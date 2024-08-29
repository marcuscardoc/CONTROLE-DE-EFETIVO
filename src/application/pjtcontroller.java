package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class pjtcontroller {
	 @FXML
	    private TextField usuario;

	    @FXML
	    private PasswordField senha;

	    @FXML
	    private Button entrarButton;

	    @FXML
	    private void handleLogin() throws IOException {
	        String usuarioo = usuario.getText();
	        String senhaa = senha.getText();

	        if (usuarioo.equals("admin") && senhaa.equals("admin")) {
	        	Stage stage = (Stage) entrarButton.getScene().getWindow();
	        	Parent root = FXMLLoader.load(getClass().getResource("telaprincipal.fxml"));
	        	stage.setScene(new Scene(root));
	        	//stage.setFullScreen(true);
	        	stage.show();
	        } else {
	           System.out.println("falhou");
	        }
	    }
	}

