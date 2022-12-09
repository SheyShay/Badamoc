package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;

public class DetailsCommandesController implements Initializable{

	@FXML
	private ChoiceBox<String> ChoiceBoxCommandesStatut;
	@FXML
	
	private String[] statut = {"Tous", "En cours","Livré"};

	@Override
	public void initialize(URL arg0, ResourceBundle arg1)  {

		ChoiceBoxCommandesStatut.getItems().addAll(statut);
	}
}
