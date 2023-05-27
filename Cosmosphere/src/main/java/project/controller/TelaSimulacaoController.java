package project.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
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
    @FXML
    private ImageView Marte;

    @FXML
    private ImageView Mercurio;

    @FXML
    private ImageView Netuno;

    @FXML
    private ImageView Saturno;

    @FXML
    private ImageView Terra;

    @FXML
    private ImageView Urano;

    @FXML
    private ImageView Venus;

    @FXML
    private ImageView Jupiter;
    
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
    public void abrirpopUpPlaneta() throws IOException {
        URL url = App.class.getResource("TelaSimulacao.fxml");
        FXMLLoader fxml = new FXMLLoader(url);
        Parent raiz = fxml.load();
        
        Scene cena = new Scene(raiz);
        
        Stage stage = new Stage();
        stage.initModality(Modality.WINDOW_MODAL);
        stage.setTitle("Planeta Terra");
        stage.setScene(cena);
        
        stage.sizeToScene();
        stage.setResizable(false);
        
        stage.show();
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
    
    @FXML
    public void PopUpAbrirMercurio() throws IOException {
        URL url = App.class.getResource("PopUpMercurio.fxml");
        FXMLLoader fxml = new FXMLLoader(url);
        Parent raiz = fxml.load();
        
        Scene cena = new Scene(raiz);
        
        Stage stage = new Stage();
        stage.initModality(Modality.WINDOW_MODAL);
        stage.setTitle("PopUpMercurio");
        stage.setScene(cena);
        
        stage.sizeToScene();
        stage.setResizable(false);
        
        stage.show();
    }
    
    @FXML
    public void PopUpAbrirVenus() throws IOException {
        URL url = App.class.getResource("PopUpVenus.fxml");
        FXMLLoader fxml = new FXMLLoader(url);
        Parent raiz = fxml.load();
        
        Scene cena = new Scene(raiz);
        
        Stage stage = new Stage();
        stage.initModality(Modality.WINDOW_MODAL);
        stage.setTitle("PopUpVenus");
        stage.setScene(cena);
        
        stage.sizeToScene();
        stage.setResizable(false);
        
        stage.show();
    }
    
    @FXML
    public void PopUpAbrirTerra() throws IOException {
        URL url = App.class.getResource("PopUpTerra.fxml");
        FXMLLoader fxml = new FXMLLoader(url);
        Parent raiz = fxml.load();
        
        Scene cena = new Scene(raiz);
        
        Stage stage = new Stage();
        stage.initModality(Modality.WINDOW_MODAL);
        stage.setTitle("PopUpTerra");
        stage.setScene(cena);
        
        stage.sizeToScene();
        stage.setResizable(false);
        
        stage.show();
    }
    
    @FXML
    public void PopUpAbrirMarte() throws IOException {
        URL url = App.class.getResource("PopUpMarte.fxml");
        FXMLLoader fxml = new FXMLLoader(url);
        Parent raiz = fxml.load();
        
        Scene cena = new Scene(raiz);
        
        Stage stage = new Stage();
        stage.initModality(Modality.WINDOW_MODAL);
        stage.setTitle("PopUpMarte");
        stage.setScene(cena);
        
        stage.sizeToScene();
        stage.setResizable(false);
        
        stage.show();
    }
    
    @FXML
    public void PopUpAbrirJupiter() throws IOException {
        URL url = App.class.getResource("PopUpJupiter.fxml");
        FXMLLoader fxml = new FXMLLoader(url);
        Parent raiz = fxml.load();
        
        Scene cena = new Scene(raiz);
        
        Stage stage = new Stage();
        stage.initModality(Modality.WINDOW_MODAL);
        stage.setTitle("PopUpJupiter");
        stage.setScene(cena);
        
        stage.sizeToScene();
        stage.setResizable(false);
        
        stage.show();
    }
    
    @FXML
    public void PopUpAbrirSaturno() throws IOException {
        URL url = App.class.getResource("PopUpSaturno.fxml");
        FXMLLoader fxml = new FXMLLoader(url);
        Parent raiz = fxml.load();
        
        Scene cena = new Scene(raiz);
        
        Stage stage = new Stage();
        stage.initModality(Modality.WINDOW_MODAL);
        stage.setTitle("PopUpSaturno");
        stage.setScene(cena);
        
        stage.sizeToScene();
        stage.setResizable(false);
        
        stage.show();
    }
    
    @FXML
    public void PopUpAbrirUrano() throws IOException {
        URL url = App.class.getResource("PopUpUrano.fxml");
        FXMLLoader fxml = new FXMLLoader(url);
        Parent raiz = fxml.load();
        
        Scene cena = new Scene(raiz);
        
        Stage stage = new Stage();
        stage.initModality(Modality.WINDOW_MODAL);
        stage.setTitle("PopUpUrano");
        stage.setScene(cena);
        
        stage.sizeToScene();
        stage.setResizable(false);
        
        stage.show();
    }
    
    @FXML
    public void PopUpAbrirNetuno() throws IOException {
        URL url = App.class.getResource("PopUpNetuno.fxml");
        FXMLLoader fxml = new FXMLLoader(url);
        Parent raiz = fxml.load();
        
        Scene cena = new Scene(raiz);
        
        Stage stage = new Stage();
        stage.initModality(Modality.WINDOW_MODAL);
        stage.setTitle("PopUpNetuno");
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
