package project.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import project.cosmosphere.App;

public class PopUpTerraController implements Initializable {
    @FXML
    private BorderPane PopUpTerra;

    @FXML
    public void fecharPopUpTerra() throws IOException {
        Stage stage = (Stage) PopUpTerra.getScene().getWindow();
        stage.close();
    }
    @FXML
    public void AbrirCuriosidadesTerra() throws IOException {
        URL url = App.class.getResource("PopUpTerra.fxml");
        FXMLLoader fxml = new FXMLLoader(url);
        Parent raiz = fxml.load();
        
        Stage stage = (Stage) PopUpTerra.getScene().getWindow();
        stage.setScene(new Scene(raiz));
        stage.setTitle("Cosmosphere - curiosidades Terra");
        stage.show();
    
    }  
    
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
