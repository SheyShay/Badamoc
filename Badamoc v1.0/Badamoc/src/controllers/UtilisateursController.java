package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class UtilisateursController implements Initializable{

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		ChoiceBoxRole.getItems().addAll(role);
		
		info();
	}
	
	/* -------------------------------------- Liste déroulante ----------------------------- */
	@FXML
	private ChoiceBox<String> ChoiceBoxRole;

	//L'admin à tous les droits
	// L'utilisateur peut créer et modifier mais pas supprimer
	// Le consultant peut seulement consulter mais ne peut ni créer, ni modifier ou supprimer
	private String[] role = {"Admin", "Utilisateur","Consultant"};
	
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
    private AnchorPane UtilisateursPage;
    
    private Parent fxml;

    @FXML
    void openClients(MouseEvent event) {
    	try {
			fxml = FXMLLoader.load(getClass().getResource("/interfaces/Clients.fxml"));
			UtilisateursPage.getChildren().removeAll();
			UtilisateursPage.getChildren().setAll(fxml);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML
    void openCommandes(MouseEvent event) {
    	try {
			fxml = FXMLLoader.load(getClass().getResource("/interfaces/Commandes.fxml"));
			UtilisateursPage.getChildren().removeAll();
			UtilisateursPage.getChildren().setAll(fxml);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML
    void openInventaires(MouseEvent event) {
    	try {
			fxml = FXMLLoader.load(getClass().getResource("/interfaces/Inventaire.fxml"));
			UtilisateursPage.getChildren().removeAll();
			UtilisateursPage.getChildren().setAll(fxml);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML
    void openProduit(MouseEvent event) {
    	try {
			fxml = FXMLLoader.load(getClass().getResource("/interfaces/Produits.fxml"));
			UtilisateursPage.getChildren().removeAll();
			UtilisateursPage.getChildren().setAll(fxml);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML
    void openUtilisateurs(MouseEvent event) {
    	try {
			fxml = FXMLLoader.load(getClass().getResource("/interfaces/Utilisateurs.fxml"));
			UtilisateursPage.getChildren().removeAll();
			UtilisateursPage.getChildren().setAll(fxml);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    @FXML
    void openHome(MouseEvent event) {
    	try {
			fxml = FXMLLoader.load(getClass().getResource("/interfaces/Home.fxml"));
			UtilisateursPage.getChildren().removeAll();
			UtilisateursPage.getChildren().setAll(fxml);
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