/**
 * Mitchell Foley
 * December 4th, 2020
 *
 * AnimeDetailsController.java
 *
 * Takes the selected anime from AnimeLookup and then uses it to create an
 * interface that displays the information on the anime.
 *
 * loadDetailedView() is the function that sets all the labels to
 * the animes values, as well loads the image into an ImageView.
 *
 * changeToLookupView() is a method that changes scenes. It changes the scene
 * back to the AnimeLookup.fxml view.
 */
package Controllers;

import Models.AnimeInfo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AnimeDetailsController implements Initializable {

    @FXML
    private Label animeTitle_label;

    @FXML
    private Label animeRated_label;

    @FXML
    private Label releaseDate_label;

    @FXML
    private Label episodes_label;

    @FXML
    private Label animeType_label;

    @FXML
    private Label malScore_label;

    @FXML
    private ImageView anime_imageView;

    @FXML
    private Label animePlot_label;

    @FXML
    private Button goBack_button;

    private AnimeInfo anime;
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void initData(AnimeInfo selectedAnime){
        this.anime = selectedAnime;
        loadDetailedView();
    }

    private void loadDetailedView() {
        animeTitle_label.setText("" + anime.getTitle());
        animeRated_label.setText("" + anime.getRated());
        releaseDate_label.setText("" + anime.getStart_date());
        episodes_label.setText("" + anime.getEpisodes());
        animeType_label.setText("" + anime.getType());
        malScore_label.setText("" + anime.getScore());
        animePlot_label.setText("" + anime.getSynopsis());
        anime_imageView.setImage(new Image(anime.getImage_url()));
    }

    public void changeToLookupView(ActionEvent event) throws IOException {


        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/Views/AnimeLookup.fxml"));
        Parent animeLookupParent = loader.load();

        Scene animeLookupScene = new Scene(animeLookupParent);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setTitle("Anime Lookup");
        window.setScene(animeLookupScene);
        window.show();
    }

}
