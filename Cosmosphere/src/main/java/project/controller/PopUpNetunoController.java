package project.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
public class PopUpNetunoController implements Initializable {
    @FXML
    private BorderPane PopUpNetuno;

    @FXML
    public void fecharPopUpNetuno() throws IOException {
        Stage stage = (Stage) PopUpNetuno.getScene().getWindow();
        stage.close();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
