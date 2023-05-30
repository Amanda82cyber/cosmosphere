package project.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import project.cosmosphere.App;

/**
 * FXML Controller class
 *
 * @author User
 */
public class PopUpVenusController implements Initializable {

    @FXML
    private BorderPane PopUpVenus;

    @FXML
    public void fecharPopUpVenus() throws IOException {
        Stage stage = (Stage) PopUpVenus.getScene().getWindow();
        stage.close();
    }
    @FXML
    public void AbrirCuriosidadesVenus() throws IOException {
        URL url = App.class.getResource("PopUpVenus.fxml");
        FXMLLoader fxml = new FXMLLoader(url);
        Parent raiz = fxml.load();
        Stage stage = (Stage) PopUpVenus.getScene().getWindow();
        stage.setScene(new Scene(raiz));
        stage.setTitle("Cosmosphere - curiosidades Mercurio");
        stage.show();
    
    }  
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
