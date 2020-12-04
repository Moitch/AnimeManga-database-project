package Utilities;

import Models.AnimeInfo;
import Models.SearchResult;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class JSONFileUtility {
    /**
     * This method will return an ArrayList of AnimeInfo objects
     * derived from the specified JSON File.
     */
    public static ArrayList<AnimeInfo> getAnimeList(String jsonFileName){
        ArrayList<AnimeInfo> animes = new ArrayList<>();
        Gson gson = new Gson();

        try(
                FileReader fileReader = new FileReader(jsonFileName);
                JsonReader jsonReader = new JsonReader(fileReader);
        )
        {

            SearchResult searchResult = gson.fromJson(jsonReader, SearchResult.class);
            animes.addAll(Arrays.asList(searchResult.getAnimes()));

        } catch (IOException e) {
            e.printStackTrace();
        }

        return animes;
    }
}
