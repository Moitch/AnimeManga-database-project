package Models;

import com.google.gson.annotations.SerializedName;

public class AnimeInfo {
    /*
    SerializedName wouldn't work for me, If you just point of what i did wrong with
    one look then I would like to know but if not don't worry about it.
     */
    /*@SerializedName("ID")
    private int mal_id;

    @SerializedName("Score")
    private double score;

    @SerializedName("Members")
    private int members;

    @SerializedName("Episodes")
    private int episodes;

    @SerializedName("URL")
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
    private boolean airing;*/

    private int mal_id;
    private double score;
    private int members;
    private int episodes;

    private String url;
    private String image_url;
    private String title;
    private String synopsis;
    private String type;
    private String start_date;
    private String end_date;
    private String rated;

    private boolean airing;

    public AnimeInfo(int mal_id, double score, int members, int episodes, String url, String image_url, String title, String synopsis, String type, String start_date, String end_date, String rated, boolean airing) {
        setMal_id(mal_id);
        setScore(score);
        setMembers(members);
        setEpisodes(episodes);
        setUrl(url);
        setImage_url(image_url);
        setTitle(title);
        setSynopsis(synopsis);
        setType(type);
        setStart_date(start_date);
        setEnd_date(end_date);
        setRated(rated);
        setAiring(airing);
    }

    public int getMal_id() {
        return mal_id;
    }

    public void setMal_id(int mal_id) {
        this.mal_id = mal_id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getMembers() {
        return members;
    }

    public void setMembers(int members) {
        this.members = members;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
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

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
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
    public String toString(){
        return String.format("%s, has a score of %.2f", this.title, this.score);
    }
}
