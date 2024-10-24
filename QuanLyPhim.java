/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlyrapchieuphim2;

/**
 *
 * @author ADMIN
 */
public class QuanLyPhim {
    private String MovieName, Genre,Directors, ActorsAndActresses;

    public QuanLyPhim(String MovieName, String Genre, String Directors, String ActorsAndActresses) {
        this.MovieName = MovieName;
        this.Genre = Genre;
        this.Directors = Directors;
        this.ActorsAndActresses = ActorsAndActresses;
    }
    public String setMovieName() {
        return MovieName;
    }
    public String setGenre() {
        return Genre;
    }
    public String setDirectors() {
        return Directors;
    }
    public String setActorsAndActresses() {
        return ActorsAndActresses;
    }
}
