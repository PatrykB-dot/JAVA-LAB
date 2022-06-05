package pl.lublin.wsei.java.cwiczenia.lab_2new;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(Main.class.getResource("gusInfoGraphic.fxml"));
        Scene scene = new Scene(loader.load(), 800, 700);
        Controller controller = loader.getController();
        controller.setHostServices(this.getHostServices());
        controller.setStage(stage);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}