package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;

public class ModifierProduitsController implements Initializable{

	@FXML
	private ChoiceBox<String> ChoiceBoxAddType;
	@FXML
	private ChoiceBox<String> ChoiceBoxAddFamille;
	
	private String[] types = {"Tous", "Rouge","Rosé","Blanc", "Petillant", "Digestif"};
	private String[] famille = {"Tous", "Tariquet","Pelleheaut","Joy", "Vignoble Fontan", "Uby"};
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1)  {

		ChoiceBoxAddType.getItems().addAll(types);
		ChoiceBoxAddFamille.getItems().addAll(famille);
	}

}
