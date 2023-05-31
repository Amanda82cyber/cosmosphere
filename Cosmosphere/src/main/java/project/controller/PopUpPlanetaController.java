package project.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import project.cosmosphere.Planetas;
import project.cosmosphere.App;

public class PopUpPlanetaController implements Initializable {
  @FXML
  private Text nome;
  
  @FXML
  private ImageView imagem;
  
  @FXML
  private Text diametro;
  
  @FXML
  private Text area;
  
  @FXML
  private Text massa;
  
  @FXML
  private Text distanciaSol;
  
  @FXML
  private Text sateliteNatural;
  
  @FXML
  private Text periodoRotacao;
  
  @FXML
  private Text periodoTranslacao;
  
  @FXML
  private Text temperatura;
  
  @FXML
  private Text populacao;
  
  @FXML
  private Text idade;
  
  @FXML
  private Label curiosidade0;
  
  @FXML
  private Label curiosidade1;
  
  @FXML
  private Label curiosidade2;
  
  @FXML
  private Label curiosidade3;
  
  @FXML
  private Label curiosidade4;
  
  @FXML
  private Label curiosidade5;
  
  @FXML
  private GridPane gridInformacoes;
  
  @FXML
  private GridPane gridCuriosidades;
  
  @FXML
  private Button botaoInformacoes;
  
  @FXML
  private Button botaoCuriosidades;
  
  public void preencherTela(Planetas planeta) {
    nome.setText(planeta.getNome().toUpperCase());
    imagem.setImage(new Image(App.class.getResourceAsStream(planeta.getImagem())));
    diametro.setText(planeta.getDiametro().toUpperCase());
    area.setText(planeta.getArea().toUpperCase());
    massa.setText(planeta.getMassa().toUpperCase());
    distanciaSol.setText(planeta.getDistanciaSolFormatado());
    sateliteNatural.setText(planeta.getSateliteNatural().toUpperCase());
    periodoRotacao.setText(planeta.getPeriodoRotacaoFormatado());
    periodoTranslacao.setText(planeta.getPeriodoTranslacaoFormatado());
    temperatura.setText(planeta.getTemperatura().toUpperCase());
    populacao.setText(planeta.getPopulacao().toUpperCase());
    idade.setText(planeta.getIdade().toUpperCase());
    
    if(planeta.getCuriosidades(0) != null) {
       curiosidade0.setText(planeta.getCuriosidades(0));
    }
    
    if(planeta.getCuriosidades(1) != null) {
       curiosidade1.setText(planeta.getCuriosidades(1));
    }
    
    if(planeta.getCuriosidades(2) != null) {
       curiosidade2.setText(planeta.getCuriosidades(2));
    }
    
    if(planeta.getCuriosidades(3) != null) {
       curiosidade3.setText(planeta.getCuriosidades(3));
    }
    
    if(planeta.getCuriosidades(4) != null) {
       curiosidade4.setText(planeta.getCuriosidades(4));
    }
    
    if(planeta.getCuriosidades(5) != null) {
       curiosidade5.setText(planeta.getCuriosidades(5));
    }
  }

  @FXML
  public void setVisibleGridInformacoes() throws IOException {
    gridInformacoes.setVisible(true);
    gridInformacoes.setManaged(true);
    gridCuriosidades.setVisible(false);
    gridCuriosidades.setManaged(false);
    botaoInformacoes.getStyleClass().add("active");
    botaoCuriosidades.getStyleClass().remove("active");
  }
  
  @FXML
  public void setVisibleGridCuriosidades() throws IOException {
    gridInformacoes.setVisible(false);
    gridInformacoes.setManaged(false);
    gridCuriosidades.setVisible(true);
    gridCuriosidades.setManaged(true);
    botaoInformacoes.getStyleClass().remove("active");
    botaoCuriosidades.getStyleClass().add("active");
  }
  
  @Override
  public void initialize(URL url, ResourceBundle rb) {
    gridCuriosidades.setVisible(false);
    gridCuriosidades.setManaged(false);
  }  
}
