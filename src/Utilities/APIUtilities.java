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
        String searchURL = "https://jikan1.p.rapidapi.com/search/anime?q="+searchText;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(searchURL))
                .header("x-rapidapi-key", "bb41867480msh767ee94b1aaad1fp1fd276jsn6d94ccedffc6")
                .header("x-rapidapi-host", "jikan1.p.rapidapi.com")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<Path> response = client.send(request, HttpResponse.BodyHandlers.ofFile(Paths.get("animeSearch.json")));
    }
}
