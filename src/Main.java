/**
 * Mitchell Foley
 * Dec 4th, 2020
 *
 * Main.java
 *
 * This just launches the JavaFX program and adds an icon to the scene.
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Views/AnimeLookup.fxml"));
        Scene scene = new Scene(root);

        Image Icon = new Image("searchIcon.png");
        primaryStage.getIcons().add(Icon);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Anime Lookup");
        primaryStage.show();
    }
}

