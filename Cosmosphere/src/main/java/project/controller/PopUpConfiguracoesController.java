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
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import project.cosmosphere.App;

public class PopUpConfiguracoesController implements Initializable {
    
    @FXML
    private GridPane PopUpConfiguracoes;
    @FXML
    private GridPane PopUpConfigacao;

    @FXML
    public void fecharPopUpConfiguracoes() throws IOException {
        Stage stage = (Stage) PopUpConfiguracoes.getScene().getWindow();
        stage.close();
    }
    @FXML
    public void ABrirPopUpConfiguracoes() throws IOException {
        Stage stage = (Stage) PopUpConfiguracoes.getScene().getWindow();
        stage.close();
    }
    @FXML
    public void ABrirPopUpConfigAcao() throws IOException {
       URL url = App.class.getResource("PopUpConfigAcao.fxml");
        FXMLLoader fxml = new FXMLLoader(url);
        Parent raiz = fxml.load();
        
        Stage stage = (Stage) PopUpConfiguracoes.getScene().getWindow();
        stage.setScene(new Scene(raiz));
        stage.setTitle("Cosmosphere - Ações");
        stage.show();
    }
    @FXML
    //public void SetarConfiguracoes() throws IOException {
        
        
        
        
        
    //}
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    //todo

   }
    
}