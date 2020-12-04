/**
 * Mitchell Foley
 * December 4th, 2020
 *
 * APIUtilities.java
 *
 * This class is whats used to search the api and return the query.
 * It returns it into a file called animeSearch.json and is in the
 * JSONFiles folder.
 *
 * This class holds all the key info about the api.
 */
package Utilities;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;
import java.nio.file.Paths;

public class APIUtilities {
    public static void getAnimeFromSearch(String searchText) throws IOException, InterruptedException {

        String newSearchText = searchText.replaceAll(" ", "%20");

        String searchURL = "https://jikan1.p.rapidapi.com/search/anime?q="+newSearchText;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(searchURL))
                .header("x-rapidapi-key", "bb41867480msh767ee94b1aaad1fp1fd276jsn6d94ccedffc6")
                .header("x-rapidapi-host", "jikan1.p.rapidapi.com")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<Path> response = client.send(request, HttpResponse.BodyHandlers.ofFile(Paths.get("./src/JSONFiles/animeSearch.json")));
        //System.out.println(newSearchText);
    }
}
