package project.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class PopUpSairController implements Initializable {
    @FXML
    private BorderPane popUpSair;
    
    @FXML
    public void fecharPopUp() throws IOException {
        Stage stage = (Stage) popUpSair.getScene().getWindow();
        stage.close();
    }
    
    @FXML
    public void sair() throws IOException {
        Platform.exit();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
