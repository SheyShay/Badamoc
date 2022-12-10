package controllers.Clients;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class AddClientsController implements Initializable{

	@FXML
    private TextField AddAdresseClient;

    @FXML
    private TextField AddEmailClient;

    @FXML
    private TextField AddIdClient;

    @FXML
    private TextField AddMdpClient;

    @FXML
    private TextField AddNomClient;

    @FXML
    private TextField AddPrenomClient;

    @FXML
    private AnchorPane PageAddClient;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1)  {

	}

}
