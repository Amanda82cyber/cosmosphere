package project.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Sphere;
import javafx.stage.Modality;
import javafx.stage.Stage;
import project.cosmosphere.App;
import project.cosmosphere.Jupiter;
import project.cosmosphere.Marte;
import project.cosmosphere.Mercurio;
import project.cosmosphere.Netuno;
import project.cosmosphere.Planetas;
import project.cosmosphere.Saturno;
import project.cosmosphere.Terra;
import project.cosmosphere.Urano;
import project.cosmosphere.Venus;

public class TelaSimulacaoController implements Initializable {
  @FXML
  private GridPane TelaSimulacao;
  
  @FXML
  private Sphere mercurio;
  
  @FXML
  private Sphere venus;
  
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
  
  @FXML
  private Sphere terra;

  // ACTIONS
  @FXML
  public void voltarTelaInicialSimulacao() throws IOException {
    URL url = App.class.getResource("TelaInicial.fxml");
    FXMLLoader fxml = new FXMLLoader(url);
    Parent raiz = fxml.load();

    Stage stage = (Stage) TelaSimulacao.getScene().getWindow();
    stage.setScene(new Scene(raiz));
    stage.setTitle("Cosmosphere - Tela Inicial");
    stage.show();
  }

  @FXML
  public void popUpPlaneta(MouseEvent event) throws IOException {
    URL url = App.class.getResource("PopUpPlaneta.fxml");
    FXMLLoader fxml = new FXMLLoader(url);
    Parent raiz = fxml.load();
    
    Planetas objeto = null;
    
    Sphere esfera = (Sphere) event.getSource();
      
    switch (esfera.getId()) {
      case "terra":
        objeto = new Terra();
        break;
      case "mercurio":
        objeto = new Mercurio();
        break;
      case "venus":
        objeto = new Venus();
        break;
      case "marte":
        objeto = new Marte();
        break;
      case "jupiter":
        objeto = new Jupiter();
        break;
      case "saturno": 
        objeto = new Saturno();
        break;
      case "urano":
        objeto = new Urano();
        break;
      case "netuno":
        objeto = new Netuno();
        break;
      default:
        break;
    }

    PopUpPlanetaController planetaController = fxml.getController();
    planetaController.preencherTela(objeto);

    Scene cena = new Scene(raiz);

    Stage stage = new Stage();
    stage.initModality(Modality.WINDOW_MODAL);
    stage.setTitle("Cosmosphere - Planeta");
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
    // Mercurio
    PhongMaterial phongMercurio = new PhongMaterial();
    phongMercurio.setDiffuseMap(new Image(App.class.getResourceAsStream("mercurio.png")));
    mercurio.setMaterial(phongMercurio);
    
    // Venus
    PhongMaterial phongVenus = new PhongMaterial();
    phongVenus.setDiffuseMap(new Image(App.class.getResourceAsStream("venus.png")));
    venus.setMaterial(phongVenus);
    
    // Terra
    PhongMaterial phongTerra = new PhongMaterial();
    phongTerra.setDiffuseMap(new Image(App.class.getResourceAsStream("terra.png")));
    terra.setMaterial(phongTerra);
    
    // Marte
    PhongMaterial phongMarte = new PhongMaterial();
    phongMarte.setDiffuseMap(new Image(App.class.getResourceAsStream("marte.png")));
    marte.setMaterial(phongMarte);
    
    // Jupiter
    PhongMaterial phongJupiter = new PhongMaterial();
    phongJupiter.setDiffuseMap(new Image(App.class.getResourceAsStream("jupiter.png")));
    jupiter.setMaterial(phongJupiter);
    
    // Saturno
    /*
    PhongMaterial phongSaturno = new PhongMaterial();
    phongSaturno.setDiffuseMap(new Image(App.class.getResourceAsStream("saturno.png")));
    saturno.setMaterial(phongSaturno);
    */
    
    // Urano
    /*
    PhongMaterial phongUrano = new PhongMaterial();
    phongUrano.setDiffuseMap(new Image(App.class.getResourceAsStream("urano.png")));
    urano.setMaterial(phongUrano);
    */
    
    // Netuno
    PhongMaterial phongNetuno = new PhongMaterial();
    phongNetuno.setDiffuseMap(new Image(App.class.getResourceAsStream("netuno.png")));
    netuno.setMaterial(phongNetuno);
  }
}
