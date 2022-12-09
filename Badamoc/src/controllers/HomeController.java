package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class HomeController implements Initializable {

	@Override
	public void initialize(URL arg0, ResourceBundle arg1)  {
		info();
	}
	
	/* ------------------------------ Liens pages -------------------------------------- */

    @FXML
    private Text HomeClients;

    @FXML
    private Text HomeCommandes;

    @FXML
    private AnchorPane HomePage;

    @FXML
    private Text HomeUtilisateurs;

    @FXML
    private Text boxClients;

    @FXML
    private Text boxCommandes;

    @FXML
    private Text boxInventaire;

    @FXML
    private Text boxProduits;

    @FXML
    private Text boxUtilisateurs;

    @FXML
    private Text homeInventaire;

    @FXML
    private Text homeProduits;
    
    @FXML
    private Pane homeLogo;

    @FXML
    private ImageView imageUser;
    
    private Parent fxml;
    
    @FXML
    void openClients(MouseEvent event) {
    	try {
			fxml = FXMLLoader.load(getClass().getResource("/interfaces/Clients.fxml"));
			HomePage.getChildren().removeAll();
			HomePage.getChildren().setAll(fxml);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML
    void openCommandes(MouseEvent event) {
    	try {
			fxml = FXMLLoader.load(getClass().getResource("/interfaces/Commandes.fxml"));
			HomePage.getChildren().removeAll();
			HomePage.getChildren().setAll(fxml);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML
    void openInventaires(MouseEvent event) {
    	try {
			fxml = FXMLLoader.load(getClass().getResource("/interfaces/Inventaire.fxml"));
			HomePage.getChildren().removeAll();
			HomePage.getChildren().setAll(fxml);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML
    void openProduit(MouseEvent event) {
    	try {
			fxml = FXMLLoader.load(getClass().getResource("/interfaces/Produits.fxml"));
			HomePage.getChildren().removeAll();
			HomePage.getChildren().setAll(fxml);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML
    void openUtilisateurs(MouseEvent event) {
    	try {
			fxml = FXMLLoader.load(getClass().getResource("/interfaces/Utilisateurs.fxml"));
			HomePage.getChildren().removeAll();
			HomePage.getChildren().setAll(fxml);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    @FXML
    void openHome(MouseEvent event) {
    	try {
			fxml = FXMLLoader.load(getClass().getResource("/interfaces/Home.fxml"));
			HomePage.getChildren().removeAll();
			HomePage.getChildren().setAll(fxml);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    /* ------------------------------ Nom / Prenom -------------------------------------- */
    
    @FXML
    private Label Firstname;
    
    @FXML
    private Label Name;
    
    public void info() {
    	Firstname.setText("David");
    	Name.setText("Lansonneur");
    }
}

