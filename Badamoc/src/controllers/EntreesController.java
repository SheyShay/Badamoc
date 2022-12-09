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

public class EntreesController implements Initializable{

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		ChoiceBoxType.getItems().addAll(types);
		ChoiceBoxFamille.getItems().addAll(famille);
		info();
	}
	
	/* -------------------------------------- Liste déroulante ----------------------------- */
	@FXML
	private ChoiceBox<String> ChoiceBoxType;
	@FXML
	private ChoiceBox<String> ChoiceBoxFamille;
	
	private String[] types = {"Tous", "Rouge","Rosé","Blanc", "Petillant", "Digestif"};
	private String[] famille = {"Tous", "Tariquet","Pelleheaut","Joy", "Vignoble Fontan", "Uby"};
	
	/* -------------------------------------- Liens pages ----------------------------------- */
	
	@FXML
    private Text Entrees;

    @FXML
    private Text HomeClients;

    @FXML
    private Text HomeCommandes;

    @FXML
    private Text HomeUtilisateurs;

    @FXML
    private Text Inventaires;
    
    @FXML
    private Text Sorties;

    @FXML
    private Text homeInventaire;

    @FXML
    private Pane homeLogo;

    @FXML
    private Text homeProduits;

    @FXML
    private ImageView imageUser;
    
    @FXML
    private AnchorPane EntreesPage;

    private Parent fxml;

    @FXML
    void openClients(MouseEvent event) {
    	try {
			fxml = FXMLLoader.load(getClass().getResource("/interfaces/Clients.fxml"));
			EntreesPage.getChildren().removeAll();
			EntreesPage.getChildren().setAll(fxml);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML
    void openCommandes(MouseEvent event) {
    	try {
			fxml = FXMLLoader.load(getClass().getResource("/interfaces/Commandes.fxml"));
			EntreesPage.getChildren().removeAll();
			EntreesPage.getChildren().setAll(fxml);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML
    void openInventaires(MouseEvent event) {
    	try {
			fxml = FXMLLoader.load(getClass().getResource("/interfaces/Inventaire.fxml"));
			EntreesPage.getChildren().removeAll();
			EntreesPage.getChildren().setAll(fxml);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML
    void openProduit(MouseEvent event) {
    	try {
			fxml = FXMLLoader.load(getClass().getResource("/interfaces/Produits.fxml"));
			EntreesPage.getChildren().removeAll();
			EntreesPage.getChildren().setAll(fxml);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML
    void openUtilisateurs(MouseEvent event) {
    	try {
			fxml = FXMLLoader.load(getClass().getResource("/interfaces/Utilisateurs.fxml"));
			EntreesPage.getChildren().removeAll();
			EntreesPage.getChildren().setAll(fxml);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    @FXML
    void openHome(MouseEvent event) {
    	try {
			fxml = FXMLLoader.load(getClass().getResource("/interfaces/Home.fxml"));
			EntreesPage.getChildren().removeAll();
			EntreesPage.getChildren().setAll(fxml);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    @FXML
    void inventairesEntrees(MouseEvent event) {
    	try {
			fxml = FXMLLoader.load(getClass().getResource("/interfaces/Entrees.fxml"));
			EntreesPage.getChildren().removeAll();
			EntreesPage.getChildren().setAll(fxml);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML
    void inventairesInventaires(MouseEvent event) {
    	try {
			fxml = FXMLLoader.load(getClass().getResource("/interfaces/Inventaire.fxml"));
			EntreesPage.getChildren().removeAll();
			EntreesPage.getChildren().setAll(fxml);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML
    void inventairesSorties(MouseEvent event) {
    	try {
			fxml = FXMLLoader.load(getClass().getResource("/interfaces/Sorties.fxml"));
			EntreesPage.getChildren().removeAll();
			EntreesPage.getChildren().setAll(fxml);
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