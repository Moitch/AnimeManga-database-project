/**
 * Mitchell Foley
 * December 4th, 2020
 *
 * SearchResult.java
 */
package Models;

import com.google.gson.annotations.SerializedName;

public class SearchResult {

    @SerializedName("results")
    private AnimeInfo[] animes;

    public SearchResult(AnimeInfo[] animes) {
        this.animes = animes;
    }

    public AnimeInfo[] getAnimes() {
        return animes;
    }

    public void setAnimes(AnimeInfo[] animes) {
        this.animes = animes;
    }

}
