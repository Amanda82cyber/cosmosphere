package project.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class PopUpMarteController implements Initializable {

    @FXML
    private BorderPane PopUpMarte;

    @FXML
    public void fecharPopUpMarte() throws IOException {
        Stage stage = (Stage) PopUpMarte.getScene().getWindow();
        stage.close();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
