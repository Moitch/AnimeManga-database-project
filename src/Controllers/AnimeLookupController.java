/**
 * Mitchell Foley
 * December 4th, 2020
 *
 * AnimeLookupController.java
 *
 * In the initialize method, a event listener is created for the listView.
 * This is used to display the updated image every time the user changes
 * the anime selection. (It also enables the view details button).
 *
 * updateLabels() is just a small function that returns how many animes
 * were grabbed from the search. (capped at 50).
 *
 * getAnimes() is the method that populates the listView. It takes all the values
 * from the JSON file and turns them into AnimeInfo objects so they can be read
 * as a normal string.
 *
 * changeToDetailedView() is the method that is used to change scenes to the
 * more detailed view of the anime that is selected.
 */
package Controllers;

import Models.AnimeInfo;
import Utilities.APIUtilities;
import Utilities.JSONFileUtility;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class AnimeLookupController implements Initializable {

    @FXML
    private ListView<AnimeInfo> anime_listView;

    @FXML
    private Label animesFound_label;

    @FXML
    private TextField anime_textField;

    @FXML
    private Button animeInfo_button;

    @FXML
    private Button viewDetails_button;

    @FXML
    private ImageView anime_imageView;

    @Override
    public void initialize(URL location, ResourceBundle resources) {


        anime_listView.getSelectionModel().selectedItemProperty().addListener((obs, oldValue, animeSelected) -> {
            anime_imageView.setImage(new Image(animeSelected.getImage_url()));
            viewDetails_button.setDisable(false);
        });
        updateLabels();
    }

    private void updateLabels(){
        animesFound_label.setText("Animes Returned: " + anime_listView.getItems().size());
    }

    @FXML
    private void getAnimes(){
        anime_listView.getItems().clear();
        try {
            APIUtilities.getAnimeFromSearch(anime_textField.getText());
            anime_listView.getItems().addAll(JSONFileUtility.getAnimeList("./src/JSONFiles/animeSearch.json"));

        } catch (IOException e){
            e.printStackTrace();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        updateLabels();
    }

    public void changeToDetailedView(ActionEvent event) throws IOException {


            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/Views/AnimeDetails.fxml"));
            Parent animeDetailsParent = loader.load();

            Scene animeDetailsScene = new Scene(animeDetailsParent);

            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

            window.setTitle("Anime Detailed View");
            window.setScene(animeDetailsScene);
            window.show();

            AnimeDetailsController controller = loader.getController();
            controller.initData(anime_listView.getSelectionModel().getSelectedItem());

    }
}
