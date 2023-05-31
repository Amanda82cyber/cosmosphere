package project.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import project.cosmosphere.Planetas;

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
  
  public void preencherTela(Planetas planeta) {
    nome.setText(planeta.getNome());
    imagem.setImage(new Image(getClass().getResourceAsStream("terra.png")));
    diametro.setText(planeta.getDiametro());
    area.setText(planeta.getArea());
    massa.setText(planeta.getMassa());
    sateliteNatural.setText(planeta.getSateliteNatural());
    periodoRotacao.setText(planeta.getPeriodoRotacaoFormatado());
    periodoTranslacao.setText(planeta.getPeriodoTranslacaoFormatado());
    temperatura.setText(planeta.getTemperatura());
    populacao.setText(planeta.getPopulacao());
    idade.setText(planeta.getIdade());
  }

  @Override
  public void initialize(URL url, ResourceBundle rb) {
    // TODO
  }  
}
