package services;

import java.util.ArrayList;
import java.util.List;

import models.Movie;

public class MovieService {
    private List<Movie> movies;

    public MovieService() {
        this.movies = new ArrayList<>();
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
        System.out.println("Movie added: " + movie.getMovieName());
    }

    public void updateMovie(String movieID, Movie updatedMovie) {
        for (int i = 0; i < movies.size(); i++) {
            if (movies.get(i).getMovieID().equals(movieID)) {
                movies.set(i, updatedMovie);
                System.out.println("Movie updated: " + updatedMovie.getMovieName());
                return;
            }
        }
        System.out.println("Movie not found with ID: " + movieID);
    }

    public void removeMovie(String movieID) {
        movies.removeIf(movie -> movie.getMovieID().equals(movieID));
        System.out.println("Movie removed with ID: " + movieID);
    }

    public List<Movie> getAllMovies() {
        return movies;
    }

    public Movie findMovieByID(String movieID) {
        for (Movie movie : movies) {
            if (movie.getMovieID().equals(movieID)) {
                return movie;
            }
        }
        System.out.println("Movie not found with ID: " + movieID);
        return null;
    }
}
