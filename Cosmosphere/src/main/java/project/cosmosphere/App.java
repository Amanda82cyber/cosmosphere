package project.cosmosphere;

import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        URL url = getClass().getResource("TelaInicial.fxml");
        Parent raiz = FXMLLoader.load(url);
        
        Scene cena = new Scene(raiz);
        
        stage.setTitle("Cosmosphere - Tela Inicial");
        stage.setScene(cena);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}