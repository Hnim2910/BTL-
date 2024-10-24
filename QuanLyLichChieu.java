/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlyrapchieuphim2;

/**
 *
 * @author ADMIN
 */
public class QuanLyLichChieu {
    private String MovieName, GioChieu, NgayChieu;
    private int PhongChieu;

    public QuanLyLichChieu(String MovieName, String GioChieu,int PhongChieu, String NgayChieu) {
        this.MovieName = MovieName;
        this.GioChieu = GioChieu;
        this.NgayChieu = NgayChieu;
        this.PhongChieu = PhongChieu;
    }

    public String setMovieName() {
        return MovieName;
    }

    public String setGioChieu() {
        return GioChieu;
    }

    public String setNgayChieu() {
        return NgayChieu;
    }

    public int setPhongChieu() {
        return PhongChieu;
    }
    
}
