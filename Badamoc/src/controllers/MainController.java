package controllers;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import application.ConnexionMySql;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainController implements Initializable{

	@FXML
	private Button BtnSinscrire;

	@FXML
	private Button btnConfirmer;

	@FXML
	private Button btnMdpOublié;

	@FXML
	private TextField mailConnect;

	@FXML
	private TextField mdpConnect;
	
	@FXML
	private AnchorPane MainPane;
	
	@FXML
	private Parent fxml;

	@FXML
	void btnPasswordForgoten(ActionEvent event) {

	}
	/* ----------------------------------- SE CONNECTER HOME ------------------------------------- */
	
	Connection cnx;
	
	public PreparedStatement st;
	public ResultSet result;
	
	@FXML
	void openHome() {
		String mail = mailConnect.getText();
		String pass = mdpConnect.getText();
		String sql = "select Mail, Mots_de_passe from utilisateur";
		try {
			st=cnx.prepareStatement(sql);
			result = st.executeQuery();
			if(result.next()) {
	/*			if(mail.equals(result.getString("Mail"))&&pass.equals(result.getString("Mots_de_passe"))) { */
			 	if(mail.equals("d")&&pass.equals("d")) {
					MainPane.getScene().getWindow().hide();
					Stage home = new Stage();
					home.setResizable(false);
					System.out.println("vous êtes connecté");
					
					try {
						fxml = FXMLLoader.load(getClass().getResource("/interfaces/Home.fxml"));
						Scene scene = new Scene(fxml);
						home.setScene(scene);
						home.show();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else {
					Alert alert = new Alert(AlertType.ERROR,"Mail utilisateur ou mdp incorrect", ButtonType.OK);
					alert.showAndWait();
				}
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}
	
	/* ----------------------------------- S'INSCRIRE ------------------------------------------- */
	@FXML
	void openInscription() {
		MainPane.getScene().getWindow().hide();
		Stage inscription = new Stage();
		inscription.setResizable(false);
		
		try {
			fxml = FXMLLoader.load(getClass().getResource("/interfaces/Inscription.fxml"));
			Scene scene = new Scene(fxml);
			inscription.setScene(scene);
			inscription.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	    
	@Override
	public void initialize(URL arg0, ResourceBundle arg1)  {
		cnx=ConnexionMySql.connexionDB();
	}
}