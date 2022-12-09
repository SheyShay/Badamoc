package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class ModifierClientsController implements Initializable{

	@FXML
    private Button CancelModifyClient;

    @FXML
    private TextField ModifyAdresseClient;

    @FXML
    private TextField ModifyEmailClient;

    @FXML
    private TextField ModifyIdClient;

    @FXML
    private TextField ModifyMdpClient;

    @FXML
    private TextField ModifyNomClient;

    @FXML
    private TextField ModifyPrenomClient;

    @FXML
    private Button OkModifyClient;

    @FXML
    private AnchorPane PageModifyClient;

    @FXML
    void ButtonCancelModifyClient(MouseEvent event) {

    }

    @FXML
    void ButtonOkModifyClient(MouseEvent event) {

    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1)  {

	}

}
