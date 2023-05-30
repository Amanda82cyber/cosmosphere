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


public class PopUpMarteController implements Initializable {

    @FXML
    private BorderPane PopUpMarte;

    @FXML
    public void fecharPopUpMarte() throws IOException {
        Stage stage = (Stage) PopUpMarte.getScene().getWindow();
        stage.close();
    }
    @FXML
    public void AbrirCuriosidadesMarte() throws IOException {
        URL url = App.class.getResource("PopUpMarte.fxml");
        FXMLLoader fxml = new FXMLLoader(url);
        Parent raiz = fxml.load();
        
        Stage stage = (Stage) PopUpMarte.getScene().getWindow();
        stage.setScene(new Scene(raiz));
        stage.setTitle("Cosmosphere - curiosidades Marte");
        stage.show();
    
    }  
    
    
    
    
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
