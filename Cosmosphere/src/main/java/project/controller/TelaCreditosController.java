package project.controller;

import project.cosmosphere.App;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;
import java.awt.Desktop;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class TelaCreditosController implements Initializable {    
    @FXML
    private BorderPane telaCreditos;
    
    @FXML
    public void abrirLinkedinAdilson() throws IOException, URISyntaxException {
        Desktop.getDesktop().browse(new URI("https://www.linkedin.com/in/adilson-tavares-rocha/"));
    }
    
    @FXML
    public void abrirLinkedinAmanda() throws IOException, URISyntaxException {
        Desktop.getDesktop().browse(new URI("https://www.linkedin.com/in/amanda-moreira-8131381a2/"));
    }
    
    @FXML
    public void abrirLinkedinJoao() throws IOException, URISyntaxException {
        Desktop.getDesktop().browse(new URI("https://www.linkedin.com/in/jv-maciel/"));
    }
    
    @FXML
    public void abrirLinkedinLuis() throws IOException, URISyntaxException {
        Desktop.getDesktop().browse(new URI("https://www.linkedin.com/in/luis-zucato/"));
    }
    
    @FXML
    public void voltarTelaInicial() throws IOException {
        URL url = App.class.getResource("TelaInicial.fxml");
        FXMLLoader fxml = new FXMLLoader(url);
        Parent raiz = fxml.load();
        
        Stage stage = (Stage) telaCreditos.getScene().getWindow();
        stage.setScene(new Scene(raiz));
        stage.setTitle("Cosmosphere - Tela Inicial");
        stage.show();
    }
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
