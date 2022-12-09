package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class InscriptionController implements Initializable {

	@FXML
    private AnchorPane Inscription;

    @FXML
    private TextField MailInscription;

    @FXML
    private TextField MdpInscription;

    @FXML
    private TextField NomInscription;

    @FXML
    private TextField PrenomInscription;

    @FXML
    private Button btnInscription;

    @FXML
    private Button btnSeConnecter;
    
    private Parent fxml;
    
    @FXML
    void Sinscire() {
    	
    }

    @FXML
    void SeConnecter() {
    	try {
			fxml = FXMLLoader.load(getClass().getResource("/interfaces/Main.fxml"));
			Inscription.getChildren().removeAll();
			Inscription.getChildren().setAll(fxml);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
	@Override
	public void initialize(URL arg0, ResourceBundle arg1)  {

	}

}
