package project.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class PopUpTerraController implements Initializable {
    @FXML
    private BorderPane PopUpTerra;

    @FXML
    public void fecharPopUpTerra() throws IOException {
        Stage stage = (Stage) PopUpTerra.getScene().getWindow();
        stage.close();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
