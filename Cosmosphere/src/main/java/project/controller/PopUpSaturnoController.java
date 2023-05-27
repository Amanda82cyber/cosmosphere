package project.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class PopUpSaturnoController implements Initializable {
    @FXML
    private BorderPane PopUpSaturno;

    @FXML
    public void fecharPopUpSaturno() throws IOException {
        Stage stage = (Stage) PopUpSaturno.getScene().getWindow();
        stage.close();
    }
  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
