package controllers;

import models.Movie;
import services.MovieService;

import java.util.List;

public class MovieController {
    private MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    public void addMovie(Movie movie) {
        movieService.addMovie(movie);
        System.out.println("Movie successfully added: " + movie.getMovieName());
    }

    public void updateMovie(String movieID, Movie updatedMovie) {
        movieService.updateMovie(movieID, updatedMovie);
    }

    public void removeMovie(String movieID) {
        movieService.removeMovie(movieID);
        System.out.println("Movie successfully removed with ID: " + movieID);
    }

    public void displayAllMovies() {
        List<Movie> movies = movieService.getAllMovies();
        for (Movie movie : movies) {
            System.out.println("Movie ID: " + movie.getMovieID() + ", Name: " + movie.getMovieName());
        }
    }

    public void findMovieByID(String movieID) {
        Movie movie = movieService.findMovieByID(movieID);
        if (movie != null) {
            System.out.println("Found Movie: " + movie.getMovieName());
        } else {
            System.out.println("Movie not found with ID: " + movieID);
        }
    }
}
