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
public class PopUpNetunoController implements Initializable {
    @FXML
    private BorderPane PopUpNetuno;

    @FXML
    public void fecharPopUpNetuno() throws IOException {
        Stage stage = (Stage) PopUpNetuno.getScene().getWindow();
        stage.close();
    }
   
    @FXML
    public void AbrirCuriosidadesNetuno() throws IOException {
        URL url = App.class.getResource("PopUpNetuno.fxml");
        FXMLLoader fxml = new FXMLLoader(url);
        Parent raiz = fxml.load();
        
        Stage stage = (Stage) PopUpNetuno.getScene().getWindow();
        stage.setScene(new Scene(raiz));
        stage.setTitle("Cosmosphere - curiosidades Mercurio");
        stage.show();
    
    }  
    
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
