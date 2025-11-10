package com.ZorroMovies.movies;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies")
public class movie {
    @Id
    private ObjectId id;

    private String imdbId;

    private String title;

    private String releaseDate;

    private String trailerLink;

    private String poster;

    private List<String> genres;

    private List<String> backdrops;

    @DocumentReference()
    private List<String> reviewIds;

    // no Args constructor
    public movie() {}

    // all Args constructor
    public movie(ObjectId id, String imdbId, String title, String releaseDate, String trailerLink, String poster, List<String> genres, List<String> backdrops){
        this.id = id;
        this.imdbId = imdbId;
        this.title = title;
        this.releaseDate = releaseDate;
        this.trailerLink = trailerLink;
        this.poster = poster;
        this.genres = genres;
        this.backdrops = backdrops;
    }

    public ObjectId get_id(){ return id; }
    public void set_id(ObjectId id) { this.id = id; }

    public String get_imdbId() { return imdbId; }
    public void set_imdb_id(String imdbId) { this.imdbId = imdbId; }

    public String get_title() { return title; }
    public void set_title(String title) { this.title = title; }

    public String get_releaseDate() { return releaseDate; }
    public void set_releaseDate(String releaseDate) { this.releaseDate = releaseDate; }

    public String get_trailerLink() { return trailerLink; }
    public void set_trailerLink(String trailerLink) { this.trailerLink=trailerLink; }

    public String get_poster() { return poster; }
    public void set_poster(String poster) { this.poster = poster; }

    public List<String> get_genres() { return genres; }
    public void set_genres( List<String> genres) { this.genres = genres; }

    public List<String> get_backdrops() { return backdrops; }
    public void set_backdrops( List<String> backdrops) { this.backdrops = backdrops; }

    public List<String> get_reviewIds() { return reviewIds; }
    public void set_reviewIds( List<String> reviewIds) { this.reviewIds = reviewIds; }

    @Override
    public String toString(){
        return "Movie{" +
                "id=" + id +
                ", imdbId='" + imdbId + '\'' +
                ", title='" + title + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", trailerLink='" + trailerLink + '\'' +
                ", poster='" + poster + '\'' +
                ", genres=" + genres +
                ", backdrops=" + backdrops +
                '}';    }
}
