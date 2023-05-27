package project.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class PopUpUranoController implements Initializable {
    @FXML
    private BorderPane PopUpUrano;

    @FXML
    public void fecharPopUpUrano() throws IOException {
        Stage stage = (Stage) PopUpUrano.getScene().getWindow();
        stage.close();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
