package Models;

import com.google.gson.annotations.SerializedName;

public class AnimeInfo {

    private double mal_id;
    @SerializedName("Score")
    private double score;
    @SerializedName("Members")
    private double members;
    @SerializedName("Episodes")
    private double episodes;

    private String url;
    @SerializedName("Poster")
    private String image_url;
    @SerializedName("Title")
    private String title;
    @SerializedName("Synopsis")
    private String synopsis;
    @SerializedName("Type")
    private String type;
    @SerializedName("Start date")
    private String start_date;
    @SerializedName("End date")
    private String end_date;
    @SerializedName("Rated")
    private String rated;

    @SerializedName("Airing")
    private boolean airing;

    public AnimeInfo(double mal_id, double score, double members, double episodes, String url, String image_url, String title, String synopsis, String type, String start_date, String end_date, String rated, boolean airing) {
        setMal_id(mal_id);
        setScore(score);
        setMembers(members);
        setEpisodes(episodes);
        setURL(url);
        setImageURL(image_url);
        setTitle(title);
        setSynopsis(synopsis);
        setType(type);
        setStartDate(start_date);
        setEndDate(end_date);
        setRated(rated);
        setAiring(airing);
    }

    public double getMal_id() {
        return mal_id;
    }

    public void setMal_id(double mal_id) {
        this.mal_id = mal_id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getMembers() {
        return members;
    }

    public void setMembers(double members) {
        this.members = members;
    }

    public double getEpisodes() {
        return episodes;
    }

    public void setEpisodes(double episodes) {
        this.episodes = episodes;
    }

    public String getURL() {
        return url;
    }

    public void setURL(String url) {
        this.url = url;
    }

    public String getImageURL() {
        return image_url;
    }

    public void setImageURL(String image_url) {
        this.image_url = image_url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStartDate() {
        return start_date;
    }

    public void setStartDate(String start_date) {
        this.start_date = start_date;
    }

    public String getEndDate() {
        return end_date;
    }

    public void setEndDate(String end_date) {
        this.end_date = end_date;
    }

    public String getRated() {
        return rated;
    }

    public void setRated(String rated) {
        this.rated = rated;
    }

    public boolean isAiring() {
        return airing;
    }

    public void setAiring(boolean airing) {
        this.airing = airing;
    }
}
