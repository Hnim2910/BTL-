package models;

import java.util.Date;

public class Movie {
    private String movieID;
    private String movieName;
    private String genre;
    private String director;
    private String actors;
    private Date releaseDate;
    private float rating;
    private int duration;

    public Movie(String movieID, String movieName, String genre, String director, String actors, Date releaseDate, float rating, int duration) {
        this.movieID = movieID;
        this.movieName = movieName;
        this.genre = genre;
        this.director = director;
        this.actors = actors;
        this.releaseDate = releaseDate;
        this.rating = rating;
        this.duration = duration;
    }

    public String getMovieID() {
        return movieID;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getGenre() {
        return genre;
    }

    public String getDirector() {
        return director;
    }

    public String getActors() {
        return actors;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public float getRating() {
        return rating;
    }

    public int getDuration() {
        return duration;
    }
}
