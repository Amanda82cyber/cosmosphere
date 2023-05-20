package project.controller;

import project.cosmosphere.App;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class TelaInicialController implements Initializable {
    @FXML
    private BorderPane telaInicial;
    
    @FXML
    public void abrirTelaSimulacao() throws IOException {
        URL url = App.class.getResource("TelaSimulacao.fxml");
        FXMLLoader fxml = new FXMLLoader(url);
        Parent raiz = fxml.load();
        
        Stage stage = (Stage) telaInicial.getScene().getWindow();
        stage.setScene(new Scene(raiz));
        stage.setTitle("Cosmosphere - Simulação");
        stage.show();
    }
    
    @FXML
    public void abrirTelaCreditos() throws IOException {
        URL url = App.class.getResource("TelaCreditos.fxml");
        FXMLLoader fxml = new FXMLLoader(url);
        Parent raiz = fxml.load();
        
        Stage stage = (Stage) telaInicial.getScene().getWindow();
        stage.setScene(new Scene(raiz));
        stage.setTitle("Cosmosphere - Créditos");
        stage.show();
    }
    
    @FXML
    public void popUpSair() throws IOException {
        URL url = App.class.getResource("PopUpSair.fxml");
        FXMLLoader fxml = new FXMLLoader(url);
        Parent raiz = fxml.load();
        
        Scene cena = new Scene(raiz);
        
        Stage stage = new Stage();
        stage.initModality(Modality.WINDOW_MODAL);
        stage.setTitle("Pop-up Sair");
        stage.setScene(cena);
        
        stage.sizeToScene();
        stage.setResizable(false);
        
        stage.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
