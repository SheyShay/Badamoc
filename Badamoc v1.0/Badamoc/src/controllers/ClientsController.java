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
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ClientsController implements Initializable{

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		info();
		
		/* Remplissage de la table client */
		
		clientId.setCellValueFactory(new PropertyValueFactory<clients, Integer>("id"));
		clientNom.setCellValueFactory(new PropertyValueFactory<clients, String>("nom"));
		clientPrenom.setCellValueFactory(new PropertyValueFactory<clients, String>("prenom"));
		clientEmail.setCellValueFactory(new PropertyValueFactory<clients, String>("email"));
		clientMdp.setCellValueFactory(new PropertyValueFactory<clients, String>("mdp"));
		clientAdresse.setCellValueFactory(new PropertyValueFactory<clients, String>("adresse"));

		listM = ConnexionMySql.getDataclient();
		table_client.setItems(listM);
	}

	/* -------------------------------------- Liens pages ---------------------------------- */
	@FXML
    private AnchorPane ClientsPage;

	Stage stage;
	
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
    private Button AddClient;
    
    @FXML
    private Button DeleteClient;
    
    @FXML
    private Button UpdateClient;
    
    private Parent fxml;
    
    @FXML
    void ButtonAddClient(MouseEvent event){
    	ClientsPage.getScene().getWindow();
		Stage home = new Stage();
		home.setResizable(false);
    	try {
    		fxml = FXMLLoader.load(getClass().getResource("/fxmlClients/AddClients.fxml"));
			Scene scene = new Scene(fxml);
			home.setScene(scene);
			home.show();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    @FXML
    void ButtonDeleteClient(MouseEvent event) {
    	ClientsPage.getScene().getWindow();
		Stage home = new Stage();
		home.setResizable(false);
    	try {
    		fxml = FXMLLoader.load(getClass().getResource("/fxmlClients/SupprClients.fxml"));
			Scene scene = new Scene(fxml);
			home.setScene(scene);
			home.show();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML
    void ButtonUpdateClient(MouseEvent event) {
    	ClientsPage.getScene().getWindow();
		Stage home = new Stage();
		home.setResizable(false);
    	try {
    		fxml = FXMLLoader.load(getClass().getResource("/fxmlClients/ModifierClients.fxml"));
			Scene scene = new Scene(fxml);
			home.setScene(scene);
			home.show();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML
    void openClients(MouseEvent event) {
    	try {
			fxml = FXMLLoader.load(getClass().getResource("/interfaces/Clients.fxml"));
//			ClientsPage.getChildren().removeAll();
			ClientsPage.getChildren().setAll(fxml);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML
    void openCommandes(MouseEvent event) {
    	try {
			fxml = FXMLLoader.load(getClass().getResource("/interfaces/Commandes.fxml"));
			ClientsPage.getChildren().removeAll();
			ClientsPage.getChildren().setAll(fxml);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML
    void openInventaires(MouseEvent event) {
    	try {
			fxml = FXMLLoader.load(getClass().getResource("/interfaces/Inventaire.fxml"));
			ClientsPage.getChildren().removeAll();
			ClientsPage.getChildren().setAll(fxml);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML
    void openProduit(MouseEvent event) {
    	try {
			fxml = FXMLLoader.load(getClass().getResource("/interfaces/Produits.fxml"));
			ClientsPage.getChildren().removeAll();
			ClientsPage.getChildren().setAll(fxml);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML
    void openUtilisateurs(MouseEvent event) {
    	try {
			fxml = FXMLLoader.load(getClass().getResource("/interfaces/Utilisateurs.fxml"));
			ClientsPage.getChildren().removeAll();
			ClientsPage.getChildren().setAll(fxml);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    @FXML
    void openHome(MouseEvent event) {
    	try {
			fxml = FXMLLoader.load(getClass().getResource("/interfaces/Home.fxml"));
			ClientsPage.getChildren().removeAll();
			ClientsPage.getChildren().setAll(fxml);
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
    
    /* ------------------------------ Remplissage table client -------------------------- */
    
    @FXML
    private TableView<clients> table_client;

    @FXML
    private TableColumn<clients, Integer> clientId;
    
    @FXML
    private TableColumn<clients, String> clientNom;
    
    @FXML
    private TableColumn<clients, String> clientPrenom;
    
    @FXML
    private TableColumn<clients, String> clientEmail;

    @FXML
    private TableColumn<clients, String> clientMdp;

    @FXML
    private TableColumn<clients, String> clientAdresse;
    
    ObservableList<clients> listM;
    
    Connection cn = null;
    ResultSet rsClient = null;
    PreparedStatement pstClient = null;
      
}