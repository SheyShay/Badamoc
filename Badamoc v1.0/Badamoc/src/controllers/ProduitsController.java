package controllers;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

import application.ConnexionMySql;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class ProduitsController implements Initializable{
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		ChoiceBoxType.getItems().addAll(types);
		ChoiceBoxFamille.getItems().addAll(famille);
		ChoiceBoxDates.getItems().addAll(date);
		
		info();
		
		/* Remplissage de la table produits / Erreur a voir */
		
		numArticles.setCellValueFactory(new PropertyValueFactory<articles, Integer>("idArticle"));
	/*	nomArticles.setCellValueFactory(new PropertyValueFactory<articles, String>("nameArticle")); */

		
		listM = ConnexionMySql.getDataarticle();
		table_articles.setItems(listM);
		
	}
	
	/* -------------------------------------- Liste déroulante ----------------------------- */
	@FXML
	private ChoiceBox<String> ChoiceBoxType;
	@FXML
	private ChoiceBox<String> ChoiceBoxFamille;
	@FXML
	private ChoiceBox<String> ChoiceBoxDates;
	
	private String[] types = {"Tous", "Rouge","Rosé","Blanc", "Petillant", "Digestif"};
	private String[] famille = {"Tous", "Tariquet","Pelleheaut","Joy", "Vignoble Fontan", "Uby"};
	private String[] date = {"Tous", "2022","2021","2020", "2019", "2018"};
	
	
	/* -------------------------------------- Liens pages ----------------------------- */

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
    private AnchorPane ProduitsPage;
    
    private Parent fxml;

    @FXML
    void openClients(MouseEvent event) {
    	try {
			fxml = FXMLLoader.load(getClass().getResource("/interfaces/Clients.fxml"));
			ProduitsPage.getChildren().removeAll();
			ProduitsPage.getChildren().setAll(fxml);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML
    void openCommandes(MouseEvent event) {
    	try {
			fxml = FXMLLoader.load(getClass().getResource("/interfaces/Commandes.fxml"));
			ProduitsPage.getChildren().removeAll();
			ProduitsPage.getChildren().setAll(fxml);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML
    void openInventaires(MouseEvent event) {
    	try {
			fxml = FXMLLoader.load(getClass().getResource("/interfaces/Inventaire.fxml"));
			ProduitsPage.getChildren().removeAll();
			ProduitsPage.getChildren().setAll(fxml);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML
    void openProduit(MouseEvent event) {
    	try {
			fxml = FXMLLoader.load(getClass().getResource("/interfaces/Produits.fxml"));
			ProduitsPage.getChildren().removeAll();
			ProduitsPage.getChildren().setAll(fxml);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML
    void openUtilisateurs(MouseEvent event) {
    	try {
			fxml = FXMLLoader.load(getClass().getResource("/interfaces/Utilisateurs.fxml"));
			ProduitsPage.getChildren().removeAll();
			ProduitsPage.getChildren().setAll(fxml);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    @FXML
    void openHome(MouseEvent event) {
    	try {
			fxml = FXMLLoader.load(getClass().getResource("/interfaces/Home.fxml"));
			ProduitsPage.getChildren().removeAll();
			ProduitsPage.getChildren().setAll(fxml);
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
    
    /* ------------------------------ Remplissage table -------------------------------------- */
    
    @FXML
    private TableView<articles> table_articles;

    @FXML
    private TableColumn<articles, Integer> numArticles;
    
    @FXML
    private TableColumn<articles, String> nomArticles;
    
    @FXML
    private TableColumn<articles, String> description;
    
    @FXML
    private TableColumn<articles, String> familles;
    
    @FXML
    private TableColumn<articles, String> type;

    @FXML
    private TableColumn<articles, Integer> prixAchat;
    
    @FXML
    private TableColumn<articles, Integer> quantites;
    
    @FXML
    private TableColumn<articles, Integer> prixVente;
    
    int idArticle;
    int prixAchatArticle, prixVenteArticle, quantiteArticle;
    String nameArticle, descriptionArticle, familleArticle, typeArticle;
    
    ObservableList<articles> listM;
    
    int index = -1;
    
    Connection cn = null;
    ResultSet rs = null;
    
    PreparedStatement pst = null;
        
}