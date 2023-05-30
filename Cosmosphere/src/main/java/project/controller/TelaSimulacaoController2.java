package project.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Sphere;
import javafx.stage.Modality;
import javafx.stage.Stage;
import project.cosmosphere.App;

public class TelaSimulacaoController2 implements Initializable { 
    @FXML
    private GridPane telaSimulacao;
    
    @FXML
    private Sphere mercurio;
    
    @FXML
    private Sphere venus;
    
    @FXML
    private Sphere terra;
    
    @FXML
    private Sphere marte;

    @FXML
    private Sphere jupiter;

    @FXML
    private Sphere saturno;

    @FXML
    private Sphere urano;
    
    @FXML
    private Sphere netuno;

    // ACTIONS
    @FXML
    public void voltarTelaInicialSimulacao() throws IOException {
        URL url = App.class.getResource("TelaInicial.fxml");
        FXMLLoader fxml = new FXMLLoader(url);
        Parent raiz = fxml.load();
        
        Stage stage = (Stage)telaSimulacao.getScene().getWindow();
        stage.setScene(new Scene(raiz));
        stage.setTitle("Cosmosphere - Tela Inicial");
        stage.show();
    }
    
    @FXML
    public void popUpPlaneta(ActionEvent event) throws IOException {
//      System.out.println(event.getSource());
        URL url = App.class.getResource("PopUpPlaneta.fxml");
        FXMLLoader fxml = new FXMLLoader(url);
        Parent raiz = fxml.load();
        
        PopUpPlanetaController planetaController = fxml.getController();
        
        Scene cena = new Scene(raiz);
        
        Stage stage = new Stage();
        stage.initModality(Modality.WINDOW_MODAL);
        stage.setTitle("PopUpPlaneta");
        stage.setScene(cena);
        
        stage.sizeToScene();
        stage.setResizable(false);
        
        stage.show();
    }
    
    @FXML
    public void popUpConfiguracao() throws IOException {
        URL url = App.class.getResource("PopUpConfiguracoes.fxml");
        FXMLLoader fxml = new FXMLLoader(url);
        Parent raiz = fxml.load();
        
        Scene cena = new Scene(raiz);
        
        Stage stage = new Stage();
        stage.initModality(Modality.WINDOW_MODAL);
        stage.setTitle("Cosmosphere - Configurações");
        stage.setScene(cena);
        
        stage.sizeToScene();
        stage.setResizable(false);
        
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
