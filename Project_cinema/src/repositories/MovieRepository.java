package repositories;

import models.Movie;
import java.util.ArrayList;
import java.util.List;

public class MovieRepository {
    private List<Movie> movies;

    public MovieRepository() {
        this.movies = new ArrayList<>();
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public void updateMovie(String movieID, Movie updatedMovie) {
        for (int i = 0; i < movies.size(); i++) {
            if (movies.get(i).getMovieID().equals(movieID)) {
                movies.set(i, updatedMovie);
                return;
            }
        }
    }

    public void removeMovie(String movieID) {
        movies.removeIf(movie -> movie.getMovieID().equals(movieID));
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
        return null;
    }
}
