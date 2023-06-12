package project.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.AnimationTimer;
import javafx.animation.PathTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Sphere;
import javafx.scene.transform.Rotate;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Duration;
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
  
  @FXML
  private ImageView sol;

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
    
    Sphere esfera = (Sphere) event.getSource();
    
    Planetas objeto = pegarObjetoCorrespondente(esfera.getId());

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
    double solX = sol.getFitWidth()/2;
    double solY = (sol.getFitHeight()/2) + 600;
    
    colocarImagemPlaneta(mercurio, solX, solY);
    colocarImagemPlaneta(venus, solX, solY);
    colocarImagemPlaneta(terra, solX, solY);
    colocarImagemPlaneta(marte, solX, solY);
    colocarImagemPlaneta(jupiter, solX, solY);
    colocarImagemPlaneta(saturno, solX, solY);
    colocarImagemPlaneta(urano, solX, solY);
    colocarImagemPlaneta(netuno, solX, solY);
  }
  
  private static Planetas pegarObjetoCorrespondente(String identificador){
    switch (identificador) {
      case "terra":
        return new Terra();
      case "mercurio":
        return new Mercurio();
      case "venus":
        return new Venus();
      case "marte":
        return new Marte();
      case "jupiter":
        return new Jupiter();
      case "saturno": 
        return new Saturno();
      case "urano":
        return new Urano();
      case "netuno":
        return new Netuno();
      default:
        return null;
    }
  }
  
  private static void colocarImagemPlaneta(Sphere esfera, double solX, double solY) {
    Planetas objeto = pegarObjetoCorrespondente(esfera.getId());
    
    PhongMaterial phong = new PhongMaterial();
    phong.setDiffuseMap(new Image(App.class.getResourceAsStream(objeto.getImagemMap())));
    esfera.setMaterial(phong);
    
    esfera.setRotationAxis(Rotate.Y_AXIS);
    rodarPlaneta(objeto, esfera);
    transladarPlaneta(objeto, esfera, solX, solY);
  }
  
  private static void rodarPlaneta(Planetas planeta, Sphere esfera) {    
    AnimationTimer timer = new AnimationTimer() {
      @Override
      public void handle(long now) {
        esfera.rotateProperty().set(esfera.getRotate() + planeta.velocidadeRotacao());
      }
    };
    
    timer.start();
  }
  
  private static void transladarPlaneta(Planetas planeta, Sphere esfera, double solX, double solY) {
    double x = esfera.getLayoutX();
    double y = esfera.getLayoutY();
    
    double distanciaSolEsfera = Math.ceil(Math.sqrt(Math.pow((x-solX), 2) + Math.pow((y-solY), 2)));
    System.out.println("distanciaSolEsfera: "+ distanciaSolEsfera);
    
    Circle circle = new Circle(distanciaSolEsfera);
    circle.setLayoutX(solX - circle.getRadius());
    circle.setLayoutY(solY - circle.getRadius());
    System.out.println("X: " + circle.getLayoutX() + " Y: " + circle.getLayoutY());
    
    PathTransition transition = new PathTransition();
    transition.setNode(esfera);
    transition.setPath(circle);
    transition.setDuration(Duration.seconds(planeta.periodoTranslacaoPorMes()));
    transition.setCycleCount(PathTransition.INDEFINITE);
    transition.play();
  }
}
