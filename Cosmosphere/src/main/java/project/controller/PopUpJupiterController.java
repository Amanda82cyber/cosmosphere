package project.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class PopUpJupiterController implements Initializable {
    @FXML
    private BorderPane PopUpJupiter;

    @FXML
    public void fecharPopUpJupiter() throws IOException {
        Stage stage = (Stage) PopUpJupiter.getScene().getWindow();
        stage.close();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
