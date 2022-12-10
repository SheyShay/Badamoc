package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CommandesController implements Initializable{

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		ChoiceBoxStatut.getItems().addAll(statut);
		info();
	}
	
	/* -------------------------------------- Liste déroulante ----------------------------- */
	@FXML
	private ChoiceBox<String> ChoiceBoxStatut;

	//L'admin à tous les droits
	// L'utilisateur peut créer et modifier mais pas supprimer
	// Le consultant peut seulement consulter mais ne peut ni créer, ni modifier ou supprimer
	private String[] statut = {"Tous", "En cours","Livré"};
	
	/* -------------------------------------- Liens pages ---------------------------------- */

    @FXML
    private Text HomeClients;

    @FXML
    private Text HomeCommandes;

    @FXML
    private Text HomeUtilisateurs;

    @FXML
    private Text homeInventaire;

    @FXML
    private Pane homeLogo;

    @FXML
    private Text homeProduits;

    @FXML
    private ImageView imageUser;
    
    @FXML
    private AnchorPane CommandesPage;
    
    private Parent fxml;
    
    @FXML
    void buttonAjouterCommande(MouseEvent event) {

    }

    @FXML
    void buttonModifierCommande(MouseEvent event) {

    }

    @FXML
    void buttonSupprimerCommande(MouseEvent event) {
    	CommandesPage.getScene().getWindow();
		Stage home = new Stage();
		home.setResizable(false);
    	try {
    		fxml = FXMLLoader.load(getClass().getResource("/fxmlCommandes/SupprCommandes.fxml"));
			Scene scene = new Scene(fxml);
			home.setScene(scene);
			home.show();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML
    void buttonVoirCommande(MouseEvent event) {

    }

    @FXML
    void openClients(MouseEvent event) {
    	try {
			fxml = FXMLLoader.load(getClass().getResource("/interfaces/Clients.fxml"));
			CommandesPage.getChildren().removeAll();
			CommandesPage.getChildren().setAll(fxml);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML
    void openCommandes(MouseEvent event) {
    	try {
			fxml = FXMLLoader.load(getClass().getResource("/interfaces/Commandes.fxml"));
			CommandesPage.getChildren().removeAll();
			CommandesPage.getChildren().setAll(fxml);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML
    void openInventaires(MouseEvent event) {
    	try {
			fxml = FXMLLoader.load(getClass().getResource("/interfaces/Inventaire.fxml"));
			CommandesPage.getChildren().removeAll();
			CommandesPage.getChildren().setAll(fxml);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML
    void openProduit(MouseEvent event) {
    	try {
			fxml = FXMLLoader.load(getClass().getResource("/interfaces/Produits.fxml"));
			CommandesPage.getChildren().removeAll();
			CommandesPage.getChildren().setAll(fxml);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML
    void openUtilisateurs(MouseEvent event) {
    	try {
			fxml = FXMLLoader.load(getClass().getResource("/interfaces/Utilisateurs.fxml"));
			CommandesPage.getChildren().removeAll();
			CommandesPage.getChildren().setAll(fxml);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    @FXML
    void openHome(MouseEvent event) {
    	try {
			fxml = FXMLLoader.load(getClass().getResource("/interfaces/Home.fxml"));
			CommandesPage.getChildren().removeAll();
			CommandesPage.getChildren().setAll(fxml);
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