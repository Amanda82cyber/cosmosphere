package project.cosmosphere;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

/**
 * JavaFX App
 */
public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        URL url = getClass().getResource("TelaInicial.fxml");
        Parent raiz = FXMLLoader.load(url);
        
        Scene cena = new Scene(raiz);
        
        stage.setTitle("Cosmosphere");
        stage.setScene(cena);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}