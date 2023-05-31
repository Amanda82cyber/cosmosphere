package project.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class PopUpConfigAcaoController implements Initializable{
    @FXML
    private GridPane PopUpConfigAcao;
    @FXML
    public void FecharPopUpConfigAcao() throws IOException {
        Stage stage = (Stage) PopUpConfigAcao.getScene().getWindow();
        stage.close();
    }

    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     
    
    }
}