import Models.AnimeInfo;
import Utilities.APIUtilities;
import Utilities.JSONFileUtility;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class Main extends Application {
    public static void main(String[] args) {
//        ArrayList<AnimeInfo> animes = new ArrayList<>();
//       try {
//           APIUtilities.getAnimeFromSearch("Attack On Titan");
//           animes = JSONFileUtility.getAnimeList("./src/JSONFiles/animeSearch.json");
//       } catch (IOException e){
//           e.printStackTrace();
//       } catch (InterruptedException e){
//           e.printStackTrace();
//       }
//       System.out.println();

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Views/AnimeLookup.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Anime Lookup");
        primaryStage.show();
    }
}

