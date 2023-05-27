
package project.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class PopUpMercurioController implements Initializable {

    @FXML
    private BorderPane PopUpMercurio;

    @FXML
    public void fecharPopUpMercurio() throws IOException {
        Stage stage = (Stage) PopUpMercurio.getScene().getWindow();
        stage.close();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
