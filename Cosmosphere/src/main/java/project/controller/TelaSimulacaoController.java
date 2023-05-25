package project.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
//import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
//import javafx.scene.paint.PhongMaterial;
//import javafx.scene.shape.Sphere;
import javafx.stage.Modality;
import javafx.stage.Stage;
import project.cosmosphere.App;

public class TelaSimulacaoController implements Initializable { 
    @FXML
    private GridPane TelaSimulacao;
    
//    @FXML
//    private Sphere mercurio;
    
    // ACTIONS
    @FXML
    public void voltarTelaInicialSimulacao() throws IOException {
        URL url = App.class.getResource("TelaInicial.fxml");
        FXMLLoader fxml = new FXMLLoader(url);
        Parent raiz = fxml.load();
        
        Stage stage = (Stage)TelaSimulacao.getScene().getWindow();
        stage.setScene(new Scene(raiz));
        stage.setTitle("Cosmosphere - Tela Inicial");
        stage.show();
    }
    
    @FXML
    public void popUpPlaneta() throws IOException {
        
    }
    
    @FXML
    public void popUpConfiguracao() throws IOException {
        
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
//        Image imgMercurio = new Image(getClass().getResourceAsStream("/project/img/mercurio.png"));
//        PhongMaterial phong = new PhongMaterial();
//        phong.setDiffuseMap(imgMercurio);
//        mercurio.setMaterial(phong);
    }    
    
}
